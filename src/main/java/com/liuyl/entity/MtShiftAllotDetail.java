package com.liuyl.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_shift_allot_detail")
public class MtShiftAllotDetail {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 对应材料编号
     */
    @Column(name = "material_id")
    private Long materialId;

    /**
     * 数量
     */
    private BigDecimal count;

    /**
     * 炉/批号
     */
    @Column(name = "batch_no")
    private String batchNo;

    /**
     * 施工部位
     */
    private String part;

    /**
     * 备注
     */
    private String remark;

    /**
     * 工班调拨编号
     */
    @Column(name = "shift_allot_id")
    private Long shiftAllotId;

    /**
     * 添加日期
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 状态 0.删除 1.正常
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
     * 获取对应材料编号
     *
     * @return material_id - 对应材料编号
     */
    public Long getMaterialId() {
        return materialId;
    }

    /**
     * 设置对应材料编号
     *
     * @param materialId 对应材料编号
     */
    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    /**
     * 获取数量
     *
     * @return count - 数量
     */
    public BigDecimal getCount() {
        return count;
    }

    /**
     * 设置数量
     *
     * @param count 数量
     */
    public void setCount(BigDecimal count) {
        this.count = count;
    }

    /**
     * 获取炉/批号
     *
     * @return batch_no - 炉/批号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置炉/批号
     *
     * @param batchNo 炉/批号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    /**
     * 获取施工部位
     *
     * @return part - 施工部位
     */
    public String getPart() {
        return part;
    }

    /**
     * 设置施工部位
     *
     * @param part 施工部位
     */
    public void setPart(String part) {
        this.part = part;
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
     * 获取工班调拨编号
     *
     * @return shift_allot_id - 工班调拨编号
     */
    public Long getShiftAllotId() {
        return shiftAllotId;
    }

    /**
     * 设置工班调拨编号
     *
     * @param shiftAllotId 工班调拨编号
     */
    public void setShiftAllotId(Long shiftAllotId) {
        this.shiftAllotId = shiftAllotId;
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
     * 获取状态 0.删除 1.正常
     *
     * @return state - 状态 0.删除 1.正常
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态 0.删除 1.正常
     *
     * @param state 状态 0.删除 1.正常
     */
    public void setState(Byte state) {
        this.state = state;
    }
}