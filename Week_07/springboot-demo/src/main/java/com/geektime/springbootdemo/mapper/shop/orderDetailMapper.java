package com.geektime.springbootdemo.mapper.shop;

import com.geektime.springbootdemo.entity.shop.orderDetail;
import com.geektime.springbootdemo.entity.shop.orderDetailExample;
import java.util.List;

public interface orderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(orderDetail record);

    int insertSelective(orderDetail record);

    List<orderDetail> selectByExampleWithBLOBs(orderDetailExample example);

    List<orderDetail> selectByExample(orderDetailExample example);

    orderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(orderDetail record);

    int updateByPrimaryKeyWithBLOBs(orderDetail record);

    int updateByPrimaryKey(orderDetail record);
}