/**
  * Copyright 2022 json.cn 
  */
package cn.json.pojo;

/**
 * Auto-generated: 2022-08-30 22:39:48
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Header {

    private String accountID;
    private String digitalSign;
    private String reqTime;
    private String serviceName;
    private String version;
    public void setAccountID(String accountID) {
         this.accountID = accountID;
     }
     public String getAccountID() {
         return accountID;
     }

    public void setDigitalSign(String digitalSign) {
         this.digitalSign = digitalSign;
     }
     public String getDigitalSign() {
         return digitalSign;
     }

    public void setReqTime(String reqTime) {
         this.reqTime = reqTime;
     }
     public String getReqTime() {
         return reqTime;
     }

    public void setServiceName(String serviceName) {
         this.serviceName = serviceName;
     }
     public String getServiceName() {
         return serviceName;
     }

    public void setVersion(String version) {
         this.version = version;
     }
     public String getVersion() {
         return version;
     }

}