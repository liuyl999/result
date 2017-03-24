package com.liuyl.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_outstock_material_info")
public class MtOutstockMaterialInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 出库单id
     */
    @Column(name = "outstock_id")
    private Long outstockId;

    /**
     * 入库材料id
     */
    @Column(name = "instock_material_info_id")
    private Long instockMaterialInfoId;

    /**
     * 发料数量
     */
    @Column(name = "send_num")
    private BigDecimal sendNum;

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
     * 发料员签字
     */
    @Column(name = "send_person_name")
    private String sendPersonName;

    /**
     * 收料工班
     */
    @Column(name = "shift_id")
    private Long shiftId;

    /**
     * 收料人员
     */
    @Column(name = "shift_person_id")
    private Long shiftPersonId;

    /**
     * 出库类型(字典)
     */
    @Column(name = "out_type")
    private String outType;

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
     * 获取出库单id
     *
     * @return outstock_id - 出库单id
     */
    public Long getOutstockId() {
        return outstockId;
    }

    /**
     * 设置出库单id
     *
     * @param outstockId 出库单id
     */
    public void setOutstockId(Long outstockId) {
        this.outstockId = outstockId;
    }

    /**
     * 获取入库材料id
     *
     * @return instock_material_info_id - 入库材料id
     */
    public Long getInstockMaterialInfoId() {
        return instockMaterialInfoId;
    }

    /**
     * 设置入库材料id
     *
     * @param instockMaterialInfoId 入库材料id
     */
    public void setInstockMaterialInfoId(Long instockMaterialInfoId) {
        this.instockMaterialInfoId = instockMaterialInfoId;
    }

    /**
     * 获取发料数量
     *
     * @return send_num - 发料数量
     */
    public BigDecimal getSendNum() {
        return sendNum;
    }

    /**
     * 设置发料数量
     *
     * @param sendNum 发料数量
     */
    public void setSendNum(BigDecimal sendNum) {
        this.sendNum = sendNum;
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
     * 获取发料员签字
     *
     * @return send_person_name - 发料员签字
     */
    public String getSendPersonName() {
        return sendPersonName;
    }

    /**
     * 设置发料员签字
     *
     * @param sendPersonName 发料员签字
     */
    public void setSendPersonName(String sendPersonName) {
        this.sendPersonName = sendPersonName;
    }

    /**
     * 获取收料工班
     *
     * @return shift_id - 收料工班
     */
    public Long getShiftId() {
        return shiftId;
    }

    /**
     * 设置收料工班
     *
     * @param shiftId 收料工班
     */
    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }

    /**
     * 获取收料人员
     *
     * @return shift_person_id - 收料人员
     */
    public Long getShiftPersonId() {
        return shiftPersonId;
    }

    /**
     * 设置收料人员
     *
     * @param shiftPersonId 收料人员
     */
    public void setShiftPersonId(Long shiftPersonId) {
        this.shiftPersonId = shiftPersonId;
    }

    /**
     * 获取出库类型(字典)
     *
     * @return out_type - 出库类型(字典)
     */
    public String getOutType() {
        return outType;
    }

    /**
     * 设置出库类型(字典)
     *
     * @param outType 出库类型(字典)
     */
    public void setOutType(String outType) {
        this.outType = outType;
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