/**
  * Copyright 2022 json.cn 
  */
package cn.json.pojo;

/**
 * Auto-generated: 2022-08-30 22:53:14
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class PayInfo {

    private String companyType;
    private NativeOrderDetail nativeOrderDetail;
    private String soaProjectCode;
    private String elongProjectCode;
    private String elongProjectCodeKey;
    private String include;
    private String payNotifyUrl;
    public void setCompanyType(String companyType) {
         this.companyType = companyType;
     }
     public String getCompanyType() {
         return companyType;
     }

    public void setNativeOrderDetail(NativeOrderDetail nativeOrderDetail) {
         this.nativeOrderDetail = nativeOrderDetail;
     }
     public NativeOrderDetail getNativeOrderDetail() {
         return nativeOrderDetail;
     }

    public void setSoaProjectCode(String soaProjectCode) {
         this.soaProjectCode = soaProjectCode;
     }
     public String getSoaProjectCode() {
         return soaProjectCode;
     }

    public void setElongProjectCode(String elongProjectCode) {
         this.elongProjectCode = elongProjectCode;
     }
     public String getElongProjectCode() {
         return elongProjectCode;
     }

    public void setElongProjectCodeKey(String elongProjectCodeKey) {
         this.elongProjectCodeKey = elongProjectCodeKey;
     }
     public String getElongProjectCodeKey() {
         return elongProjectCodeKey;
     }

    public void setInclude(String include) {
         this.include = include;
     }
     public String getInclude() {
         return include;
     }

    public void setPayNotifyUrl(String payNotifyUrl) {
         this.payNotifyUrl = payNotifyUrl;
     }
     public String getPayNotifyUrl() {
         return payNotifyUrl;
     }

}