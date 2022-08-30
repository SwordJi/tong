package com.netease.tong;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import cn.json.pojo.Body;
import cn.json.pojo.ClientInfo;
import cn.json.pojo.Header;
import cn.json.pojo.JsonRootBean;
import cn.json.pojo.NativeOrderDetail;
import cn.json.pojo.PayInfo;
import cn.json.pojo.Request;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws NoSuchAlgorithmException {

        Request request = new Request();
        Body body = new Body();

        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setVersionType("android");
        clientInfo.setArea("||");
        clientInfo.setClientId("707b4387aac8d4d68bfdf162043e59f90257463b5011");
        clientInfo.setIsGuest("false");
        clientInfo.setDeviceId("e424ad507cc15a68");
        clientInfo.setVersionNumber("10.4.1");
        clientInfo.setTouristId("85656b7ea2fd4f2888aafedad38f04cd");
        clientInfo.setManufacturer("OPPO");
        clientInfo.setExtend("4^11,5^PCLM10,isGuest^false,6^13,os_v^30,app_v^10.4.1,devicetoken^20220830163517fc174b41d960649c9c1f8a02df3efe7e01d8577b94318468,memberidnew^Bqs9fovIX2pfPYX_TPttCm4n_DHCs5O4OQRBTQHE5lBR-10I8D3AMMmgT3gS93HpkTh1kIZ7Y6SCl5nAZjEjRp3YuLEKl9TsMWH5EIhS4Er23e9eX4yFtjYk_zkkhvy80BqjmhF7p15GCY0jIwDaM3OlzNXrh2LeM79hGT1dRDrn_DaJV8rBb7Kas6duTcX5CfCyU17nwAodxuRGuw4w7SI0GM-jVjhgsm584XAE__Q*AB");
        clientInfo.setSystemCode("tc");
        clientInfo.setClientIp("127.0.0.1");
        clientInfo.setRefId("16818681");
        clientInfo.setNetworkType("4G");
        clientInfo.setDevice("e424ad507cc15a68|arm64-v8a|1080*2332*480|PCLM10|unknown");
        clientInfo.setPushInfo("OPPO_CN_69298127c765d841258bc4a5201075bf");

        body.setClientInfo(clientInfo);

        body.setProjectTag("rechargecenter");

        PayInfo payInfo = new PayInfo();
        payInfo.setCompanyType("1");
        NativeOrderDetail nativeOrderDetail = new NativeOrderDetail();
        nativeOrderDetail.setTotalAmount("¥49.90");

        ArrayList<String> list = new ArrayList<>();
        list.add("50元话费-13712112449");
        nativeOrderDetail.setGoodsDesc(list);
        payInfo.setNativeOrderDetail(nativeOrderDetail);
        payInfo.setSoaProjectCode(null);
        payInfo.setElongProjectCode("shzc190qd");
        payInfo.setElongProjectCodeKey("851ED351A37FF14A2934B3DFACD98639");
        payInfo.setInclude("elwxpay,elalipay");
        payInfo.setInclude("elwxpay,elalipay");
        payInfo.setPayNotifyUrl("https://cvg.17usoft.net/rechargecenter/payment/userPaymentResponseV3");
//        body.setPayInfo(beanToJson(payInfo));

        body.setMemberId("I0_6da66b140f26f06a6f6a3846e9b58553");
        request.setBody(body);
        Header header = new Header();
        header.setAccountID("c26b007f-c89e-431a-b8cc-493becbdd8a2");
        header.setDigitalSign("e9e973a12713e14bc1158ec0211dab65");
        // header.setReqTime(String.valueOf(System.currentTimeMillis()));
        header.setReqTime("1661850854755");
        header.setServiceName("getpaytoken");
        header.setVersion("20111128102912");

        request.setHeader(header);


        JsonRootBean jsonRootBean = new JsonRootBean();
        jsonRootBean.setRequest(request);

//        String str = beanToJson(jsonRootBean) + Config.a;
//        System.out.println(MD5Utils(str));
//        System.out.println(ProcessUtils.a(str, "CShDLR3zT6lVRkGU"));
    }





}