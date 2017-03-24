package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_login_info")
public class SysLoginInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 登录名id
     */
    @Column(name = "login_id")
    private String loginId;

    /**
     * 登录用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登录ip
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 退出时间
     */
    @Column(name = "login_out_time")
    private Date loginOutTime;

    /**
     * 在线时长（秒）
     */
    @Column(name = "login_online")
    private Integer loginOnline;

    /**
     * 在线时长显示
     */
    @Column(name = "login_online_show")
    private String loginOnlineShow;

    @Column(name = "session_id")
    private String sessionId;

    /**
     * 排序时间
     */
    @Column(name = "order_time")
    private Long orderTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取登录名id
     *
     * @return login_id - 登录名id
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 设置登录名id
     *
     * @param loginId 登录名id
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 获取登录用户名
     *
     * @return user_name - 登录用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置登录用户名
     *
     * @param userName 登录用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取登录ip
     *
     * @return login_ip - 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录ip
     *
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取登录时间
     *
     * @return login_time - 登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置登录时间
     *
     * @param loginTime 登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取退出时间
     *
     * @return login_out_time - 退出时间
     */
    public Date getLoginOutTime() {
        return loginOutTime;
    }

    /**
     * 设置退出时间
     *
     * @param loginOutTime 退出时间
     */
    public void setLoginOutTime(Date loginOutTime) {
        this.loginOutTime = loginOutTime;
    }

    /**
     * 获取在线时长（秒）
     *
     * @return login_online - 在线时长（秒）
     */
    public Integer getLoginOnline() {
        return loginOnline;
    }

    /**
     * 设置在线时长（秒）
     *
     * @param loginOnline 在线时长（秒）
     */
    public void setLoginOnline(Integer loginOnline) {
        this.loginOnline = loginOnline;
    }

    /**
     * 获取在线时长显示
     *
     * @return login_online_show - 在线时长显示
     */
    public String getLoginOnlineShow() {
        return loginOnlineShow;
    }

    /**
     * 设置在线时长显示
     *
     * @param loginOnlineShow 在线时长显示
     */
    public void setLoginOnlineShow(String loginOnlineShow) {
        this.loginOnlineShow = loginOnlineShow;
    }

    /**
     * @return session_id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 获取排序时间
     *
     * @return order_time - 排序时间
     */
    public Long getOrderTime() {
        return orderTime;
    }

    /**
     * 设置排序时间
     *
     * @param orderTime 排序时间
     */
    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }
}