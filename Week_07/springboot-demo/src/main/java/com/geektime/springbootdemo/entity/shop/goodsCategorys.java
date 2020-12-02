package com.geektime.springbootdemo.entity.shop;

import java.util.Date;

/**
 * 商品分类 （表名：t_goods_categorys）
 * <br>
 * <br>
 * 【重要提示】：<br>
 * &nbsp;&nbsp;此类通过 Mybatis Generator 逆向生成，禁止手动修改！<br>（因项目需求持续性会发生变更，当调整数据表字段时，需要再重新逆向生成此类）
 **/
public class goodsCategorys {
    /** 商品类别ID **/
    private Integer id;

    /** 上级类别ID **/
    private Integer parentId;

    /** 类别名称 **/
    private String categoryName;

    /** 创建时间 **/
    private Date createTime;

    /** 更新时间 **/
    private Date updateTime;

    /** 商品类别ID **/
    public Integer getId() {
        return id;
    }

    /** 商品类别ID **/
    public void setId(Integer id) {
        this.id = id;
    }

    /** 上级类别ID **/
    public Integer getParentId() {
        return parentId;
    }

    /** 上级类别ID **/
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /** 类别名称 **/
    public String getCategoryName() {
        return categoryName;
    }

    /** 类别名称 **/
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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