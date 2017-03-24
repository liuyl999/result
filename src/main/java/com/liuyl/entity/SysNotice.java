package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_notice")
public class SysNotice {
    /**
     * 主键
     */
    @Id
    @Column(name = "notice_id")
    private String noticeId;

    /**
     * 公告标题
     */
    @Column(name = "notice_title")
    private String noticeTitle;

    /**
     * 公告内容
     */
    @Column(name = "notice_content")
    private String noticeContent;

    /**
     * 公告类型：1一般 2紧急 3非常紧急
     */
    @Column(name = "notice_type")
    private Integer noticeType;

    /**
     * 有效起始日期：yyyy-MM-dd
     */
    @Column(name = "notice_begin_date")
    private String noticeBeginDate;

    /**
     * 有效结束日期：yyyy-MM-dd
     */
    @Column(name = "notice_end_date")
    private String noticeEndDate;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "notice_state")
    private Integer noticeState;

    /**
     * 备注
     */
    private String remark;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 添加人id
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 添加部门id
     */
    @Column(name = "add_org_id")
    private String addOrgId;

    /**
     * 添加部门编号
     */
    @Column(name = "add_org_no")
    private String addOrgNo;

    /**
     * 排序时间
     */
    @Column(name = "order_time")
    private Long orderTime;

    /**
     * 获取主键
     *
     * @return notice_id - 主键
     */
    public String getNoticeId() {
        return noticeId;
    }

    /**
     * 设置主键
     *
     * @param noticeId 主键
     */
    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    /**
     * 获取公告标题
     *
     * @return notice_title - 公告标题
     */
    public String getNoticeTitle() {
        return noticeTitle;
    }

    /**
     * 设置公告标题
     *
     * @param noticeTitle 公告标题
     */
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    /**
     * 获取公告内容
     *
     * @return notice_content - 公告内容
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * 设置公告内容
     *
     * @param noticeContent 公告内容
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    /**
     * 获取公告类型：1一般 2紧急 3非常紧急
     *
     * @return notice_type - 公告类型：1一般 2紧急 3非常紧急
     */
    public Integer getNoticeType() {
        return noticeType;
    }

    /**
     * 设置公告类型：1一般 2紧急 3非常紧急
     *
     * @param noticeType 公告类型：1一般 2紧急 3非常紧急
     */
    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * 获取有效起始日期：yyyy-MM-dd
     *
     * @return notice_begin_date - 有效起始日期：yyyy-MM-dd
     */
    public String getNoticeBeginDate() {
        return noticeBeginDate;
    }

    /**
     * 设置有效起始日期：yyyy-MM-dd
     *
     * @param noticeBeginDate 有效起始日期：yyyy-MM-dd
     */
    public void setNoticeBeginDate(String noticeBeginDate) {
        this.noticeBeginDate = noticeBeginDate;
    }

    /**
     * 获取有效结束日期：yyyy-MM-dd
     *
     * @return notice_end_date - 有效结束日期：yyyy-MM-dd
     */
    public String getNoticeEndDate() {
        return noticeEndDate;
    }

    /**
     * 设置有效结束日期：yyyy-MM-dd
     *
     * @param noticeEndDate 有效结束日期：yyyy-MM-dd
     */
    public void setNoticeEndDate(String noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return notice_state - 状态： 0禁用 1启用
     */
    public Integer getNoticeState() {
        return noticeState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param noticeState 状态： 0禁用 1启用
     */
    public void setNoticeState(Integer noticeState) {
        this.noticeState = noticeState;
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
     * 获取添加部门id
     *
     * @return add_org_id - 添加部门id
     */
    public String getAddOrgId() {
        return addOrgId;
    }

    /**
     * 设置添加部门id
     *
     * @param addOrgId 添加部门id
     */
    public void setAddOrgId(String addOrgId) {
        this.addOrgId = addOrgId;
    }

    /**
     * 获取添加部门编号
     *
     * @return add_org_no - 添加部门编号
     */
    public String getAddOrgNo() {
        return addOrgNo;
    }

    /**
     * 设置添加部门编号
     *
     * @param addOrgNo 添加部门编号
     */
    public void setAddOrgNo(String addOrgNo) {
        this.addOrgNo = addOrgNo;
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