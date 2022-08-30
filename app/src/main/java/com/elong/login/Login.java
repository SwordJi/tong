package com.elong.login;

import static com.elong.utils.JsonUtils.beanToJson;

import com.elong.config.Config;
import com.elong.framework.netmid.process.ProcessUtils;
import com.google.gson.Gson;

import java.io.File;

import cn.hutool.http.HttpRequest;
import cn.json.pojo.Body;
import cn.json.pojo.ClientInfo;
import cn.json.pojo.Header;
import cn.json.pojo.JsonRootBean;
import cn.json.pojo.Request;
import cn.json.pojo.RequestBody;

public class Login {

    private static final String LOGINURL = "https://appgateway.ly.com/member/MemberHandler.ashx";
    private static ClientInfo clientInfo = null;

    static {
        clientInfo = new ClientInfo();
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
    }


    /**
     * TODO
     *
     * @param json
     * @return
     */
    public Gson login(JsonRootBean json) {
        return null;
    }

    /**
     * 获取验证码
     *
     * @return 返回验证码
     */
    public String getVerify(String phone) {
        Request request = new Request();
        Body body = new Body();


        body.setMobile(phone);
        body.setAction("login");
        body.setAreaCode("86");
        body.setType("sm");
        //TODO
        body.setType("token");
        body.setClientInfo(clientInfo);
        request.setBody(body);

        // 定义Header
        Header header = new Header();
        header.setAccountID("c26b007f-c89e-431a-b8cc-493becbdd8a2");
        // TODO
        header.setDigitalSign("");
        header.setReqTime(String.valueOf(System.currentTimeMillis()));
        header.setServiceName("sendsms");
        header.setVersion("20111128102912");
        // 设置Header
        request.setHeader(header);


        JsonRootBean jsonRootBean = new JsonRootBean();
        jsonRootBean.setRequest(request);


        // 请求体
        RequestBody requestBody = new RequestBody();
        requestBody.setCt("19");
        requestBody.setV("10.4.1");
        requestBody.setR(ProcessUtils.a(beanToJson(jsonRootBean), Config.c));

        //链式构建请求
        return HttpRequest.post(LOGINURL)
                // TODO
                .header("reqdata", "")//头信息，多个头信息多次调用此方法即可
                .form(new Gson().toJson(requestBody))//表单内容
                .timeout(20000)//超时，毫秒
                .execute().body();
    }

    /**
     * TODO
     *
     * @param response 获取验证码返回的 response
     * @return 返回结果
     */
    public String submitVerify(String response) {
        return "";
    }


    /**
     * TODO
     * 获取滑块图片
     *
     * @return 返回验证码
     */
    public File getSlidePictureVerify() {
        return null;
    }

    /**
     * TODO
     * 提交滑块验证
     *
     * @return 返回验结果
     */
    public String submitSlidePictureVerify() {
        return null;
    }


}
