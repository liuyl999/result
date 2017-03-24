package com.liuyl.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "mt_instock_material_info")
public class MtInstockMaterialInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 入库单id
     */
    @Column(name = "instock_id")
    private Long instockId;

    /**
     * 材料字典id
     */
    @Column(name = "material_dic_id")
    private Long materialDicId;

    /**
     * 供货数量
     */
    @Column(name = "send_num")
    private BigDecimal sendNum;

    /**
     * 实收数量
     */
    @Column(name = "receive_num")
    private BigDecimal receiveNum;

    /**
     * 单价
     */
    @Column(name = "single_price")
    private BigDecimal singlePrice;

    /**
     * 金额
     */
    private BigDecimal price;

    /**
     * 供应商字典id
     */
    @Column(name = "supplier_res_id")
    private Long supplierResId;

    /**
     * 生产厂家
     */
    private String factory;

    /**
     * 验收人
     */
    private String inspector;

    /**
     * 供货质量
     */
    private String quality;

    /**
     * 技术证件及编号
     */
    @Column(name = "cred_code")
    private String credCode;

    /**
     * 收料单位(组织机构id)原名称org_id
     */
    @Column(name = "rcv_dept_id")
    private Long rcvDeptId;

    /**
     * (0:甲供1:采购2:调拨)
     */
    private Byte source;

    /**
     * 备注
     */
    private String remark;

    /**
     * 库存
     */
    @Column(name = "stock_num")
    private BigDecimal stockNum;

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
     * 获取入库单id
     *
     * @return instock_id - 入库单id
     */
    public Long getInstockId() {
        return instockId;
    }

    /**
     * 设置入库单id
     *
     * @param instockId 入库单id
     */
    public void setInstockId(Long instockId) {
        this.instockId = instockId;
    }

    /**
     * 获取材料字典id
     *
     * @return material_dic_id - 材料字典id
     */
    public Long getMaterialDicId() {
        return materialDicId;
    }

    /**
     * 设置材料字典id
     *
     * @param materialDicId 材料字典id
     */
    public void setMaterialDicId(Long materialDicId) {
        this.materialDicId = materialDicId;
    }

    /**
     * 获取供货数量
     *
     * @return send_num - 供货数量
     */
    public BigDecimal getSendNum() {
        return sendNum;
    }

    /**
     * 设置供货数量
     *
     * @param sendNum 供货数量
     */
    public void setSendNum(BigDecimal sendNum) {
        this.sendNum = sendNum;
    }

    /**
     * 获取实收数量
     *
     * @return receive_num - 实收数量
     */
    public BigDecimal getReceiveNum() {
        return receiveNum;
    }

    /**
     * 设置实收数量
     *
     * @param receiveNum 实收数量
     */
    public void setReceiveNum(BigDecimal receiveNum) {
        this.receiveNum = receiveNum;
    }

    /**
     * 获取单价
     *
     * @return single_price - 单价
     */
    public BigDecimal getSinglePrice() {
        return singlePrice;
    }

    /**
     * 设置单价
     *
     * @param singlePrice 单价
     */
    public void setSinglePrice(BigDecimal singlePrice) {
        this.singlePrice = singlePrice;
    }

    /**
     * 获取金额
     *
     * @return price - 金额
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置金额
     *
     * @param price 金额
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取供应商字典id
     *
     * @return supplier_res_id - 供应商字典id
     */
    public Long getSupplierResId() {
        return supplierResId;
    }

    /**
     * 设置供应商字典id
     *
     * @param supplierResId 供应商字典id
     */
    public void setSupplierResId(Long supplierResId) {
        this.supplierResId = supplierResId;
    }

    /**
     * 获取生产厂家
     *
     * @return factory - 生产厂家
     */
    public String getFactory() {
        return factory;
    }

    /**
     * 设置生产厂家
     *
     * @param factory 生产厂家
     */
    public void setFactory(String factory) {
        this.factory = factory;
    }

    /**
     * 获取验收人
     *
     * @return inspector - 验收人
     */
    public String getInspector() {
        return inspector;
    }

    /**
     * 设置验收人
     *
     * @param inspector 验收人
     */
    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    /**
     * 获取供货质量
     *
     * @return quality - 供货质量
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置供货质量
     *
     * @param quality 供货质量
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * 获取技术证件及编号
     *
     * @return cred_code - 技术证件及编号
     */
    public String getCredCode() {
        return credCode;
    }

    /**
     * 设置技术证件及编号
     *
     * @param credCode 技术证件及编号
     */
    public void setCredCode(String credCode) {
        this.credCode = credCode;
    }

    /**
     * 获取收料单位(组织机构id)原名称org_id
     *
     * @return rcv_dept_id - 收料单位(组织机构id)原名称org_id
     */
    public Long getRcvDeptId() {
        return rcvDeptId;
    }

    /**
     * 设置收料单位(组织机构id)原名称org_id
     *
     * @param rcvDeptId 收料单位(组织机构id)原名称org_id
     */
    public void setRcvDeptId(Long rcvDeptId) {
        this.rcvDeptId = rcvDeptId;
    }

    /**
     * 获取(0:甲供1:采购2:调拨)
     *
     * @return source - (0:甲供1:采购2:调拨)
     */
    public Byte getSource() {
        return source;
    }

    /**
     * 设置(0:甲供1:采购2:调拨)
     *
     * @param source (0:甲供1:采购2:调拨)
     */
    public void setSource(Byte source) {
        this.source = source;
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
     * 获取库存
     *
     * @return stock_num - 库存
     */
    public BigDecimal getStockNum() {
        return stockNum;
    }

    /**
     * 设置库存
     *
     * @param stockNum 库存
     */
    public void setStockNum(BigDecimal stockNum) {
        this.stockNum = stockNum;
    }
}