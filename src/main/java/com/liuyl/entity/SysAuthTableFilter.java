package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "sys_auth_table_filter")
public class SysAuthTableFilter {
    /**
     * 主键
     */
    @Id
    @Column(name = "filter_id")
    private String filterId;

    /**
     * 表名
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 表显示名称
     */
    @Column(name = "table_show_name")
    private String tableShowName;

    /**
     * 获取主键
     *
     * @return filter_id - 主键
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * 设置主键
     *
     * @param filterId 主键
     */
    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    /**
     * 获取表名
     *
     * @return table_name - 表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置表名
     *
     * @param tableName 表名
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
}