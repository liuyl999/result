package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_shift_allot")
public class MtShiftAllot {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 调出单位
     */
    @Column(name = "from_shift_id")
    private Long fromShiftId;

    /**
     * 调出人
     */
    @Column(name = "from_shift_person_id")
    private Long fromShiftPersonId;

    /**
     * 调入单位
     */
    @Column(name = "to_shift_id")
    private Long toShiftId;

    /**
     * 调入人
     */
    @Column(name = "to_shift_person_id")
    private Long toShiftPersonId;

    /**
     * 编制单位
     */
    @Column(name = "add_org_id")
    private String addOrgId;

    /**
     * 部门编码
     */
    @Column(name = "add_org_no")
    private String addOrgNo;

    /**
     * 现场材料员
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 业务日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建日期
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 状态 0.未提交 1.已提交
     */
    private Byte state;

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
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取调出单位
     *
     * @return from_shift_id - 调出单位
     */
    public Long getFromShiftId() {
        return fromShiftId;
    }

    /**
     * 设置调出单位
     *
     * @param fromShiftId 调出单位
     */
    public void setFromShiftId(Long fromShiftId) {
        this.fromShiftId = fromShiftId;
    }

    /**
     * 获取调出人
     *
     * @return from_shift_person_id - 调出人
     */
    public Long getFromShiftPersonId() {
        return fromShiftPersonId;
    }

    /**
     * 设置调出人
     *
     * @param fromShiftPersonId 调出人
     */
    public void setFromShiftPersonId(Long fromShiftPersonId) {
        this.fromShiftPersonId = fromShiftPersonId;
    }

    /**
     * 获取调入单位
     *
     * @return to_shift_id - 调入单位
     */
    public Long getToShiftId() {
        return toShiftId;
    }

    /**
     * 设置调入单位
     *
     * @param toShiftId 调入单位
     */
    public void setToShiftId(Long toShiftId) {
        this.toShiftId = toShiftId;
    }

    /**
     * 获取调入人
     *
     * @return to_shift_person_id - 调入人
     */
    public Long getToShiftPersonId() {
        return toShiftPersonId;
    }

    /**
     * 设置调入人
     *
     * @param toShiftPersonId 调入人
     */
    public void setToShiftPersonId(Long toShiftPersonId) {
        this.toShiftPersonId = toShiftPersonId;
    }

    /**
     * 获取编制单位
     *
     * @return add_org_id - 编制单位
     */
    public String getAddOrgId() {
        return addOrgId;
    }

    /**
     * 设置编制单位
     *
     * @param addOrgId 编制单位
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
     * 获取现场材料员
     *
     * @return add_user_id - 现场材料员
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置现场材料员
     *
     * @param addUserId 现场材料员
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }

    /**
     * 获取业务日期
     *
     * @return create_date - 业务日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置业务日期
     *
     * @param createDate 业务日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * 获取创建日期
     *
     * @return add_time - 创建日期
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置创建日期
     *
     * @param addTime 创建日期
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取状态 0.未提交 1.已提交
     *
     * @return state - 状态 0.未提交 1.已提交
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态 0.未提交 1.已提交
     *
     * @param state 状态 0.未提交 1.已提交
     */
    public void setState(Byte state) {
        this.state = state;
    }
}