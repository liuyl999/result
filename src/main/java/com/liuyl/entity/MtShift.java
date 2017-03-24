package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_shift")
public class MtShift {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 工班编号
     */
    private String code;

    /**
     * 工班名称
     */
    private String name;

    /**
     * 工班负责人
     */
    private String leader;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 部门编号
     */
    @Column(name = "add_org_id")
    private String addOrgId;

    /**
     * 部门编码
     */
    @Column(name = "add_org_no")
    private String addOrgNo;

    /**
     * 添加人Id
     */
    @Column(name = "add_user_id")
    private String addUserId;

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
     * 核算对象id
     */
    @Column(name = "accounting_obj_id")
    private Long accountingObjId;

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
     * 获取工班编号
     *
     * @return code - 工班编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置工班编号
     *
     * @param code 工班编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取工班名称
     *
     * @return name - 工班名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置工班名称
     *
     * @param name 工班名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取工班负责人
     *
     * @return leader - 工班负责人
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置工班负责人
     *
     * @param leader 工班负责人
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取部门编号
     *
     * @return add_org_id - 部门编号
     */
    public String getAddOrgId() {
        return addOrgId;
    }

    /**
     * 设置部门编号
     *
     * @param addOrgId 部门编号
     */
    public void setAddOrgId(String addOrgId) {
        this.addOrgId = addOrgId;
    }

    /**
     * 获取部门编码
     *
     * @return add_org_no - 部门编码
     */
    public String getAddOrgNo() {
        return addOrgNo;
    }

    /**
     * 设置部门编码
     *
     * @param addOrgNo 部门编码
     */
    public void setAddOrgNo(String addOrgNo) {
        this.addOrgNo = addOrgNo;
    }

    /**
     * 获取添加人Id
     *
     * @return add_user_id - 添加人Id
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置添加人Id
     *
     * @param addUserId 添加人Id
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
     * 获取核算对象id
     *
     * @return accounting_obj_id - 核算对象id
     */
    public Long getAccountingObjId() {
        return accountingObjId;
    }

    /**
     * 设置核算对象id
     *
     * @param accountingObjId 核算对象id
     */
    public void setAccountingObjId(Long accountingObjId) {
        this.accountingObjId = accountingObjId;
    }
}