package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_role_function")
public class SysRoleFunction {
    /**
     * 唯一主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 功能id
     */
    @Column(name = "func_id")
    private String funcId;

    /**
     * 获取唯一主键
     *
     * @return id - 唯一主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置唯一主键
     *
     * @param id 唯一主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取功能id
     *
     * @return func_id - 功能id
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 设置功能id
     *
     * @param funcId 功能id
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }
}