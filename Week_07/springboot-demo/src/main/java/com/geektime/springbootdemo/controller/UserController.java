package com.geektime.springbootdemo.controller;

import com.geektime.springbootdemo.services.UserServices;
import com.geektime.web.rest.response.PageDTO;
import com.geektime.web.rest.response.RestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 * @since 2020/12/2 11:17
 */
@Slf4j
@RestController
@RequestMapping("/api/shop/user")
@Api(tags = "用户相关接口", value = "UserController")
public class UserController {

    @Autowired
    private UserServices userServices;

    @ApiOperation(value = "查询接口", notes = "根据搜索条件查询")
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public RestResponse getUser(HttpServletRequest request, @RequestParam(defaultValue = "1") Integer id) {
       return userServices.getUser(id);
    }



    @ApiOperation(value = "查询接口", notes = "根据搜索条件查询")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public RestResponse getList(HttpServletRequest request, @RequestParam(defaultValue = "1") Integer currPage,
                             @RequestParam(defaultValue = "10") Integer pageSize) {
        PageDTO pageDTO = userServices.getUserList(currPage,pageSize);
        return RestResponse.success(pageDTO);
    }
}
