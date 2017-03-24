package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_outstock")
public class MtOutstock {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 状态(0:未提交1:提交)
     */
    private Byte state;

    /**
     * 单据编号
     */
    private String code;

    /**
     * 组织id
     */
    @Column(name = "add_org_id")
    private String addOrgId;

    /**
     * 组织编码
     */
    @Column(name = "add_org_no")
    private String addOrgNo;

    /**
     * 添加人id
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 发料日期
     */
    @Column(name = "receive_date")
    private Date receiveDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 制单日期
     */
    @Column(name = "add_time")
    private Date addTime;

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
     * 获取状态(0:未提交1:提交)
     *
     * @return state - 状态(0:未提交1:提交)
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态(0:未提交1:提交)
     *
     * @param state 状态(0:未提交1:提交)
     */
    public void setState(Byte state) {
        this.state = state;
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
     * 获取组织id
     *
     * @return add_org_id - 组织id
     */
    public String getAddOrgId() {
        return addOrgId;
    }

    /**
     * 设置组织id
     *
     * @param addOrgId 组织id
     */
    public void setAddOrgId(String addOrgId) {
        this.addOrgId = addOrgId;
    }

    /**
     * 获取组织编码
     *
     * @return add_org_no - 组织编码
     */
    public String getAddOrgNo() {
        return addOrgNo;
    }

    /**
     * 设置组织编码
     *
     * @param addOrgNo 组织编码
     */
    public void setAddOrgNo(String addOrgNo) {
        this.addOrgNo = addOrgNo;
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
     * 获取发料日期
     *
     * @return receive_date - 发料日期
     */
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * 设置发料日期
     *
     * @param receiveDate 发料日期
     */
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
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
     * 获取制单日期
     *
     * @return add_time - 制单日期
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置制单日期
     *
     * @param addTime 制单日期
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}