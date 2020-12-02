package com.geektime.springbootdemo.mapper.shop;

import com.geektime.springbootdemo.entity.shop.goodsCategorys;
import com.geektime.springbootdemo.entity.shop.goodsCategorysExample;
import java.util.List;

public interface goodsCategorysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(goodsCategorys record);

    int insertSelective(goodsCategorys record);

    List<goodsCategorys> selectByExample(goodsCategorysExample example);

    goodsCategorys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(goodsCategorys record);

    int updateByPrimaryKey(goodsCategorys record);
}