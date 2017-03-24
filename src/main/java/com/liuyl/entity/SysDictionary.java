package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_dictionary")
public class SysDictionary {
    /**
     * 唯一主键：字典编号：三位数为一级，从001开始
     */
    @Id
    @Column(name = "dict_no")
    private String dictNo;

    /**
     * 字典key值
     */
    @Column(name = "dict_key")
    private String dictKey;

    /**
     * 字典名称
     */
    @Column(name = "dict_name")
    private String dictName;

    /**
     * 父级编号，第一级节点的父节点为：0
     */
    @Column(name = "parent_no")
    private String parentNo;

    /**
     * 字典类型主键
     */
    @Column(name = "dict_type_id")
    private String dictTypeId;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "dict_state")
    private Integer dictState;

    /**
     * 排序号
     */
    @Column(name = "dict_order")
    private Integer dictOrder;

    /**
     * 是否是叶子节点： 0否 1是
     */
    @Column(name = "is_leaf")
    private Integer isLeaf;

    /**
     * 是否是地区：0否 1是
     */
    @Column(name = "is_region")
    private Integer isRegion;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取唯一主键：字典编号：三位数为一级，从001开始
     *
     * @return dict_no - 唯一主键：字典编号：三位数为一级，从001开始
     */
    public String getDictNo() {
        return dictNo;
    }

    /**
     * 设置唯一主键：字典编号：三位数为一级，从001开始
     *
     * @param dictNo 唯一主键：字典编号：三位数为一级，从001开始
     */
    public void setDictNo(String dictNo) {
        this.dictNo = dictNo;
    }

    /**
     * 获取字典key值
     *
     * @return dict_key - 字典key值
     */
    public String getDictKey() {
        return dictKey;
    }

    /**
     * 设置字典key值
     *
     * @param dictKey 字典key值
     */
    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    /**
     * 获取字典名称
     *
     * @return dict_name - 字典名称
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置字典名称
     *
     * @param dictName 字典名称
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取父级编号，第一级节点的父节点为：0
     *
     * @return parent_no - 父级编号，第一级节点的父节点为：0
     */
    public String getParentNo() {
        return parentNo;
    }

    /**
     * 设置父级编号，第一级节点的父节点为：0
     *
     * @param parentNo 父级编号，第一级节点的父节点为：0
     */
    public void setParentNo(String parentNo) {
        this.parentNo = parentNo;
    }

    /**
     * 获取字典类型主键
     *
     * @return dict_type_id - 字典类型主键
     */
    public String getDictTypeId() {
        return dictTypeId;
    }

    /**
     * 设置字典类型主键
     *
     * @param dictTypeId 字典类型主键
     */
    public void setDictTypeId(String dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return dict_state - 状态： 0禁用 1启用
     */
    public Integer getDictState() {
        return dictState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param dictState 状态： 0禁用 1启用
     */
    public void setDictState(Integer dictState) {
        this.dictState = dictState;
    }

    /**
     * 获取排序号
     *
     * @return dict_order - 排序号
     */
    public Integer getDictOrder() {
        return dictOrder;
    }

    /**
     * 设置排序号
     *
     * @param dictOrder 排序号
     */
    public void setDictOrder(Integer dictOrder) {
        this.dictOrder = dictOrder;
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
     * 获取是否是地区：0否 1是
     *
     * @return is_region - 是否是地区：0否 1是
     */
    public Integer getIsRegion() {
        return isRegion;
    }

    /**
     * 设置是否是地区：0否 1是
     *
     * @param isRegion 是否是地区：0否 1是
     */
    public void setIsRegion(Integer isRegion) {
        this.isRegion = isRegion;
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
}