package com.geektime.springbootdemo.services.impl;

import com.geektime.springbootdemo.dto.UserDto;
import com.geektime.springbootdemo.entity.shop.User;
import com.geektime.springbootdemo.mapper.shop.ex.UserExMapper;
import com.geektime.web.rest.response.RestResponse;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.geektime.springbootdemo.mapper.shop.UserMapper;
import com.geektime.springbootdemo.services.UserServices;
import com.geektime.web.rest.response.PageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 * @since 2020/12/2 11:22
 */
@Slf4j
@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private  UserExMapper userExMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageDTO getUserList(Integer pageNum, Integer pageSize) {
        long total = 0;
        UserDto userDto=new UserDto();
        userDto.setId(1);
        Page p = PageHelper.startPage(pageNum, pageSize, true);
        List<User> userList = null;
        try {
//            User user=userMapper.selectByPrimaryKey(1);
            userList = userExMapper.findList(userDto);
            total = p.getTotal();
        } catch (Exception e) {
            log.info("异常" + e);
        }
        return new PageDTO(pageNum, pageSize, total, userList);

    }

    @Override
    public RestResponse getUser(Integer id) {

//        User user= userMapper.selectByPrimaryKey(id);
//        if(null==user){
//            return RestResponse.fail(20,"用户不存在");
//        }
        return RestResponse.success(null);
    }
}
