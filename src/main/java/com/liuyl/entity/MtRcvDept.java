package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "mt_rcv_dept")
public class MtRcvDept {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
     * 添加人Id
     */
    @Column(name = "add_user_id")
    private String addUserId;

    private String code;

    private String name;

    private String remark;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}