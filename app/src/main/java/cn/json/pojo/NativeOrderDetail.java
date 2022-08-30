/**
  * Copyright 2022 json.cn 
  */
package cn.json.pojo;
import java.util.List;

/**
 * Auto-generated: 2022-08-30 22:53:14
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class NativeOrderDetail {

    private String totalAmount;
    private List<String> goodsDesc;
    public void setTotalAmount(String totalAmount) {
         this.totalAmount = totalAmount;
     }
     public String getTotalAmount() {
         return totalAmount;
     }

    public void setGoodsDesc(List<String> goodsDesc) {
         this.goodsDesc = goodsDesc;
     }
     public List<String> getGoodsDesc() {
         return goodsDesc;
     }

}