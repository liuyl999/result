package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_auth_scope_data")
public class SysAuthScopeData {
    /**
     * 主键
     */
    @Id
    @Column(name = "sp_data_id")
    private String spDataId;

    /**
     * 功能id：sys_function表主键
     */
    @Column(name = "func_id")
    private String funcId;

    /**
     * sys_auth_function表主键
     */
    @Column(name = "auth_func_id")
    private String authFuncId;

    @Column(name = "table_id")
    private String tableId;

    /**
     * 左括号
     */
    @Column(name = "sp_data_left")
    private String spDataLeft;

    /**
     * 字段名
     */
    @Column(name = "sp_data_field")
    private String spDataField;

    /**
     * 运算符:+-*
     */
    @Column(name = "sp_data_operator")
    private String spDataOperator;

    /**
     * 属性值
     */
    @Column(name = "sp_data_value")
    private String spDataValue;

    /**
     * 右括号
     */
    @Column(name = "sp_data_right")
    private String spDataRight;

    /**
     * 表达式：and或or
     */
    @Column(name = "sp_data_exp")
    private String spDataExp;

    /**
     * 排序时间
     */
    @Column(name = "order_time")
    private Long orderTime;

    /**
     * 获取主键
     *
     * @return sp_data_id - 主键
     */
    public String getSpDataId() {
        return spDataId;
    }

    /**
     * 设置主键
     *
     * @param spDataId 主键
     */
    public void setSpDataId(String spDataId) {
        this.spDataId = spDataId;
    }

    /**
     * 获取功能id：sys_function表主键
     *
     * @return func_id - 功能id：sys_function表主键
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 设置功能id：sys_function表主键
     *
     * @param funcId 功能id：sys_function表主键
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * 获取sys_auth_function表主键
     *
     * @return auth_func_id - sys_auth_function表主键
     */
    public String getAuthFuncId() {
        return authFuncId;
    }

    /**
     * 设置sys_auth_function表主键
     *
     * @param authFuncId sys_auth_function表主键
     */
    public void setAuthFuncId(String authFuncId) {
        this.authFuncId = authFuncId;
    }

    /**
     * @return table_id
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * 获取左括号
     *
     * @return sp_data_left - 左括号
     */
    public String getSpDataLeft() {
        return spDataLeft;
    }

    /**
     * 设置左括号
     *
     * @param spDataLeft 左括号
     */
    public void setSpDataLeft(String spDataLeft) {
        this.spDataLeft = spDataLeft;
    }

    /**
     * 获取字段名
     *
     * @return sp_data_field - 字段名
     */
    public String getSpDataField() {
        return spDataField;
    }

    /**
     * 设置字段名
     *
     * @param spDataField 字段名
     */
    public void setSpDataField(String spDataField) {
        this.spDataField = spDataField;
    }

    /**
     * 获取运算符:+
     *
     * @return sp_data_operator
     */
    public String getSpDataOperator() {
        return spDataOperator;
    }

    /**
     * 设置运算符:+
     *
     * @param spDataOperator
     */
    public void setSpDataOperator(String spDataOperator) {
        this.spDataOperator = spDataOperator;
    }

    /**
     * 获取属性值
     *
     * @return sp_data_value - 属性值
     */
    public String getSpDataValue() {
        return spDataValue;
    }

    /**
     * 设置属性值
     *
     * @param spDataValue 属性值
     */
    public void setSpDataValue(String spDataValue) {
        this.spDataValue = spDataValue;
    }

    /**
     * 获取右括号
     *
     * @return sp_data_right - 右括号
     */
    public String getSpDataRight() {
        return spDataRight;
    }

    /**
     * 设置右括号
     *
     * @param spDataRight 右括号
     */
    public void setSpDataRight(String spDataRight) {
        this.spDataRight = spDataRight;
    }

    /**
     * 获取表达式：and或or
     *
     * @return sp_data_exp - 表达式：and或or
     */
    public String getSpDataExp() {
        return spDataExp;
    }

    /**
     * 设置表达式：and或or
     *
     * @param spDataExp 表达式：and或or
     */
    public void setSpDataExp(String spDataExp) {
        this.spDataExp = spDataExp;
    }

    /**
     * 获取排序时间
     *
     * @return order_time - 排序时间
     */
    public Long getOrderTime() {
        return orderTime;
    }

    /**
     * 设置排序时间
     *
     * @param orderTime 排序时间
     */
    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }
}