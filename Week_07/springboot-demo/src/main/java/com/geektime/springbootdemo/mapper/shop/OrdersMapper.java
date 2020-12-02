package com.geektime.springbootdemo.mapper.shop;

import com.geektime.springbootdemo.entity.shop.Orders;
import com.geektime.springbootdemo.entity.shop.OrdersExample;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}