package com.zpz.model.system;

/**
 * @author 张盼枝
 * @QQ 1083447590
 * @date 2017-06-29
 * 用户实体
 */

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer enable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}
