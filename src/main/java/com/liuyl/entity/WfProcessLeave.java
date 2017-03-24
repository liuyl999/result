package com.liuyl.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "wf_process_leave")
public class WfProcessLeave {
    /**
     * 主键
     */
    @Id
    @Column(name = "leave_id")
    private String leaveId;

    /**
     * 请假类型，1：事假，2：病假，3：年假，4：调休假
     */
    @Column(name = "leave_type")
    private Integer leaveType;

    /**
     * 开始时间
     */
    @Column(name = "leave_start_date")
    private Date leaveStartDate;

    /**
     * 结束时间
     */
    @Column(name = "leave_end_date")
    private Date leaveEndDate;

    @Column(name = "leave_days")
    private BigDecimal leaveDays;

    /**
     * 内容
     */
    @Column(name = "leave_content")
    private String leaveContent;

    /**
     * 状态：1：草稿，2：审批中,3:审批通过，4：审批未通过
     */
    @Column(name = "leave_state")
    private Integer leaveState;

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

    @Column(name = "PROC_DEF_ID")
    private String procDefId;

    @Column(name = "PROC_INST_ID")
    private String procInstId;

    /**
     * 获取主键
     *
     * @return leave_id - 主键
     */
    public String getLeaveId() {
        return leaveId;
    }

    /**
     * 设置主键
     *
     * @param leaveId 主键
     */
    public void setLeaveId(String leaveId) {
        this.leaveId = leaveId;
    }

    /**
     * 获取请假类型，1：事假，2：病假，3：年假，4：调休假
     *
     * @return leave_type - 请假类型，1：事假，2：病假，3：年假，4：调休假
     */
    public Integer getLeaveType() {
        return leaveType;
    }

    /**
     * 设置请假类型，1：事假，2：病假，3：年假，4：调休假
     *
     * @param leaveType 请假类型，1：事假，2：病假，3：年假，4：调休假
     */
    public void setLeaveType(Integer leaveType) {
        this.leaveType = leaveType;
    }

    /**
     * 获取开始时间
     *
     * @return leave_start_date - 开始时间
     */
    public Date getLeaveStartDate() {
        return leaveStartDate;
    }

    /**
     * 设置开始时间
     *
     * @param leaveStartDate 开始时间
     */
    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    /**
     * 获取结束时间
     *
     * @return leave_end_date - 结束时间
     */
    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    /**
     * 设置结束时间
     *
     * @param leaveEndDate 结束时间
     */
    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    /**
     * @return leave_days
     */
    public BigDecimal getLeaveDays() {
        return leaveDays;
    }

    /**
     * @param leaveDays
     */
    public void setLeaveDays(BigDecimal leaveDays) {
        this.leaveDays = leaveDays;
    }

    /**
     * 获取内容
     *
     * @return leave_content - 内容
     */
    public String getLeaveContent() {
        return leaveContent;
    }

    /**
     * 设置内容
     *
     * @param leaveContent 内容
     */
    public void setLeaveContent(String leaveContent) {
        this.leaveContent = leaveContent;
    }

    /**
     * 获取状态：1：草稿，2：审批中,3:审批通过，4：审批未通过
     *
     * @return leave_state - 状态：1：草稿，2：审批中,3:审批通过，4：审批未通过
     */
    public Integer getLeaveState() {
        return leaveState;
    }

    /**
     * 设置状态：1：草稿，2：审批中,3:审批通过，4：审批未通过
     *
     * @param leaveState 状态：1：草稿，2：审批中,3:审批通过，4：审批未通过
     */
    public void setLeaveState(Integer leaveState) {
        this.leaveState = leaveState;
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
     * @return PROC_DEF_ID
     */
    public String getProcDefId() {
        return procDefId;
    }

    /**
     * @param procDefId
     */
    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    /**
     * @return PROC_INST_ID
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }
}