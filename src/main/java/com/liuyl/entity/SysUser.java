package com.liuyl.entity;

import com.liuyl.annotation.*;
import com.liuyl.annotation.Transient;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 唯一主键
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户登录账号，唯一
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    @Column(name = "user_pwd")
    private String userPwd;

    /**
     * 所属机构id
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "user_state")
    private Integer userState;

    /**
     * 性别：1男 2女
     */
    @Column(name = "user_sex")
    private Integer userSex;

    /**
     * 手机号码
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 邮箱
     */
    @Column(name = "user_email")
    private String userEmail;

    /**
     * 备注
     */
    private String remark;

    /**
     * 添加人id
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 查询条件
     */
    @Transient
    private String searchKey;

    /**
     * 获取唯一主键
     *
     * @return user_id - 唯一主键
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置唯一主键
     *
     * @param userId 唯一主键
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户登录账号，唯一
     *
     * @return login_id - 用户登录账号，唯一
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置用户登录账号，唯一
     *
     * @param loginId 用户登录账号，唯一
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     *
     * @return user_pwd - 用户密码
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置用户密码
     *
     * @param userPwd 用户密码
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    /**
     * 获取所属机构id
     *
     * @return org_id - 所属机构id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置所属机构id
     *
     * @param orgId 所属机构id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return user_state - 状态： 0禁用 1启用
     */
    public Integer getUserState() {
        return userState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param userState 状态： 0禁用 1启用
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    /**
     * 获取性别：1男 2女
     *
     * @return user_sex - 性别：1男 2女
     */
    public Integer getUserSex() {
        return userSex;
    }

    /**
     * 设置性别：1男 2女
     *
     * @param userSex 性别：1男 2女
     */
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取手机号码
     *
     * @return user_phone - 手机号码
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号码
     *
     * @param userPhone 手机号码
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取邮箱
     *
     * @return user_email - 邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置邮箱
     *
     * @param userEmail 邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取添加人id
     *
     * @return add_user_id - 添加人id
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置添加人id
     *
     * @param addUserId 添加人id
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
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

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
}