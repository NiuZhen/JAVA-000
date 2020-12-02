package com.geektime.springbootdemo.entity.shop;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单表 （表名：t_order）
 * <br>
 * <br>
 * 【重要提示】：<br>
 * &nbsp;&nbsp;此类通过 Mybatis Generator 逆向生成，禁止手动修改！<br>（因项目需求持续性会发生变更，当调整数据表字段时，需要再重新逆向生成此类）
 **/
public class Orders {
    /** 订单ID **/
    private Integer id;

    /** 订单号 **/
    private String orderCode;

    /** 下单用户ID **/
    private Integer userId;

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    /** 商品总金额 **/
    private BigDecimal goodsAmount;

    /** 已付款金额 **/
    private BigDecimal moneyPaid;

    /** 应付款金额 **/
    private BigDecimal orderAmount;

    /** 折扣金额 **/
    private BigDecimal discount;

    /** 订单状态（0，未确认；1，已确认；2，已取消；3，无效；4，退货；） **/
    private Byte orderStatus;

    /** 商品配送情况，0，未发货；1，已发货；2，已收货；3，备货中 **/
    private Byte shippingStatus;

    /** 支付状态；0，未付款；1，付款中；2，已付款 **/
    private Byte payStatus;

    /** 用户选择的支付方式的id **/
    private Byte payId;

    /** 用户选择的支付方式的名称 **/
    private String payName;

    /** 订单生成时间 **/
    private Date addTime;

    /** 订单确认时间 **/
    private Date confirmTime;

    /** 订单支付时间 **/
    private Date payTime;

    /** 订单配送时间 **/
    private Date shippingTime;

    /** 收货人的国家，用户页面填写， **/
    private Short country;

    /** 收货人的省份，用户页面填写 **/
    private Short province;

    /** 收货人的城市，用户页面填写 **/
    private Short city;

    /** 收货人的地区，用户页面填写 **/
    private Short district;

    /** 收货人的详细地址，用户页面填写 **/
    private String address;

    /** 订单ID **/
    public Integer getId() {
        return id;
    }

    /** 订单ID **/
    public void setId(Integer id) {
        this.id = id;
    }

    /** 订单号 **/
    public String getOrderCode() {
        return orderCode;
    }

    /** 订单号 **/
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /** 下单用户ID **/
    public Integer getUserId() {
        return userId;
    }

    /** 下单用户ID **/
    public void setUserId(Integer userId) {
        this.userId = userId;
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

    /** 商品总金额 **/
    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    /** 商品总金额 **/
    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    /** 已付款金额 **/
    public BigDecimal getMoneyPaid() {
        return moneyPaid;
    }

    /** 已付款金额 **/
    public void setMoneyPaid(BigDecimal moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    /** 应付款金额 **/
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /** 应付款金额 **/
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /** 折扣金额 **/
    public BigDecimal getDiscount() {
        return discount;
    }

    /** 折扣金额 **/
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /** 订单状态（0，未确认；1，已确认；2，已取消；3，无效；4，退货；） **/
    public Byte getOrderStatus() {
        return orderStatus;
    }

    /** 订单状态（0，未确认；1，已确认；2，已取消；3，无效；4，退货；） **/
    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    /** 商品配送情况，0，未发货；1，已发货；2，已收货；3，备货中 **/
    public Byte getShippingStatus() {
        return shippingStatus;
    }

    /** 商品配送情况，0，未发货；1，已发货；2，已收货；3，备货中 **/
    public void setShippingStatus(Byte shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    /** 支付状态；0，未付款；1，付款中；2，已付款 **/
    public Byte getPayStatus() {
        return payStatus;
    }

    /** 支付状态；0，未付款；1，付款中；2，已付款 **/
    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    /** 用户选择的支付方式的id **/
    public Byte getPayId() {
        return payId;
    }

    /** 用户选择的支付方式的id **/
    public void setPayId(Byte payId) {
        this.payId = payId;
    }

    /** 用户选择的支付方式的名称 **/
    public String getPayName() {
        return payName;
    }

    /** 用户选择的支付方式的名称 **/
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /** 订单生成时间 **/
    public Date getAddTime() {
        return addTime;
    }

    /** 订单生成时间 **/
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /** 订单确认时间 **/
    public Date getConfirmTime() {
        return confirmTime;
    }

    /** 订单确认时间 **/
    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    /** 订单支付时间 **/
    public Date getPayTime() {
        return payTime;
    }

    /** 订单支付时间 **/
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /** 订单配送时间 **/
    public Date getShippingTime() {
        return shippingTime;
    }

    /** 订单配送时间 **/
    public void setShippingTime(Date shippingTime) {
        this.shippingTime = shippingTime;
    }

    /** 收货人的国家，用户页面填写， **/
    public Short getCountry() {
        return country;
    }

    /** 收货人的国家，用户页面填写， **/
    public void setCountry(Short country) {
        this.country = country;
    }

    /** 收货人的省份，用户页面填写 **/
    public Short getProvince() {
        return province;
    }

    /** 收货人的省份，用户页面填写 **/
    public void setProvince(Short province) {
        this.province = province;
    }

    /** 收货人的城市，用户页面填写 **/
    public Short getCity() {
        return city;
    }

    /** 收货人的城市，用户页面填写 **/
    public void setCity(Short city) {
        this.city = city;
    }

    /** 收货人的地区，用户页面填写 **/
    public Short getDistrict() {
        return district;
    }

    /** 收货人的地区，用户页面填写 **/
    public void setDistrict(Short district) {
        this.district = district;
    }

    /** 收货人的详细地址，用户页面填写 **/
    public String getAddress() {
        return address;
    }

    /** 收货人的详细地址，用户页面填写 **/
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}