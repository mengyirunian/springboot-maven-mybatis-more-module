package com.zpz.controller.system;

import com.zpz.model.system.User;
import com.zpz.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 用户控制器
 * @author 张盼枝
 * @QQ 1083447590
 * @date 2017-06-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/add")
    public String add() {
        User user=new User();
        user.setEnable(1);
        user.setPassword("11");
        user.setUsername("23232");

        int i = userService.saveUserWithBackId(user);
        return i+"";
    }
}
