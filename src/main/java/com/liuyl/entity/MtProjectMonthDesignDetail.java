package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_project_month_design_detail")
public class MtProjectMonthDesignDetail {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 项目设计id
     */
    @Column(name = "project_month_design_id")
    private Long projectMonthDesignId;

    /**
     * 材料id
     */
    @Column(name = "material_dictionary_id")
    private Long materialDictionaryId;

    /**
     * 变更量（可以有负数）
     */
    @Column(name = "change_num")
    private Float changeNum;

    /**
     * 设计量
     */
    @Column(name = "design_num")
    private Float designNum;

    /**
     * 合计
     */
    @Column(name = "total_num")
    private Float totalNum;

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
     * 获取项目设计id
     *
     * @return project_month_design_id - 项目设计id
     */
    public Long getProjectMonthDesignId() {
        return projectMonthDesignId;
    }

    /**
     * 设置项目设计id
     *
     * @param projectMonthDesignId 项目设计id
     */
    public void setProjectMonthDesignId(Long projectMonthDesignId) {
        this.projectMonthDesignId = projectMonthDesignId;
    }

    /**
     * 获取材料id
     *
     * @return material_dictionary_id - 材料id
     */
    public Long getMaterialDictionaryId() {
        return materialDictionaryId;
    }

    /**
     * 设置材料id
     *
     * @param materialDictionaryId 材料id
     */
    public void setMaterialDictionaryId(Long materialDictionaryId) {
        this.materialDictionaryId = materialDictionaryId;
    }

    /**
     * 获取变更量（可以有负数）
     *
     * @return change_num - 变更量（可以有负数）
     */
    public Float getChangeNum() {
        return changeNum;
    }

    /**
     * 设置变更量（可以有负数）
     *
     * @param changeNum 变更量（可以有负数）
     */
    public void setChangeNum(Float changeNum) {
        this.changeNum = changeNum;
    }

    /**
     * 获取设计量
     *
     * @return design_num - 设计量
     */
    public Float getDesignNum() {
        return designNum;
    }

    /**
     * 设置设计量
     *
     * @param designNum 设计量
     */
    public void setDesignNum(Float designNum) {
        this.designNum = designNum;
    }

    /**
     * 获取合计
     *
     * @return total_num - 合计
     */
    public Float getTotalNum() {
        return totalNum;
    }

    /**
     * 设置合计
     *
     * @param totalNum 合计
     */
    public void setTotalNum(Float totalNum) {
        this.totalNum = totalNum;
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
}