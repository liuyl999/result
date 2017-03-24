package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_role")
public class SysRole {
    /**
     * 角色id,唯一主键
     */
    @Id
    @Column(name = "role_id")
    private String roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "role_state")
    private Integer roleState;

    private String remark;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 获取角色id,唯一主键
     *
     * @return role_id - 角色id,唯一主键
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id,唯一主键
     *
     * @param roleId 角色id,唯一主键
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return role_state - 状态： 0禁用 1启用
     */
    public Integer getRoleState() {
        return roleState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param roleState 状态： 0禁用 1启用
     */
    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}