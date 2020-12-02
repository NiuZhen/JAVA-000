package com.geektime.springbootdemo.services;

import com.geektime.springbootdemo.entity.shop.User;
import com.geektime.web.rest.response.PageDTO;
import com.geektime.web.rest.response.RestResponse;

import java.util.List;

/**
 * @author Administrator
 * @since 2020/12/2 11:21
 */
public interface UserServices {

    PageDTO getUserList(Integer pageNum,Integer pageSize);
    RestResponse getUser(Integer id);

}
