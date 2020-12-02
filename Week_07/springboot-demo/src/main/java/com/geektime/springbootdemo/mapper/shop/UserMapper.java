package com.geektime.springbootdemo.mapper.shop;

import com.geektime.springbootdemo.entity.shop.User;
import com.geektime.springbootdemo.entity.shop.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}