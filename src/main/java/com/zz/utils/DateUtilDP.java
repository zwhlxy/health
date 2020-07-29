package com.zz.utils;

import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author fyz
 * @version 1.0
 * @date 2020/7/23 11:29
 */
public class DateUtilDP {
    //status 0本周 1本月 2上月 3本季度 4本年度 5所有
    private static final String C_thisWeek_CODE = "0";
    private static final String C_thisMonth_CODE = "1";
    private static final String C_lastMonth_CODE = "2";
    private static final String C_thisSeason_CODE = "3";

    public static void main(String[] args) {
        System.out.println(GetDateWhere("sysdate", "3"));
    }


    public static String GetDateWhere(String StaTime, String type) {
        ImDateWhere imDateWhere;
        if (type.equals(C_thisMonth_CODE)) {
            imDateWhere = new C_thisMonth();
        } else if (type.equals(C_lastMonth_CODE)) {
            imDateWhere = new C_lastMonth();
        } else if (type.equals(C_thisWeek_CODE)) {
            imDateWhere = new C_thisWeek();
        } else if (type.equals(C_thisSeason_CODE)) {
            imDateWhere = new C_thisSeason();
        } else if (type.equals("4")) {
            return "TO_CHAR(" + StaTime + ",'yyyy') = to_char(sysdate,'yyyy')";
        } else {
            return "1=1";
        }
        return imDateWhere.DateWhereShow(StaTime);
    }

    /**
     * 当前季度的开始时间
     *
     * @return string
     */
    public String getCurrentYearStartTime() {
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
    public String getCurrentQuarterEndTime() {
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


    /**
     * 获取本周的第一天
     *
     * @return String
     **/
    public String getWeekStart() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_MONTH, 0);
        cal.set(Calendar.DAY_OF_WEEK, 2);
        Date time = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    /**
     * 本周
     *
     * @param status
     * @return
     */
    public String thisWeek(String status, String time) {
        if (!StringUtils.isEmpty(time)) {
            String monthStart = getWeekStart();
            String monthEnd = getWeekEnd();
            return "TO_CHAR(" + time + ",'yyyy-mm-dd') BETWEEN '" + monthStart + "' and '" + monthEnd +"'";
        } else
            return "1=1";
    }


    /**
     * 获取本周的最后一天
     *
     * @return String
     **/
    public String getWeekEnd() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, cal.getActualMaximum(Calendar.DAY_OF_WEEK));
        cal.add(Calendar.DAY_OF_WEEK, 1);
        Date time = cal.getTime();
        return new SimpleDateFormat("yyyy-MM-dd").format(time);
    }

    /**
     * 获取本月开始日期
     *
     * @return String
     **/
    public String getMonthStart() {
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
    public String getMonthEnd() {
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
    public String getLastMonthStart() {
        Calendar cal_1 = Calendar.getInstance();//获取当前日期
        cal_1.add(Calendar.MONTH, -1);
        cal_1.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天
        return new SimpleDateFormat("yyyy-MM-dd").format(cal_1.getTime());
    }

    /**
     * 获取上个月最后一天
     *
     * @return String
     **/
    public String getLastMonthEnd() {
        Calendar cale = Calendar.getInstance();
        cale.set(Calendar.DAY_OF_MONTH, 0);//设置为1号,当前日期既为本月第一天
        return new SimpleDateFormat("yyyy-MM-dd").format(cale.getTime());
    }

}

interface ImDateWhere {
    String DateWhereShow(String StaTime);
}

class C_thisMonth implements ImDateWhere {
    @Override
    public String DateWhereShow(String StaTime) {
        String monthStart = new DateUtilDP().getMonthStart();
        String monthEnd = new DateUtilDP().getMonthEnd();
        return "TO_CHAR(" + StaTime + ",'yyyy-mm-dd') BETWEEN '" + monthStart + "' and '" + monthEnd +"'";
    }

}

class C_lastMonth implements ImDateWhere {
    @Override
    public String DateWhereShow(String StaTime) {
        String monthStart = new DateUtilDP().getLastMonthStart();
        String monthEnd = new DateUtilDP().getLastMonthEnd();
        return "TO_CHAR(" + StaTime + ",'yyyy-mm-dd') BETWEEN '" + monthStart + "' and '" + monthEnd +"'";
    }

}

class C_thisWeek implements ImDateWhere {

    @Override
    public String DateWhereShow(String StaTime) {
        String monthStart = new DateUtilDP().getWeekStart();
        String monthEnd = new DateUtilDP().getWeekEnd();
        return "TO_CHAR(" + StaTime + ",'yyyy-mm-dd') BETWEEN '" + monthStart + "' and '" + monthEnd + "'";
    }

}

class C_thisSeason implements ImDateWhere {

    @Override
    public String DateWhereShow(String StaTime) {
        String monthStart = new DateUtilDP().getCurrentYearStartTime();
        String monthEnd = new DateUtilDP().getCurrentQuarterEndTime();
        return "TO_CHAR(" + StaTime + ",'yyyy-mm-dd') BETWEEN '" + monthStart + "' and '" + monthEnd +"'";
    }

}
