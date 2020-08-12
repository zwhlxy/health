package com.zz.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zwh
 * @Date 2020/7/7 10:37
 * @Version 1.0
 **/
@Controller
@ResponseBody
public class UserController {

    @Autowired
    private User user;

//    @RequestMapping("/user")
//    public User user(User users){
//        System.out.println(user);
//        return user;
//    }

    @RequestMapping(value = "/getCountryItemNum", method = RequestMethod.GET)
    public JSONObject getCountryItemNum() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":{\"CJSums\":1097,\"XZSums\":216,\"rows\":[{\"CJItem\":1097,\"XZItem\":216,\"code\":\"522636\",\"name\":\"丹寨县\"}]},\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getXZandCJnums", method = RequestMethod.GET)
    public JSONObject getXZandCJnums() {
        JSONObject jsonObject = JSON.parseObject("{\"cjTotal\":2405,\"message\":\"调用成功\",\"state\":\"200\",\"xzTotal\":2407,\"data\":[{\"CJNUMS\":95,\"REGION_CODE\":\"522626\",\"REGION_NAME\":\"岑巩县\",\"XZNUMS\":11},{\"CJNUMS\":30,\"REGION_CODE\":\"522691\",\"REGION_NAME\":\"凯里开发区\",\"XZNUMS\":2}]}");
        return jsonObject;
    }

    @RequestMapping(value = "/getEntryOrganDetail", method = RequestMethod.GET)
    public JSONObject getEntryOrganDetail() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":{\"arr\":[{\"ORGAN_CODE\":\"009750334\",\"ORGAN_NAME\":\"黔东南州发展和改革委员会\",\"ORGAN_SHORT_NAME\":\"州发展改革委\",\"REGION_CODE\":\"522600\"},],\"total\":48},\"state\":\"200\"}");
        return jsonObject;
    }


    @RequestMapping(value = "/getEntryOrganCount", method = RequestMethod.GET)
    public JSONObject getEntryOrganCount() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"COUNT\":48,\"REGION_CODE\":\"522600\",\"REGION_NAME\":\"黔东南州\"},],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getCityOnlineRate", method = RequestMethod.GET)
    public JSONObject getCityOnlineRate() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":{\"cityTotal\":{\"nowebnums\":6,\"total\":19362,\"webnums\":19356},\"cityEach\":[{\"nowebnums\":1,\"regionCode\":\"522600\",\"regionName\":\"黔东南州\",\"total\":1364,\"webnums\":1363}]},\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getCityTBRate", method = RequestMethod.GET)
    public JSONObject getCityTBRate() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":{\"cityTotal\":{\"onenums\":15241,\"total\":19369},\"cityEach\":[{\"onenums\":46,\"regionCode\":\"522691\",\"regionName\":\"凯里开发区\",\"total\":91}]},\"state\":\"200\"}");
        return jsonObject;
    }


    @RequestMapping(value = "/getItemType", method = RequestMethod.GET)
    public JSONObject getItemType() {
        JSONObject jsonObject = JSON.parseObject("{\"State\":\"200\",\"data\":[{\"allItem\":19,\"cf\":9,\"cj\":0,\"code\":\"7888553956647849388\",\"gg\":6,\"jc\":1,\"jf\":0,\"jl\":0,\"name\":\"贵州省人民防空办公室\",\"qr\":0,\"qt\":1,\"qz\":0,\"xk\":2,\"ysq\":3,\"zs\":0},{\"allItem\":54,\"cf\":11,\"cj\":0,\"code\":\"-2913313554728139520\",\"gg\":14,\"jc\":0,\"jf\":0,\"jl\":0,\"name\":\"贵州省地方金融监督管理局\",\"qr\":0,\"qt\":0,\"qz\":0,\"xk\":29,\"ysq\":29,\"zs\":0}]}");
        return jsonObject;
    }


    @RequestMapping(value = "/getBJKNumByTimeForQDN", method = RequestMethod.GET)
    public JSONObject getBJKNumByTimeForQDN() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"preApproveCount\":\"13712\",\"regionCode\":\"522600\",\"regionName\":\"黔东南州市场监督管理局\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getOrganOnlineRate", method = RequestMethod.GET)
    public JSONObject getOrganOnlineRate() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"nowebnums\":0,\"organCode\":\"009750019\",\"organName\":\"黔东南州商务局\",\"total\":18,\"webnums\":18}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getAccelerationForQXN", method = RequestMethod.GET)
    public JSONObject getAccelerationForQXN() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"code\":\"522636\",\"name\":\"丹寨县\",\"rate\":\"53.6%\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getWebRateByTimeForQDN", method = RequestMethod.GET)
    public JSONObject getWebRateByTimeForQDN() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"organCode\":\"556619992\",\"organName\":\"黔东南州人力资源和社会保障局\",\"rate\":\"1.01%\"},{\"organCode\":\"009750238\",\"organName\":\"黔东南苗族侗族自治州市场监督管理局\",\"rate\":\"36.3%\"},{\"organCode\":\"741118794\",\"organName\":\"黔东南州应急管理局\",\"rate\":\"2.38%\"},{\"organCode\":\"009750780\",\"organName\":\"黔东南州财政局\",\"rate\":\"0%\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getItemCompressionTimeRateNew", method = RequestMethod.GET)
    public JSONObject getItemCompressionTimeRateNew() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"agreeTime\":677,\"lawTime\":1344,\"orgCode\":\"522636009788017\",\"orgName\":\"丹寨县公安局\",\"timeRate\":\"50.37%\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/queryRegionCodeMaterialCount", method = RequestMethod.GET)
    public JSONObject queryRegionCodeMaterialCount() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"CFNUMS\":216,\"CJNUMS\":0,\"GGNUMS\":251,\"JCNUMS\":41,\"JFNUMS\":25,\"NUMS\":5264,\"QRNUMS\":191,\"QTNUMS\":602,\"QZNUMS\":8,\"REGION_CODE\":\"522600\",\"REGION_NAME\":\"黔东南州\",\"XKNUMS\":3909,\"ZSNUMS\":15}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/queryOrganCodeMaterialCount", method = RequestMethod.GET)
    public JSONObject queryOrganCodeMaterialCount() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"CFNUMS\":0,\"CJNUMS\":0,\"GGNUMS\":0,\"JCNUMS\":0,\"JFNUMS\":0,\"NUMS\":4,\"ORG_CODE\":\"009750529\",\"ORG_NAME\":\"黔东南州水利水电工程移民局\",\"QRNUMS\":0,\"QTNUMS\":4,\"QZNUMS\":0,\"XKNUMS\":0,\"ZSNUMS\":0}],\"state\":\"200\"}");
        return jsonObject;
    }

    /**
     * 好差评 没有数据
     * @return
     */
    @RequestMapping(value = "/aspx", method = RequestMethod.GET)
    public JSONObject aspx() {
        JSONObject jsonObject = JSON.parseObject("");
        return jsonObject;
    }

//    @RequestMapping(value = "/getItemCompressionTimeRate", method = RequestMethod.GET)
//    public JSONObject getItemCompressionTimeRate() {
//        JSONObject jsonObject = JSON.parseObject("");
//        return jsonObject;
//    }
//
//    @RequestMapping(value = "/getItemCompressionTimeRate", method = RequestMethod.GET)
//    public JSONObject getItemCompressionTimeRate() {
//        JSONObject jsonObject = JSON.parseObject("");
//        return jsonObject;
//    }


}
