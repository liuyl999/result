package com.liuyl.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_shift_store_check_detail")
public class MtShiftStoreCheckDetail {
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
     * 账面库存
     */
    @Column(name = "book_count")
    private BigDecimal bookCount;

    /**
     * 收料数量
     */
    @Column(name = "total_count")
    private BigDecimal totalCount;

    /**
     * 盘点数量
     */
    @Column(name = "check_count")
    private BigDecimal checkCount;

    /**
     * 消耗数量
     */
    @Column(name = "used_count")
    private BigDecimal usedCount;

    /**
     * 工班库存盘点编号
     */
    @Column(name = "shift_store_check_id")
    private Long shiftStoreCheckId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态 0.删除 1.正常
     */
    private Byte state;

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
     * 获取账面库存
     *
     * @return book_count - 账面库存
     */
    public BigDecimal getBookCount() {
        return bookCount;
    }

    /**
     * 设置账面库存
     *
     * @param bookCount 账面库存
     */
    public void setBookCount(BigDecimal bookCount) {
        this.bookCount = bookCount;
    }

    /**
     * 获取收料数量
     *
     * @return total_count - 收料数量
     */
    public BigDecimal getTotalCount() {
        return totalCount;
    }

    /**
     * 设置收料数量
     *
     * @param totalCount 收料数量
     */
    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 获取盘点数量
     *
     * @return check_count - 盘点数量
     */
    public BigDecimal getCheckCount() {
        return checkCount;
    }

    /**
     * 设置盘点数量
     *
     * @param checkCount 盘点数量
     */
    public void setCheckCount(BigDecimal checkCount) {
        this.checkCount = checkCount;
    }

    /**
     * 获取消耗数量
     *
     * @return used_count - 消耗数量
     */
    public BigDecimal getUsedCount() {
        return usedCount;
    }

    /**
     * 设置消耗数量
     *
     * @param usedCount 消耗数量
     */
    public void setUsedCount(BigDecimal usedCount) {
        this.usedCount = usedCount;
    }

    /**
     * 获取工班库存盘点编号
     *
     * @return shift_store_check_id - 工班库存盘点编号
     */
    public Long getShiftStoreCheckId() {
        return shiftStoreCheckId;
    }

    /**
     * 设置工班库存盘点编号
     *
     * @param shiftStoreCheckId 工班库存盘点编号
     */
    public void setShiftStoreCheckId(Long shiftStoreCheckId) {
        this.shiftStoreCheckId = shiftStoreCheckId;
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