package com.geektime.springbootdemo.entity.shop;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情表 （表名：t_order_detail）
 * <br>
 * <br>
 * 【重要提示】：<br>
 * &nbsp;&nbsp;此类通过 Mybatis Generator 逆向生成，禁止手动修改！<br>（因项目需求持续性会发生变更，当调整数据表字段时，需要再重新逆向生成此类）
 **/
public class orderDetail {
    /** 订单详情ID **/
    private Integer id;

    /** 订单ID **/
    private Integer orderId;

    /** 商品ID **/
    private Integer goodsId;

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    /** 下单商品数量 **/
    private Short goodsNumber;

    /** 售卖价格 **/
    private BigDecimal salesAmount;

    /** 商品单价 **/
    private BigDecimal oriPrice;

    /** 是否有效（1:有效 0:无效）(用于逻辑删除标记) **/
    private Boolean valid;

    /** 商品快照json字符串（规格、单价、数量、商品简介、合计金额） **/
    private String snapshotJson;

    /** 订单详情ID **/
    public Integer getId() {
        return id;
    }

    /** 订单详情ID **/
    public void setId(Integer id) {
        this.id = id;
    }

    /** 订单ID **/
    public Integer getOrderId() {
        return orderId;
    }

    /** 订单ID **/
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /** 商品ID **/
    public Integer getGoodsId() {
        return goodsId;
    }

    /** 商品ID **/
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /** 创建时间 **/
    public Date getCreateTime() {
        return createTime;
    }

    /** 创建时间 **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** 更新时间 **/
    public Date getUpdateTime() {
        return updateTime;
    }

    /** 更新时间 **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** 下单商品数量 **/
    public Short getGoodsNumber() {
        return goodsNumber;
    }

    /** 下单商品数量 **/
    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    /** 售卖价格 **/
    public BigDecimal getSalesAmount() {
        return salesAmount;
    }

    /** 售卖价格 **/
    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    /** 商品单价 **/
    public BigDecimal getOriPrice() {
        return oriPrice;
    }

    /** 商品单价 **/
    public void setOriPrice(BigDecimal oriPrice) {
        this.oriPrice = oriPrice;
    }

    /** 是否有效（1:有效 0:无效）(用于逻辑删除标记) **/
    public Boolean getValid() {
        return valid;
    }

    /** 是否有效（1:有效 0:无效）(用于逻辑删除标记) **/
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /** 商品快照json字符串（规格、单价、数量、商品简介、合计金额） **/
    public String getSnapshotJson() {
        return snapshotJson;
    }

    /** 商品快照json字符串（规格、单价、数量、商品简介、合计金额） **/
    public void setSnapshotJson(String snapshotJson) {
        this.snapshotJson = snapshotJson == null ? null : snapshotJson.trim();
    }
}