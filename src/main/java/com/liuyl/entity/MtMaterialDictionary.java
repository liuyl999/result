package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_material_dictionary")
public class MtMaterialDictionary {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 材料编码
     */
    @Column(name = "full_code")
    private String fullCode;

    /**
     * 本层编码
     */
    private String code;

    /**
     * 材料名称
     */
    private String name;

    /**
     * 规格
     */
    private String spec;

    /**
     * 型号
     */
    private String model;

    /**
     * 单位
     */
    private String unit;

    /**
     * 材质
     */
    private String quality;

    /**
     * 备注
     */
    private String remark;

    /**
     * 材料类别
     */
    @Column(name = "material_type_id")
    private Long materialTypeId;

    /**
     * 材料状态
     */
    private Byte state;

    /**
     * 材料来源（1.本系统 2.地磅）
     */
    @Column(name = "material_from")
    private Byte materialFrom;

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
     * 获取材料编码
     *
     * @return full_code - 材料编码
     */
    public String getFullCode() {
        return fullCode;
    }

    /**
     * 设置材料编码
     *
     * @param fullCode 材料编码
     */
    public void setFullCode(String fullCode) {
        this.fullCode = fullCode;
    }

    /**
     * 获取本层编码
     *
     * @return code - 本层编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置本层编码
     *
     * @param code 本层编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取材料名称
     *
     * @return name - 材料名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置材料名称
     *
     * @param name 材料名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取规格
     *
     * @return spec - 规格
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 设置规格
     *
     * @param spec 规格
     */
    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * 获取型号
     *
     * @return model - 型号
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置型号
     *
     * @param model 型号
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 获取单位
     *
     * @return unit - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取材质
     *
     * @return quality - 材质
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置材质
     *
     * @param quality 材质
     */
    public void setQuality(String quality) {
        this.quality = quality;
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
     * 获取材料类别
     *
     * @return material_type_id - 材料类别
     */
    public Long getMaterialTypeId() {
        return materialTypeId;
    }

    /**
     * 设置材料类别
     *
     * @param materialTypeId 材料类别
     */
    public void setMaterialTypeId(Long materialTypeId) {
        this.materialTypeId = materialTypeId;
    }

    /**
     * 获取材料状态
     *
     * @return state - 材料状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置材料状态
     *
     * @param state 材料状态
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取材料来源（1.本系统 2.地磅）
     *
     * @return material_from - 材料来源（1.本系统 2.地磅）
     */
    public Byte getMaterialFrom() {
        return materialFrom;
    }

    /**
     * 设置材料来源（1.本系统 2.地磅）
     *
     * @param materialFrom 材料来源（1.本系统 2.地磅）
     */
    public void setMaterialFrom(Byte materialFrom) {
        this.materialFrom = materialFrom;
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