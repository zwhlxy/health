package com.zz.utils;

import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * @Author zwh
 * @Date 2020/7/22 14:45
 * @Version 1.0
 * 日期工具类
 **/
public class DateUtils {


    public String dateSource(){
        InputStream inputStream = DateUtils.class.getClassLoader().getResourceAsStream("exchangedatasource.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
            String property = properties.getProperty("jdbc.DT_sqlServer.url");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 获取本月开始日期
     *
     * @return String
     **/
    private  String getMonthStart() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date time = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    /**
     * 获取本月最后一天
     *
     * @return String
     **/
    private  String getMonthEnd() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date time = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    /**
     * 获取上个月开始日期
     *
     * @return String
     **/
    private  String getLastMonthStart() {
        Calendar   cal_1=Calendar.getInstance();//获取当前日期
        cal_1.add(Calendar.MONTH, -1);
        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        return new SimpleDateFormat("yyyy-MM-dd").format(cal_1.getTime());
    }

    /**
     * 获取上个月最后一天
     *
     * @return String
     **/
    private  String getLastMonthEnd() {
        Calendar cale = Calendar.getInstance();
        cale.set(Calendar.DAY_OF_MONTH,0);//设置为1号,当前日期既为本月第一天
        return new SimpleDateFormat("yyyy-MM-dd").format(cale.getTime());
    }

    /**
     * 本月
     * @param status
     * @return
     */
    private String thisMonth(String status, String time) {
        if (!StringUtils.isEmpty(time)) {
            String monthStart = getMonthStart();
            String monthEnd = getMonthEnd();
            return "TO_CHAR(" + time + ",'yyyy-mm-dd') BETWEEN " + monthStart + " and " + monthEnd;
        } else
            return "1=1";
    }

    /**
     * 上月
     * @param status
     * @return
     */
    private String lastMonth(String status, String time) {
        if (!StringUtils.isEmpty(time)) {
            String monthStart = getLastMonthStart();
            String monthEnd = getLastMonthEnd();
            return "TO_CHAR(" + time + ",'yyyy-mm-dd') BETWEEN " + monthStart + " and " + monthEnd;
        } else
            return "1=1";
    }

    /**
     * 本周
     * @param status
     * @return
     */
    private String thisWeek(String status, String time) {
        if (!StringUtils.isEmpty(time)) {
            String monthStart = getWeekStart();
            String monthEnd = getWeekEnd();
            return "TO_CHAR(" + time + ",'yyyy-mm-dd') BETWEEN " + monthEnd + " and " + monthStart;
        } else
            return "1=1";
    }

    /**
     * 本季度
     * @param status
     * @return
     */
    private String thisSeason(String status, String time) {
        if (!StringUtils.isEmpty(time)) {
            String monthStart = getCurrentYearStartTime();
            String monthEnd = getCurrentQuarterEndTime();
            return "TO_CHAR(" + time + ",'yyyy-mm-dd') BETWEEN " + monthStart + " and " + monthEnd;
        } else
            return "1=1";
    }

    /**
     * status 0本周 1本月 2上月 3本季度 4本年度 5所有
     *编译
     * @param status
     * @param time
     * @return
     */
    public String sumUp(String status, String time) {
        String str = "";
        if ("0".equals(status)) {
            str = thisWeek(status, time);
        } else if ("1".equals(status)) {
            str = thisMonth(status, time);
        } else if ("2".equals(status)) {
            str = lastMonth(status, time);
        } else if ("3".equals(status)) {
            str = thisSeason(status, time);
        } else if ("4".equals(status)) {
            str = "TO_CHAR(" + time + ",'yyyy') = to_char(sysdate,'yyyy')";
        }
        return str;
    }

    /**
     * 获取本周的第一天
     *
     * @return String
     **/
    private  String getWeekStart() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_MONTH, 0);
        cal.set(Calendar.DAY_OF_WEEK, 2);
        Date time = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    /**
     * 获取本周的最后一天
     *
     * @return String
     **/
    private  String getWeekEnd() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, cal.getActualMaximum(Calendar.DAY_OF_WEEK));
        cal.add(Calendar.DAY_OF_WEEK, 1);
        Date time = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }


    /**
     * 当前季度的开始时间
     *
     * @return string
     */
    private  String getCurrentYearStartTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.YEAR));
        return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
    }

    /**
     * 当前季度的结束时间
     *
     * @return string
     */
    private  String getCurrentQuarterEndTime() {
        Calendar c = Calendar.getInstance();
        int currentMonth = c.get(Calendar.MONTH) + 1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String lastDayOfCurrentQuarter = null;
        try {
            if (currentMonth >= 1 && currentMonth <= 3) {
                c.set(Calendar.MONTH, 2);
                c.set(Calendar.DATE, 31);
            } else if (currentMonth >= 4 && currentMonth <= 6) {
                c.set(Calendar.MONTH, 5);
                c.set(Calendar.DATE, 30);
            } else if (currentMonth >= 7 && currentMonth <= 9) {
                c.set(Calendar.MONTH, 8);
                c.set(Calendar.DATE, 30);
            } else if (currentMonth >= 10 && currentMonth <= 12) {
                c.set(Calendar.MONTH, 11);
                c.set(Calendar.DATE, 31);
            }
            lastDayOfCurrentQuarter = sdf.format(c.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lastDayOfCurrentQuarter;
    }


    public static   void main(String[] args) {
        DateUtils dateUtils = new DateUtils();
        String sysdate = dateUtils.sumUp("4", "sysdate");
        System.out.println("sysdate = " + sysdate);
    }
}
