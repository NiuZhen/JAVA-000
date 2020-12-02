package com.geektime.springbootdemo.mapper.shop.ex;

import com.geektime.springbootdemo.dto.UserDto;
import com.geektime.springbootdemo.entity.shop.User;
import com.geektime.springbootdemo.mapper.shop.UserMapper;

import java.util.List;

/**
 * @author Administrator
 * @since 2020/12/2 14:21
 */
public interface UserExMapper extends UserMapper {
    List<User> findList(UserDto user);
}
