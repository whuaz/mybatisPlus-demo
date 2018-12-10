package com.whuaz.mybatis.web;


import com.whuaz.mybatis.entity.TUser;
import com.whuaz.mybatis.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author grez
 * @since 2018-12-03
 */
@RestController
@RequestMapping(value = "/user")
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @GetMapping(value = "/list")
    public TUser list(String userId) {
        return tUserService.selectById(userId);
    }

}

