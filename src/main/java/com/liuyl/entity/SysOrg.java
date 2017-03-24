package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_org")
public class SysOrg {
    /**
     * 机构id,唯一主键
     */
    @Id
    @Column(name = "org_id")
    private String orgId;

    /**
     * 机构名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 上级机构id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 部门编号：三位数为一级，从001开始
     */
    @Column(name = "org_no")
    private String orgNo;

    /**
     * 父级编号
     */
    @Column(name = "parent_no")
    private String parentNo;

    /**
     * 部门级别：1集团 2公司 3项目部 
     */
    @Column(name = "org_grade")
    private Integer orgGrade;

    /**
     * 机构层级
     */
    @Column(name = "org_level")
    private Integer orgLevel;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "org_state")
    private Integer orgState;

    /**
     * 是否是叶子节点： 0否 1是
     */
    @Column(name = "is_leaf")
    private Integer isLeaf;

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
     * 是否拉取过数据(0没有,1有)
     */
    @Column(name = "ref_lq")
    private Byte refLq;

    /**
     * 获取机构id,唯一主键
     *
     * @return org_id - 机构id,唯一主键
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构id,唯一主键
     *
     * @param orgId 机构id,唯一主键
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取机构名称
     *
     * @return org_name - 机构名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称
     *
     * @param orgName 机构名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取上级机构id
     *
     * @return parent_id - 上级机构id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置上级机构id
     *
     * @param parentId 上级机构id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取部门编号：三位数为一级，从001开始
     *
     * @return org_no - 部门编号：三位数为一级，从001开始
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设置部门编号：三位数为一级，从001开始
     *
     * @param orgNo 部门编号：三位数为一级，从001开始
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    /**
     * 获取父级编号
     *
     * @return parent_no - 父级编号
     */
    public String getParentNo() {
        return parentNo;
    }

    /**
     * 设置父级编号
     *
     * @param parentNo 父级编号
     */
    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
    }

    /**
     * 获取部门级别：1集团 2公司 3项目部 
     *
     * @return org_grade - 部门级别：1集团 2公司 3项目部 
     */
    public Integer getOrgGrade() {
        return orgGrade;
    }

    /**
     * 设置部门级别：1集团 2公司 3项目部 
     *
     * @param orgGrade 部门级别：1集团 2公司 3项目部 
     */
    public void setOrgGrade(Integer orgGrade) {
        this.orgGrade = orgGrade;
    }

    /**
     * 获取机构层级
     *
     * @return org_level - 机构层级
     */
    public Integer getOrgLevel() {
        return orgLevel;
    }

    /**
     * 设置机构层级
     *
     * @param orgLevel 机构层级
     */
    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return org_state - 状态： 0禁用 1启用
     */
    public Integer getOrgState() {
        return orgState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param orgState 状态： 0禁用 1启用
     */
    public void setOrgState(Integer orgState) {
        this.orgState = orgState;
    }

    /**
     * 获取是否是叶子节点： 0否 1是
     *
     * @return is_leaf - 是否是叶子节点： 0否 1是
     */
    public Integer getIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置是否是叶子节点： 0否 1是
     *
     * @param isLeaf 是否是叶子节点： 0否 1是
     */
    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
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
     * 获取是否拉取过数据(0没有,1有)
     *
     * @return ref_lq - 是否拉取过数据(0没有,1有)
     */
    public Byte getRefLq() {
        return refLq;
    }

    /**
     * 设置是否拉取过数据(0没有,1有)
     *
     * @param refLq 是否拉取过数据(0没有,1有)
     */
    public void setRefLq(Byte refLq) {
        this.refLq = refLq;
    }
}