package com.zpz.mapper.system;


import com.zpz.model.system.User;

/**
 * @author 张盼枝
 * @QQ 1083447590
 * @date 2017-06-29
 * 用户dao 接口
 */
public interface UserMapper {

    /**
     * 插入用户，并将主键设置到user中
     * 注意：返回的是数据库影响条数，即1
     */
    public int insertUserWithBackId(User user);
}
