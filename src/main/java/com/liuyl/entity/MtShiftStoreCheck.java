package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_shift_store_check")
public class MtShiftStoreCheck {
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
     * 单位（班组编号）
     */
    @Column(name = "shift_id")
    private Long shiftId;

    /**
     * 盘点日期
     */
    @Column(name = "check_date")
    private Date checkDate;

    /**
     * 盘点年度
     */
    @Column(name = "check_year")
    private String checkYear;

    /**
     * 盘点月度
     */
    @Column(name = "check_month")
    private String checkMonth;

    /**
     * 盘点人
     */
    @Column(name = "check_person_name")
    private String checkPersonName;

    /**
     * 盘点人
     */
    @Column(name = "shift_person_id")
    private Long shiftPersonId;

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
     * 添加人id
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 添加日期
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 状态（0.未提交 1.已提交）
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
     * 获取单位（班组编号）
     *
     * @return shift_id - 单位（班组编号）
     */
    public Long getShiftId() {
        return shiftId;
    }

    /**
     * 设置单位（班组编号）
     *
     * @param shiftId 单位（班组编号）
     */
    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    /**
     * 获取盘点日期
     *
     * @return check_date - 盘点日期
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 设置盘点日期
     *
     * @param checkDate 盘点日期
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取盘点年度
     *
     * @return check_year - 盘点年度
     */
    public String getCheckYear() {
        return checkYear;
    }

    /**
     * 设置盘点年度
     *
     * @param checkYear 盘点年度
     */
    public void setCheckYear(String checkYear) {
        this.checkYear = checkYear;
    }

    /**
     * 获取盘点月度
     *
     * @return check_month - 盘点月度
     */
    public String getCheckMonth() {
        return checkMonth;
    }

    /**
     * 设置盘点月度
     *
     * @param checkMonth 盘点月度
     */
    public void setCheckMonth(String checkMonth) {
        this.checkMonth = checkMonth;
    }

    /**
     * 获取盘点人
     *
     * @return check_person_name - 盘点人
     */
    public String getCheckPersonName() {
        return checkPersonName;
    }

    /**
     * 设置盘点人
     *
     * @param checkPersonName 盘点人
     */
    public void setCheckPersonName(String checkPersonName) {
        this.checkPersonName = checkPersonName;
    }

    /**
     * 获取盘点人
     *
     * @return shift_person_id - 盘点人
     */
    public Long getShiftPersonId() {
        return shiftPersonId;
    }

    /**
     * 设置盘点人
     *
     * @param shiftPersonId 盘点人
     */
    public void setShiftPersonId(Long shiftPersonId) {
        this.shiftPersonId = shiftPersonId;
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
     * 获取状态（0.未提交 1.已提交）
     *
     * @return state - 状态（0.未提交 1.已提交）
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态（0.未提交 1.已提交）
     *
     * @param state 状态（0.未提交 1.已提交）
     */
    public void setState(Byte state) {
        this.state = state;
    }
}