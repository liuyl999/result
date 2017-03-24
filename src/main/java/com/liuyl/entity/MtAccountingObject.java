package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_accounting_object")
public class MtAccountingObject {
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
     * 备注
     */
    private String remark;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 项目部id
     */
    @Column(name = "add_org_id")
    private String addOrgId;

    /**
     * 编制人
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 项目部编码
     */
    @Column(name = "add_org_no")
    private String addOrgNo;

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
}