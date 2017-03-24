package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_project_total_design")
public class MtProjectTotalDesign {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 单据编号
     */
    private String code;

    /**
     * 单据名称
     */
    private String name;

    /**
     * 填报日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 项目部id
     */
    @Column(name = "add_org_id")
    private String addOrgId;

    /**
     * 项目部编码
     */
    @Column(name = "add_org_no")
    private String addOrgNo;

    /**
     * 编制人
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 0:
     */
    private Integer state;

    /**
     * 提交状态(暂不用)
     */
    @Column(name = "submit_state")
    private Byte submitState;

    /**
     * 添加日期
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 月份
     */
    private Integer month;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取单据编号
     *
     * @return code - 单据编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置单据编号
     *
     * @param code 单据编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取单据名称
     *
     * @return name - 单据名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置单据名称
     *
     * @param name 单据名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取填报日期
     *
     * @return create_time - 填报日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置填报日期
     *
     * @param createTime 填报日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取项目部id
     *
     * @return add_org_id - 项目部id
     */
    public String getAddOrgId() {
        return addOrgId;
    }

    /**
     * 设置项目部id
     *
     * @param addOrgId 项目部id
     */
    public void setAddOrgId(String addOrgId) {
        this.addOrgId = addOrgId;
    }

    /**
     * 获取项目部编码
     *
     * @return add_org_no - 项目部编码
     */
    public String getAddOrgNo() {
        return addOrgNo;
    }

    /**
     * 设置项目部编码
     *
     * @param addOrgNo 项目部编码
     */
    public void setAddOrgNo(String addOrgNo) {
        this.addOrgNo = addOrgNo;
    }

    /**
     * 获取编制人
     *
     * @return add_user_id - 编制人
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置编制人
     *
     * @param addUserId 编制人
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
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
     * 获取0:
     *
     * @return state - 0:
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0:
     *
     * @param state 0:
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取提交状态(暂不用)
     *
     * @return submit_state - 提交状态(暂不用)
     */
    public Byte getSubmitState() {
        return submitState;
    }

    /**
     * 设置提交状态(暂不用)
     *
     * @param submitState 提交状态(暂不用)
     */
    public void setSubmitState(Byte submitState) {
        this.submitState = submitState;
    }

    /**
     * 获取添加日期
     *
     * @return add_time - 添加日期
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加日期
     *
     * @param addTime 添加日期
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取月份
     *
     * @return month - 月份
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * 设置月份
     *
     * @param month 月份
     */
    public void setMonth(Integer month) {
        this.month = month;
    }
}