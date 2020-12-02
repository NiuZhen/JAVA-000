package com.geektime.springbootdemo.entity.shop;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表 （表名：t_goods）
 * <br>
 * <br>
 * 【重要提示】：<br>
 * &nbsp;&nbsp;此类通过 Mybatis Generator 逆向生成，禁止手动修改！<br>（因项目需求持续性会发生变更，当调整数据表字段时，需要再重新逆向生成此类）
 **/
public class Goods {
    /** 商品ID **/
    private Integer id;

    /** 商品编码 **/
    private String goodsCode;

    /** 商品名称 **/
    private String goodsName;

    /** 商品简介 **/
    private String goodsInfo;

    /** 市场价格 **/
    private BigDecimal marketPrice;

    /** 成本价格 **/
    private BigDecimal costPrice;

    /** 销售价格 **/
    private BigDecimal shopPrice;

    /** 单位 **/
    private String unitName;

    /** 浏览量 **/
    private Integer browse;

    /** 商品url **/
    private String goodsImg;

    /** 分类id **/
    private Byte categoryId;

    /** 分类名称 **/
    private String categoryName;

    /** 商品库存 **/
    private Integer goodsStock;

    /** 状态（0：未上架，1：上架 2:下架） **/
    private Boolean isShow;

    /** 备注 **/
    private String remark;

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    /** 商品ID **/
    public Integer getId() {
        return id;
    }

    /** 商品ID **/
    public void setId(Integer id) {
        this.id = id;
    }

    /** 商品编码 **/
    public String getGoodsCode() {
        return goodsCode;
    }

    /** 商品编码 **/
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /** 商品名称 **/
    public String getGoodsName() {
        return goodsName;
    }

    /** 商品名称 **/
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /** 商品简介 **/
    public String getGoodsInfo() {
        return goodsInfo;
    }

    /** 商品简介 **/
    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo == null ? null : goodsInfo.trim();
    }

    /** 市场价格 **/
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    /** 市场价格 **/
    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    /** 成本价格 **/
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /** 成本价格 **/
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /** 销售价格 **/
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    /** 销售价格 **/
    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    /** 单位 **/
    public String getUnitName() {
        return unitName;
    }

    /** 单位 **/
    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }

    /** 浏览量 **/
    public Integer getBrowse() {
        return browse;
    }

    /** 浏览量 **/
    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    /** 商品url **/
    public String getGoodsImg() {
        return goodsImg;
    }

    /** 商品url **/
    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    /** 分类id **/
    public Byte getCategoryId() {
        return categoryId;
    }

    /** 分类id **/
    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    /** 分类名称 **/
    public String getCategoryName() {
        return categoryName;
    }

    /** 分类名称 **/
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /** 商品库存 **/
    public Integer getGoodsStock() {
        return goodsStock;
    }

    /** 商品库存 **/
    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    /** 状态（0：未上架，1：上架 2:下架） **/
    public Boolean getIsShow() {
        return isShow;
    }

    /** 状态（0：未上架，1：上架 2:下架） **/
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /** 备注 **/
    public String getRemark() {
        return remark;
    }

    /** 备注 **/
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}