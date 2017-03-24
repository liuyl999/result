package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_auth_table")
public class SysAuthTable {
    /**
     * 主键
     */
    @Id
    @Column(name = "table_id")
    private String tableId;

    /**
     * 数据类型：1无数据范围 2部门、角色、人员 3数据表
     */
    @Column(name = "table_type")
    private Integer tableType;

    /**
     * 表名，与数据库表名对应
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 表显示名称
     */
    @Column(name = "table_show_name")
    private String tableShowName;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "table_state")
    private Integer tableState;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取主键
     *
     * @return table_id - 主键
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 设置主键
     *
     * @param tableId 主键
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * 获取数据类型：1无数据范围 2部门、角色、人员 3数据表
     *
     * @return table_type - 数据类型：1无数据范围 2部门、角色、人员 3数据表
     */
    public Integer getTableType() {
        return tableType;
    }

    /**
     * 设置数据类型：1无数据范围 2部门、角色、人员 3数据表
     *
     * @param tableType 数据类型：1无数据范围 2部门、角色、人员 3数据表
     */
    public void setTableType(Integer tableType) {
        this.tableType = tableType;
    }

    /**
     * 获取表名，与数据库表名对应
     *
     * @return table_name - 表名，与数据库表名对应
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表名，与数据库表名对应
     *
     * @param tableName 表名，与数据库表名对应
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取表显示名称
     *
     * @return table_show_name - 表显示名称
     */
    public String getTableShowName() {
        return tableShowName;
    }

    /**
     * 设置表显示名称
     *
     * @param tableShowName 表显示名称
     */
    public void setTableShowName(String tableShowName) {
        this.tableShowName = tableShowName;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return table_state - 状态： 0禁用 1启用
     */
    public Integer getTableState() {
        return tableState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param tableState 状态： 0禁用 1启用
     */
    public void setTableState(Integer tableState) {
        this.tableState = tableState;
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