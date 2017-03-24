package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_auth_function")
public class SysAuthFunction {
    /**
     * 主键
     */
    @Id
    @Column(name = "auth_func_id")
    private String authFuncId;

    /**
     * 功能id：sys_function表主键
     */
    @Column(name = "func_id")
    private String funcId;

    /**
     * 授权对象id：部门编号或角色id或人员id
     */
    @Column(name = "obj_id")
    private String objId;

    /**
     * 授权对象类型：1部门 2角色 3人员
     */
    @Column(name = "obj_type")
    private Integer objType;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "auth_func_state")
    private Integer authFuncState;

    /**
     * 部门编号
     */
    @Column(name = "org_no")
    private String orgNo;

    /**
     * 获取主键
     *
     * @return auth_func_id - 主键
     */
    public String getAuthFuncId() {
        return authFuncId;
    }

    /**
     * 设置主键
     *
     * @param authFuncId 主键
     */
    public void setAuthFuncId(String authFuncId) {
        this.authFuncId = authFuncId;
    }

    /**
     * 获取功能id：sys_function表主键
     *
     * @return func_id - 功能id：sys_function表主键
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 设置功能id：sys_function表主键
     *
     * @param funcId 功能id：sys_function表主键
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * 获取授权对象id：部门编号或角色id或人员id
     *
     * @return obj_id - 授权对象id：部门编号或角色id或人员id
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 设置授权对象id：部门编号或角色id或人员id
     *
     * @param objId 授权对象id：部门编号或角色id或人员id
     */
    public void setObjId(String objId) {
        this.objId = objId;
    }

    /**
     * 获取授权对象类型：1部门 2角色 3人员
     *
     * @return obj_type - 授权对象类型：1部门 2角色 3人员
     */
    public Integer getObjType() {
        return objType;
    }

    /**
     * 设置授权对象类型：1部门 2角色 3人员
     *
     * @param objType 授权对象类型：1部门 2角色 3人员
     */
    public void setObjType(Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return auth_func_state - 状态： 0禁用 1启用
     */
    public Integer getAuthFuncState() {
        return authFuncState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param authFuncState 状态： 0禁用 1启用
     */
    public void setAuthFuncState(Integer authFuncState) {
        this.authFuncState = authFuncState;
    }

    /**
     * 获取部门编号
     *
     * @return org_no - 部门编号
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设置部门编号
     *
     * @param orgNo 部门编号
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }
}