package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_supplier_resource_database")
public class MtSupplierResourceDatabase {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 供应商编码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 成立日期
     */
    @Column(name = "establish_date")
    private Date establishDate;

    /**
     * 注册资金(万元)
     */
    @Column(name = "register_money")
    private String registerMoney;

    /**
     * 企业性质
     */
    @Column(name = "business_nature")
    private String businessNature;

    /**
     * 资质等级
     */
    private String level;

    /**
     * 经营范围
     */
    @Column(name = "business_range")
    private String businessRange;

    /**
     * 地址
     */
    private String address;

    /**
     * 税号
     */
    @Column(name = "duty_no")
    private String dutyNo;

    /**
     * 法定代表人
     */
    @Column(name = "legal_present")
    private String legalPresent;

    /**
     * 联系人
     */
    private String contract;

    /**
     * 联系人电话
     */
    @Column(name = "contract_telphone")
    private String contractTelphone;

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
     * 获取供应商编码
     *
     * @return code - 供应商编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置供应商编码
     *
     * @param code 供应商编码
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
     * 获取成立日期
     *
     * @return establish_date - 成立日期
     */
    public Date getEstablishDate() {
        return establishDate;
    }

    /**
     * 设置成立日期
     *
     * @param establishDate 成立日期
     */
    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    /**
     * 获取注册资金(万元)
     *
     * @return register_money - 注册资金(万元)
     */
    public String getRegisterMoney() {
        return registerMoney;
    }

    /**
     * 设置注册资金(万元)
     *
     * @param registerMoney 注册资金(万元)
     */
    public void setRegisterMoney(String registerMoney) {
        this.registerMoney = registerMoney;
    }

    /**
     * 获取企业性质
     *
     * @return business_nature - 企业性质
     */
    public String getBusinessNature() {
        return businessNature;
    }

    /**
     * 设置企业性质
     *
     * @param businessNature 企业性质
     */
    public void setBusinessNature(String businessNature) {
        this.businessNature = businessNature;
    }

    /**
     * 获取资质等级
     *
     * @return level - 资质等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置资质等级
     *
     * @param level 资质等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取经营范围
     *
     * @return business_range - 经营范围
     */
    public String getBusinessRange() {
        return businessRange;
    }

    /**
     * 设置经营范围
     *
     * @param businessRange 经营范围
     */
    public void setBusinessRange(String businessRange) {
        this.businessRange = businessRange;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取税号
     *
     * @return duty_no - 税号
     */
    public String getDutyNo() {
        return dutyNo;
    }

    /**
     * 设置税号
     *
     * @param dutyNo 税号
     */
    public void setDutyNo(String dutyNo) {
        this.dutyNo = dutyNo;
    }

    /**
     * 获取法定代表人
     *
     * @return legal_present - 法定代表人
     */
    public String getLegalPresent() {
        return legalPresent;
    }

    /**
     * 设置法定代表人
     *
     * @param legalPresent 法定代表人
     */
    public void setLegalPresent(String legalPresent) {
        this.legalPresent = legalPresent;
    }

    /**
     * 获取联系人
     *
     * @return contract - 联系人
     */
    public String getContract() {
        return contract;
    }

    /**
     * 设置联系人
     *
     * @param contract 联系人
     */
    public void setContract(String contract) {
        this.contract = contract;
    }

    /**
     * 获取联系人电话
     *
     * @return contract_telphone - 联系人电话
     */
    public String getContractTelphone() {
        return contractTelphone;
    }

    /**
     * 设置联系人电话
     *
     * @param contractTelphone 联系人电话
     */
    public void setContractTelphone(String contractTelphone) {
        this.contractTelphone = contractTelphone;
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
}