package com.geektime.springbootdemo.mapper.shop;

import com.geektime.springbootdemo.entity.shop.Goods;
import com.geektime.springbootdemo.entity.shop.GoodsExample;
import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}