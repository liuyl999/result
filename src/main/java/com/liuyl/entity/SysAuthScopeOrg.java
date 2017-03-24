package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_auth_scope_org")
public class SysAuthScopeOrg {
    /**
     * 主键
     */
    @Id
    @Column(name = "sp_org_id")
    private String spOrgId;

    /**
     * 功能id：sys_function表主键
     */
    @Column(name = "func_id")
    private String funcId;

    /**
     * sys_auth_function表主键
     */
    @Column(name = "auth_func_id")
    private String authFuncId;

    /**
     * 范围对象id：部门id或角色id或人员id
     */
    @Column(name = "obj_id")
    private String objId;

    /**
     * 部门编码
     */
    @Column(name = "org_no")
    private String orgNo;

    /**
     * 范围对象类型：1部门 2角色 3人员 4本部门 5所属集团 6所属公司 7所属项目部
     */
    @Column(name = "obj_type")
    private Integer objType;

    /**
     * 是否包含下级：0否 1是
     */
    @Column(name = "is_contain_sub")
    private Integer isContainSub;

    /**
     * 获取主键
     *
     * @return sp_org_id - 主键
     */
    public String getSpOrgId() {
        return spOrgId;
    }

    /**
     * 设置主键
     *
     * @param spOrgId 主键
     */
    public void setSpOrgId(String spOrgId) {
        this.spOrgId = spOrgId;
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
     * 获取sys_auth_function表主键
     *
     * @return auth_func_id - sys_auth_function表主键
     */
    public String getAuthFuncId() {
        return authFuncId;
    }

    /**
     * 设置sys_auth_function表主键
     *
     * @param authFuncId sys_auth_function表主键
     */
    public void setAuthFuncId(String authFuncId) {
        this.authFuncId = authFuncId;
    }

    /**
     * 获取范围对象id：部门id或角色id或人员id
     *
     * @return obj_id - 范围对象id：部门id或角色id或人员id
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 设置范围对象id：部门id或角色id或人员id
     *
     * @param objId 范围对象id：部门id或角色id或人员id
     */
    public void setObjId(String objId) {
        this.objId = objId;
    }

    /**
     * 获取部门编码
     *
     * @return org_no - 部门编码
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设置部门编码
     *
     * @param orgNo 部门编码
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    /**
     * 获取范围对象类型：1部门 2角色 3人员 4本部门 5所属集团 6所属公司 7所属项目部
     *
     * @return obj_type - 范围对象类型：1部门 2角色 3人员 4本部门 5所属集团 6所属公司 7所属项目部
     */
    public Integer getObjType() {
        return objType;
    }

    /**
     * 设置范围对象类型：1部门 2角色 3人员 4本部门 5所属集团 6所属公司 7所属项目部
     *
     * @param objType 范围对象类型：1部门 2角色 3人员 4本部门 5所属集团 6所属公司 7所属项目部
     */
    public void setObjType(Integer objType) {
        this.objType = objType;
    }

    /**
     * 获取是否包含下级：0否 1是
     *
     * @return is_contain_sub - 是否包含下级：0否 1是
     */
    public Integer getIsContainSub() {
        return isContainSub;
    }

    /**
     * 设置是否包含下级：0否 1是
     *
     * @param isContainSub 是否包含下级：0否 1是
     */
    public void setIsContainSub(Integer isContainSub) {
        this.isContainSub = isContainSub;
    }
}