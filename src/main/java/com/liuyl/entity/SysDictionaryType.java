package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_dictionary_type")
public class SysDictionaryType {
    /**
     * 主键
     */
    @Id
    @Column(name = "dict_type_id")
    private String dictTypeId;

    /**
     * 字典类型编码，需唯一
     */
    @Column(name = "dict_type_code")
    private String dictTypeCode;

    /**
     * 字典类型名称
     */
    @Column(name = "dict_type_name")
    private String dictTypeName;

    @Column(name = "dict_type_order")
    private Integer dictTypeOrder;

    /**
     * 获取主键
     *
     * @return dict_type_id - 主键
     */
    public String getDictTypeId() {
        return dictTypeId;
    }

    /**
     * 设置主键
     *
     * @param dictTypeId 主键
     */
    public void setDictTypeId(String dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    /**
     * 获取字典类型编码，需唯一
     *
     * @return dict_type_code - 字典类型编码，需唯一
     */
    public String getDictTypeCode() {
        return dictTypeCode;
    }

    /**
     * 设置字典类型编码，需唯一
     *
     * @param dictTypeCode 字典类型编码，需唯一
     */
    public void setDictTypeCode(String dictTypeCode) {
        this.dictTypeCode = dictTypeCode;
    }

    /**
     * 获取字典类型名称
     *
     * @return dict_type_name - 字典类型名称
     */
    public String getDictTypeName() {
        return dictTypeName;
    }

    /**
     * 设置字典类型名称
     *
     * @param dictTypeName 字典类型名称
     */
    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    /**
     * @return dict_type_order
     */
    public Integer getDictTypeOrder() {
        return dictTypeOrder;
    }

    /**
     * @param dictTypeOrder
     */
    public void setDictTypeOrder(Integer dictTypeOrder) {
        this.dictTypeOrder = dictTypeOrder;
    }
}