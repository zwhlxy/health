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
        JSONObject jsonObject = JSON.parseObject("{\"cjTotal\":2418,\"data\":[{\"CJNUMS\":176,\"REGION_CODE\":\"522601\",\"REGION_NAME\":\"凯里市\",\"XZNUMS\":16}],\"message\":\"调用成功\",\"state\":\"200\",\"xzTotal\":245}");
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
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"code\":\"556619992\",\"name\":\"黔东南州人力资源和社会保障局\",\"nums\":460},{\"code\":\"009750115\",\"name\":\"黔东南州水务局\",\"nums\":20},{\"code\":\"009750406\",\"name\":\"黔东南州农业农村局\",\"nums\":2},{\"code\":\"009750019\",\"name\":\"黔东南州商务局\",\"nums\":40},{\"code\":\"009750473\",\"name\":\"黔东南无线电管理局\",\"nums\":7},{\"code\":\"K36445525\",\"name\":\"黔东南州公安交管局\",\"nums\":2},{\"code\":\"009750828\",\"name\":\"黔东南州民政局\",\"nums\":18},{\"code\":\"750171765\",\"name\":\"黔东南州住房公积金管理中心\",\"nums\":7},{\"code\":\"00975006x\",\"name\":\"黔东南州交通运输局\",\"nums\":335},{\"code\":\"785466897\",\"name\":\"黔东南州机关事务管理局\",\"nums\":102},{\"code\":\"009750182\",\"name\":\"黔东南州文体广电旅游局\",\"nums\":2},{\"code\":\"714328235\",\"name\":\"黔东南州住房和城乡建设局\",\"nums\":526},{\"code\":\"009750836\",\"name\":\"黔东南州生态环境局\",\"nums\":620},{\"code\":\"009750641\",\"name\":\"黔东南州公安局\",\"nums\":439},{\"code\":\"52260070V\",\"name\":\"中共黔东南州委宣传部\",\"nums\":12},{\"code\":\"00975022X\",\"name\":\"黔东南州林业局\",\"nums\":55},{\"code\":\"009750334\",\"name\":\"黔东南州发展和改革委员会\",\"nums\":12},{\"code\":\"745709831\",\"name\":\"黔东南州卫生健康局\",\"nums\":1601},{\"code\":\"009750238\",\"name\":\"黔东南苗族侗族自治州市场监督管理局\",\"nums\":1065},{\"code\":\"741118794\",\"name\":\"黔东南州应急管理局\",\"nums\":156},{\"code\":\"009750799\",\"name\":\"黔东南州自然资源局\",\"nums\":8},{\"code\":\"009750844\",\"name\":\"黔东南州司法局\",\"nums\":312},{\"code\":\"00975049X\",\"name\":\"黔东南州烟草专卖局\",\"nums\":6},{\"code\":\"009750131\",\"name\":\"黔东南州教育局\",\"nums\":2},{\"code\":\"009750780\",\"name\":\"黔东南州财政局\",\"nums\":24}],\"state\":\"200\"}");
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
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"code\":\"522636\",\"name\":\"行政区划代码为空\",\"rate\":\"18.46%\"},{\"code\":\"522600\",\"name\":\"黔东南苗族侗族自治州\",\"rate\":\"53.23%\"},{\"code\":\"522624\",\"name\":\"三穗县\",\"rate\":\"40.53%\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getItemCompressionTimeRateNew", method = RequestMethod.GET)
    public JSONObject getItemCompressionTimeRateNew() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"agreeTime\":677,\"lawTime\":1344,\"orgCode\":\"522636009788017\",\"orgName\":\"丹寨县公安局\",\"timeRate\":\"50.37%\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/queryRegionCodeMaterialCount", method = RequestMethod.GET)
    public JSONObject queryRegionCodeMaterialCount() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"CFNUMS\":770,\"CJNUMS\":28,\"GGNUMS\":1043,\"JCNUMS\":14,\"JFNUMS\":131,\"NUMS\":7858,\"QRNUMS\":695,\"QTNUMS\":586,\"QZNUMS\":119,\"REGION_CODE\":\"522636\",\"REGION_NAME\":\"丹寨县\",\"XKNUMS\":3931,\"ZSNUMS\":401},{\"CFNUMS\":1514,\"CJNUMS\":18,\"GGNUMS\":926,\"JCNUMS\":114,\"JFNUMS\":34,\"NUMS\":8205,\"QRNUMS\":528,\"QTNUMS\":752,\"QZNUMS\":87,\"REGION_CODE\":\"522600\",\"REGION_NAME\":\"黔东南州\",\"XKNUMS\":4098,\"ZSNUMS\":19},{\"CFNUMS\":478,\"CJNUMS\":23,\"GGNUMS\":851,\"JCNUMS\":31,\"JFNUMS\":60,\"NUMS\":6730,\"QRNUMS\":383,\"QTNUMS\":950,\"QZNUMS\":68,\"REGION_CODE\":\"522624\",\"REGION_NAME\":\"三穗县\",\"XKNUMS\":3334,\"ZSNUMS\":429}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/queryOrganCodeMaterialCount", method = RequestMethod.GET)
    public JSONObject queryOrganCodeMaterialCount() {
        JSONObject jsonObject = JSON.parseObject("{\"State\":\"200\",\"data\":[{\"CFNUMS\":1,\"CJNUMS\":0,\"GGNUMS\":0,\"JCNUMS\":1,\"JFNUMS\":0,\"NUMS\":15,\"ORG_CODE\":\"009750668\",\"ORG_NAME\":\"中共黔东南州委办公室（黔东南州档案局）\",\"QRNUMS\":0,\"QTNUMS\":10,\"QZNUMS\":0,\"XKNUMS\":2,\"ZSNUMS\":0},{\"CFNUMS\":0,\"CJNUMS\":0,\"GGNUMS\":0,\"JCNUMS\":0,\"JFNUMS\":0,\"NUMS\":20,\"ORG_CODE\":\"14237019\",\"ORG_NAME\":\"中国铁搭股份有限公司黔东南州分公司\",\"QRNUMS\":0,\"QTNUMS\":0,\"QZNUMS\":0,\"XKNUMS\":20,\"ZSNUMS\":0}]}");
        return jsonObject;
    }

    /**
     * 好差评
     *
     * @return
     */
    @RequestMapping(value = "/aspx", method = RequestMethod.GET)
    public JSONObject aspx() {
        JSONObject jsonObject = JSON.parseObject("{\"code\":\"0\",\"msg\":\"\",\"count\":0,\"svrid\":null,\"data\":[{\"code\":\"522600\",\"names\":\"黔东南州\",\"pjcount\":4273,\"fcmycount\":775,\"fcmyL\":\"18.14\",\"mycount\":3486,\"myL\":\"81.58\",\"jbmycount\":12,\"jbmyL\":\"0.28\",\"bmycount\":0,\"bmyL\":\"0\",\"fcbmycount\":0,\"fcbmyL\":\"0\"},{\"code\":\"522601\",\"names\":\"凯里市\",\"pjcount\":39916,\"fcmycount\":20530,\"fcmyL\":\"51.43\",\"mycount\":19379,\"myL\":\"48.55\",\"jbmycount\":7,\"jbmyL\":\"0.02\",\"bmycount\":0,\"bmyL\":\"0\",\"fcbmycount\":0,\"fcbmyL\":\"0\"},{\"code\":\"522622\",\"names\":\"黄平县\",\"pjcount\":5096,\"fcmycount\":470,\"fcmyL\":\"9.22\",\"mycount\":4622,\"myL\":\"90.7\",\"jbmycount\":2,\"jbmyL\":\"0.04\",\"bmycount\":1,\"bmyL\":\"0.02\",\"fcbmycount\":1,\"fcbmyL\":\"0.02\"}]}");
        return jsonObject;
    }

    @RequestMapping(value = "/getOnlinePreApproveCount", method = RequestMethod.GET)
    public JSONObject getOnlinePreApproveCount() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"orgCode\":\"714328235\",\"orgName\":\"黔东南州住房和城乡建设局\",\"preApproveCount\":\"1040\"},{\"orgCode\":\"009750182\",\"orgName\":\"黔东南州文体广电旅游局\",\"preApproveCount\":\"4\"},{\"orgCode\":\"009750799\",\"orgName\":\"黔东南州自然资源局\",\"preApproveCount\":\"1\"},{\"orgCode\":\"009750780\",\"orgName\":\"黔东南州财政局\",\"preApproveCount\":\"1\"},{\"orgCode\":\"741118794\",\"orgName\":\"黔东南州应急管理局\",\"preApproveCount\":\"1\"},{\"orgCode\":\"750171765\",\"orgName\":\"黔东南州住房公积金管理中心\",\"preApproveCount\":\"5967\"},{\"orgCode\":\"009750828\",\"orgName\":\"黔东南州民政局\",\"preApproveCount\":\"1\"},{\"orgCode\":\"5226001X6\",\"orgName\":\"中共黔东南州委机构编制委员会办公室\",\"preApproveCount\":\"1\"},{\"orgCode\":\"009750238\",\"orgName\":\"黔东南州市场监督管理局\",\"preApproveCount\":\"785\"},{\"orgCode\":\"00975006x\",\"orgName\":\"黔东南州交通运输局\",\"preApproveCount\":\"75\"},{\"orgCode\":\"009750334\",\"orgName\":\"黔东南州发展和改革委员会\",\"preApproveCount\":\"3\"},{\"orgCode\":\"009750131\",\"orgName\":\"黔东南州教育局\",\"preApproveCount\":\"2\"},{\"orgCode\":\"009750844\",\"orgName\":\"黔东南州司法局\",\"preApproveCount\":\"783\"},{\"orgCode\":\"009750641\",\"orgName\":\"黔东南州公安局\",\"preApproveCount\":\"3\"},{\"orgCode\":\"009750836\",\"orgName\":\"黔东南州生态环境局\",\"preApproveCount\":\"430\"},{\"orgCode\":\"556619992\",\"orgName\":\"黔东南州人力资源和社会保障局\",\"preApproveCount\":\"3\"},{\"orgCode\":\"K36445525\",\"orgName\":\"黔东南州公安交通管理局\",\"preApproveCount\":\"4\"},{\"orgCode\":\"745709831\",\"orgName\":\"黔东南州卫生健康局\",\"preApproveCount\":\"2636\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getNumByMonthForQDN", method = RequestMethod.GET)
    public JSONObject getNumByMonthForQDN() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"month\":\"2020-06\",\"nums\":55499},{\"month\":\"2020-07\",\"nums\":60311},{\"month\":\"2020-08\",\"nums\":66429},{\"month\":\"2020-04\",\"nums\":60690},{\"month\":\"2020-05\",\"nums\":33919}],\"state\":\"200\"}");
        return jsonObject;
    }


    @RequestMapping(value = "/getAccelerationForQDN", method = RequestMethod.GET)
    public JSONObject getAccelerationForQDN() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"code\":\"522636\",\"name\":\"丹寨县\",\"rate\":\"53.6%\"},{\"code\":\"522600\",\"name\":\"黔东南州\",\"rate\":\"48.72%\"},{\"code\":\"522624\",\"name\":\"三穗县\",\"rate\":\"58.18%\"}],\"state\":\"200\"}");
        return jsonObject;
    }




    @RequestMapping(value = "/getItemCompressionTimeRate", method = RequestMethod.GET)
    public JSONObject getItemCompressionTimeRate() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"agreeTime\":17715,\"lawTime\":30514,\"regionCode\":\"522600\",\"regionName\":\"黔东南州\",\"timeRate\":\"58.06%\"},{\"agreeTime\":11930,\"lawTime\":24300,\"regionCode\":\"522601\",\"regionName\":\"凯里市\",\"timeRate\":\"49.09%\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getDeptAndItemNum", method = RequestMethod.GET)
    public JSONObject getDeptAndItemNum() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":{\"CJ\":{\"deptnums\":2372,\"itemnums\":27511},\"QX\":{\"deptnums\":742,\"itemnums\":57685},\"XZ\":{\"deptnums\":210,\"itemnums\":14407},\"ZBJ\":{\"deptnums\":48,\"itemnums\":4654}},\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getRegionBJAndItemNum", method = RequestMethod.GET)
    public JSONObject getRegionBJAndItemNum() {
        JSONObject jsonObject = JSON.parseObject("{    \"data\":[{\"BJNUMS\":18875,\"ITEMNUMS\":5282,\"REGIONCODE\":\"522601\",\"REGIONNAME\":\"凯里市\"},{\"BJNUMS\":32220,\"ITEMNUMS\":2606,\"REGIONCODE\":\"522622\",\"REGIONNAME\":\"黄平县\"},{\"BJNUMS\":56315,\"ITEMNUMS\":2053,\"REGIONCODE\":\"522623\",\"REGIONNAME\":\"施秉县\"},{\"BJNUMS\":2302,\"ITEMNUMS\":3270,\"REGIONCODE\":\"522624\",\"REGIONNAME\":\"三穗县\"},{\"BJNUMS\":69478,\"ITEMNUMS\":3253,\"REGIONCODE\":\"522625\",\"REGIONNAME\":\"镇远县\"},{\"BJNUMS\":203092,\"ITEMNUMS\":3942,\"REGIONCODE\":\"522626\",\"REGIONNAME\":\"岑巩县\"},{\"BJNUMS\":41073,\"ITEMNUMS\":2187,\"REGIONCODE\":\"522627\",\"REGIONNAME\":\"天柱县\"},{\"BJNUMS\":141467,\"ITEMNUMS\":2918,\"REGIONCODE\":\"522628\",\"REGIONNAME\":\"锦屏县\"},{\"BJNUMS\":369695,\"ITEMNUMS\":5043,\"REGIONCODE\":\"522629\",\"REGIONNAME\":\"剑河县\"},{\"BJNUMS\":143086,\"ITEMNUMS\":4832,\"REGIONCODE\":\"522630\",\"REGIONNAME\":\"台江县\"},{\"BJNUMS\":415979,\"ITEMNUMS\":4259,\"REGIONCODE\":\"522631\",\"REGIONNAME\":\"黎平县\"},{\"BJNUMS\":118251,\"ITEMNUMS\":3415,\"REGIONCODE\":\"522632\",\"REGIONNAME\":\"榕江县\"},{\"BJNUMS\":29242,\"ITEMNUMS\":4171,\"REGIONCODE\":\"522633\",\"REGIONNAME\":\"从江县\"},{\"BJNUMS\":6263,\"ITEMNUMS\":2329,\"REGIONCODE\":\"522634\",\"REGIONNAME\":\"雷山县\"},{\"BJNUMS\":2761,\"ITEMNUMS\":3649,\"REGIONCODE\":\"522635\",\"REGIONNAME\":\"麻江县\"},{\"BJNUMS\":5049,\"ITEMNUMS\":4190,\"REGIONCODE\":\"522636\",\"REGIONNAME\":\"丹寨县\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getOnlineRegApproveCount", method = RequestMethod.GET)
    public JSONObject getOnlineRegApproveCount() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"preApproveCount\":\"13712\",\"regionCode\":\"522600\",\"regionName\":\"黔东南\"},{\"preApproveCount\":\"13712\",\"regionCode\":\"522111\",\"regionName\":\"凯里市\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/advisory1", method = RequestMethod.GET)
    public JSONObject advisory1() {
        JSONObject jsonObject = JSON.parseObject("{\"code\":\"0\",\"msg\":\"\",\"count\":0,\"svrid\":null,\"data\":[{\"OrgCode\":\"1093\",\"OrgName\":\"贵阳海关\",\"TOLNUM_ZX\":1,\"YCLSUM_ZX\":1,\"WHFSUM_ZX\":0,\"TOLNUM_TS\":0,\"YCLSUM_TS\":0,\"WHFSUM_TS\":0}]}");
        return jsonObject;
    }

    @RequestMapping(value = "/advisory2", method = RequestMethod.GET)
    public JSONObject advisory2() {
        JSONObject jsonObject = JSON.parseObject("{\"code\":\"0\",\"msg\":\"\",\"count\":0,\"svrid\":null,\"data\":[{\"AreaCode\":\"522600\",\"AreaName\":\"黔东南州\",\"TOLNUM_ZX\":31,\"YCLSUM_ZX\":14,\"WHFSUM_ZX\":17,\"TOLNUM_TS\":5,\"YCLSUM_TS\":2,\"WHFSUM_TS\":3},{\"AreaCode\":\"522601\",\"AreaName\":\"凯里市\",\"TOLNUM_ZX\":129,\"YCLSUM_ZX\":129,\"WHFSUM_ZX\":0,\"TOLNUM_TS\":12,\"YCLSUM_TS\":12,\"WHFSUM_TS\":0}]}");
        return jsonObject;
    }

    @RequestMapping(value = "/getOrganCodeEmsToDT1", method = RequestMethod.GET)
    public JSONObject getOrganCodeEmsToDT1() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"NUMS\":2,\"REGION_CODE\":\"522630\",\"REGION_NAME\":\"台江县\"},{\"NUMS\":45,\"REGION_CODE\":\"522600\",\"REGION_NAME\":\"黔东南州\"},{\"NUMS\":1,\"REGION_CODE\":\"522601\",\"REGION_NAME\":\"凯里市\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getOrganCodeEmsToDT2", method = RequestMethod.GET)
    public JSONObject getOrganCodeEmsToDT2() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"NUMS\":2,\"REGION_CODE\":\"522630\",\"REGION_NAME\":\"台江县\"},{\"NUMS\":45,\"REGION_CODE\":\"522600\",\"REGION_NAME\":\"黔东南州\"},{\"NUMS\":1,\"REGION_CODE\":\"522601\",\"REGION_NAME\":\"凯里市\"}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getRegionCodeEmsToSqr1", method = RequestMethod.GET)
    public JSONObject getRegionCodeEmsToSqr1() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getRegionCodeEmsToSqr2", method = RequestMethod.GET)
    public JSONObject getRegionCodeEmsToSqr2() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/queryLicenseOrganNums1", method = RequestMethod.GET)
    public JSONObject queryLicenseOrganNums1() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"ORG_CODE\":\"009750238\",\"ORG_NAME\":\"黔东南州市场监督管理局\",\"TOTAL_NUM\":3153,\"TYPE_NUM\":5},{\"ORG_CODE\":\"009750799\",\"ORG_NAME\":\"黔东南州自然资源局\",\"TOTAL_NUM\":0,\"TYPE_NUM\":2},{\"ORG_CODE\":\"009750131\",\"ORG_NAME\":\"黔东南州教育局\",\"TOTAL_NUM\":0,\"TYPE_NUM\":0}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/queryLicenseOrganNums2", method = RequestMethod.GET)
    public JSONObject queryLicenseOrganNums2() {
        JSONObject jsonObject = JSON.parseObject("{\"Data\":[{\"PVALIDNUM\":0,\"REGIONCODE\":\"522600\",\"REGIONNAME\":\"黔东南州\",\"TYPENUM\":53,\"VALIDNUM\":5972},{\"PVALIDNUM\":0,\"REGIONCODE\":\"522601\",\"REGIONNAME\":\"凯里市\",\"TYPENUM\":13,\"VALIDNUM\":21038},{\"PVALIDNUM\":0,\"REGIONCODE\":\"522622\",\"REGIONNAME\":\"黄平县\",\"TYPENUM\":13,\"VALIDNUM\":9786}],\"state\":\"200\"}");
        return jsonObject;
    }

    @RequestMapping(value = "/getLicShareTimes", method = RequestMethod.GET)
    public JSONObject getLicShareTimes() {
        JSONObject jsonObject = JSON.parseObject("{\"data\":[{\"orgCode\":\"009450059\",\"orgName\":\"六盘水市商务局\",\"shareTimes\":1},{\"orgCode\":\"009450227\",\"orgName\":\"市生态环境局\",\"shareTimes\":1},{\"orgCode\":\"009450243\",\"orgName\":\"六盘水市市场监督管理局\",\"shareTimes\":2}],\"state\":\"200\"}");
        return jsonObject;
    }
}
