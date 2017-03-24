package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_auth_table_field")
public class SysAuthTableField {
    /**
     * 主键
     */
    @Id
    @Column(name = "field_id")
    private String fieldId;

    /**
     * 数据对象表主键id
     */
    @Column(name = "table_id")
    private String tableId;

    /**
     * 字段名，与数据库字段名称对应
     */
    @Column(name = "field_name")
    private String fieldName;

    /**
     * 字段显示名称
     */
    @Column(name = "field_show_name")
    private String fieldShowName;

    /**
     * 表字段类型:1部门 2角色 3人员 4日期 5是否 6字典 7文本
     */
    @Column(name = "field_type")
    private Integer fieldType;

    /**
     * 字段值
     */
    @Column(name = "field_value")
    private String fieldValue;

    /**
     * 获取主键
     *
     * @return field_id - 主键
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * 设置主键
     *
     * @param fieldId 主键
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取数据对象表主键id
     *
     * @return table_id - 数据对象表主键id
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 设置数据对象表主键id
     *
     * @param tableId 数据对象表主键id
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * 获取字段名，与数据库字段名称对应
     *
     * @return field_name - 字段名，与数据库字段名称对应
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置字段名，与数据库字段名称对应
     *
     * @param fieldName 字段名，与数据库字段名称对应
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 获取字段显示名称
     *
     * @return field_show_name - 字段显示名称
     */
    public String getFieldShowName() {
        return fieldShowName;
    }

    /**
     * 设置字段显示名称
     *
     * @param fieldShowName 字段显示名称
     */
    public void setFieldShowName(String fieldShowName) {
        this.fieldShowName = fieldShowName;
    }

    /**
     * 获取表字段类型:1部门 2角色 3人员 4日期 5是否 6字典 7文本
     *
     * @return field_type - 表字段类型:1部门 2角色 3人员 4日期 5是否 6字典 7文本
     */
    public Integer getFieldType() {
        return fieldType;
    }

    /**
     * 设置表字段类型:1部门 2角色 3人员 4日期 5是否 6字典 7文本
     *
     * @param fieldType 表字段类型:1部门 2角色 3人员 4日期 5是否 6字典 7文本
     */
    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * 获取字段值
     *
     * @return field_value - 字段值
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * 设置字段值
     *
     * @param fieldValue 字段值
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}