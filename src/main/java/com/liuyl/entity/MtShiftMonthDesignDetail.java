package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_shift_month_design_detail")
public class MtShiftMonthDesignDetail {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 工班设计id
     */
    @Column(name = "shift_month_design_id")
    private Long shiftMonthDesignId;

    /**
     * 材料id
     */
    @Column(name = "material_dictionary_id")
    private Long materialDictionaryId;

    /**
     * 设计量
     */
    @Column(name = "design_num")
    private Float designNum;

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
     * 获取工班设计id
     *
     * @return shift_month_design_id - 工班设计id
     */
    public Long getShiftMonthDesignId() {
        return shiftMonthDesignId;
    }

    /**
     * 设置工班设计id
     *
     * @param shiftMonthDesignId 工班设计id
     */
    public void setShiftMonthDesignId(Long shiftMonthDesignId) {
        this.shiftMonthDesignId = shiftMonthDesignId;
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