package com.zpz.model.system;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Administrator on 2017-6-30.
 */
public class RoleResource {
    private Long id;
    private Long roleId;
    private Role resourceRole;
    private Long resourceId;
    private Resource resourceResource;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private Long createId;
    private User createUser;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private Long updateId;
    private User updateResource;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Role getResourceRole() {
        return resourceRole;
    }

    public void setResourceRole(Role resourceRole) {
        this.resourceRole = resourceRole;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public Resource getResourceResource() {
        return resourceResource;
    }

    public void setResourceResource(Resource resourceResource) {
        this.resourceResource = resourceResource;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public User getUpdateResource() {
        return updateResource;
    }

    public void setUpdateResource(User updateResource) {
        this.updateResource = updateResource;
    }
}
