package com.zpz.controller.system;

import com.zpz.model.system.User;
import com.zpz.service.system.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 用户控制器
 * @author 张盼枝
 * @QQ 1083447590
 * @date 2017-06-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "/get")
    public User add() {
        User user=new User();
        user.setId(10000l);

        User reu = userService.findUser(user);
        return reu;
    }
}
