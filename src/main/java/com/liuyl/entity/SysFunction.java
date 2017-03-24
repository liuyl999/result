package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_function")
public class SysFunction {
    @Id
    @Column(name = "func_id")
    private String funcId;

    /**
     * 功能名称
     */
    @Column(name = "func_name")
    private String funcName;

    /**
     * 功能类型：1菜单 2功能
     */
    @Column(name = "func_type")
    private Integer funcType;

    /**
     * 功能编码，需唯一
     */
    @Column(name = "func_code")
    private String funcCode;

    /**
     * 数据对象表id：sys_auth_table主键
     */
    @Column(name = "table_id")
    private String tableId;

    /**
     * 父级id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 功能链接路径
     */
    @Column(name = "func_url")
    private String funcUrl;

    /**
     * 功能图标
     */
    @Column(name = "func_icon")
    private String funcIcon;

    /**
     * 功能分类编码
     */
    @Column(name = "func_type_code")
    private String funcTypeCode;

    /**
     * 状态：0禁用 1启用
     */
    @Column(name = "func_state")
    private Integer funcState;

    /**
     * 排序号
     */
    @Column(name = "func_order")
    private Integer funcOrder;

    /**
     * 模块：各级模块用.连接
     */
    @Column(name = "func_model")
    private String funcModel;

    /**
     * 是否是叶子节点: 1子节点，0父节点，2父节点且其子节点全部为功能类型
     */
    @Column(name = "is_leaf")
    private Integer isLeaf;

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
     * @return func_id
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * @param funcId
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * 获取功能名称
     *
     * @return func_name - 功能名称
     */
    public String getFuncName() {
        return funcName;
    }

    /**
     * 设置功能名称
     *
     * @param funcName 功能名称
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    /**
     * 获取功能类型：1菜单 2功能
     *
     * @return func_type - 功能类型：1菜单 2功能
     */
    public Integer getFuncType() {
        return funcType;
    }

    /**
     * 设置功能类型：1菜单 2功能
     *
     * @param funcType 功能类型：1菜单 2功能
     */
    public void setFuncType(Integer funcType) {
        this.funcType = funcType;
    }

    /**
     * 获取功能编码，需唯一
     *
     * @return func_code - 功能编码，需唯一
     */
    public String getFuncCode() {
        return funcCode;
    }

    /**
     * 设置功能编码，需唯一
     *
     * @param funcCode 功能编码，需唯一
     */
    public void setFuncCode(String funcCode) {
        this.funcCode = funcCode;
    }

    /**
     * 获取数据对象表id：sys_auth_table主键
     *
     * @return table_id - 数据对象表id：sys_auth_table主键
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * 设置数据对象表id：sys_auth_table主键
     *
     * @param tableId 数据对象表id：sys_auth_table主键
     */
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * 获取父级id
     *
     * @return parent_id - 父级id
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父级id
     *
     * @param parentId 父级id
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取功能链接路径
     *
     * @return func_url - 功能链接路径
     */
    public String getFuncUrl() {
        return funcUrl;
    }

    /**
     * 设置功能链接路径
     *
     * @param funcUrl 功能链接路径
     */
    public void setFuncUrl(String funcUrl) {
        this.funcUrl = funcUrl;
    }

    /**
     * 获取功能图标
     *
     * @return func_icon - 功能图标
     */
    public String getFuncIcon() {
        return funcIcon;
    }

    /**
     * 设置功能图标
     *
     * @param funcIcon 功能图标
     */
    public void setFuncIcon(String funcIcon) {
        this.funcIcon = funcIcon;
    }

    /**
     * 获取功能分类编码
     *
     * @return func_type_code - 功能分类编码
     */
    public String getFuncTypeCode() {
        return funcTypeCode;
    }

    /**
     * 设置功能分类编码
     *
     * @param funcTypeCode 功能分类编码
     */
    public void setFuncTypeCode(String funcTypeCode) {
        this.funcTypeCode = funcTypeCode;
    }

    /**
     * 获取状态：0禁用 1启用
     *
     * @return func_state - 状态：0禁用 1启用
     */
    public Integer getFuncState() {
        return funcState;
    }

    /**
     * 设置状态：0禁用 1启用
     *
     * @param funcState 状态：0禁用 1启用
     */
    public void setFuncState(Integer funcState) {
        this.funcState = funcState;
    }

    /**
     * 获取排序号
     *
     * @return func_order - 排序号
     */
    public Integer getFuncOrder() {
        return funcOrder;
    }

    /**
     * 设置排序号
     *
     * @param funcOrder 排序号
     */
    public void setFuncOrder(Integer funcOrder) {
        this.funcOrder = funcOrder;
    }

    /**
     * 获取模块：各级模块用.连接
     *
     * @return func_model - 模块：各级模块用.连接
     */
    public String getFuncModel() {
        return funcModel;
    }

    /**
     * 设置模块：各级模块用.连接
     *
     * @param funcModel 模块：各级模块用.连接
     */
    public void setFuncModel(String funcModel) {
        this.funcModel = funcModel;
    }

    /**
     * 获取是否是叶子节点: 1子节点，0父节点，2父节点且其子节点全部为功能类型
     *
     * @return is_leaf - 是否是叶子节点: 1子节点，0父节点，2父节点且其子节点全部为功能类型
     */
    public Integer getIsLeaf() {
        return isLeaf;
    }

    /**
     * 设置是否是叶子节点: 1子节点，0父节点，2父节点且其子节点全部为功能类型
     *
     * @param isLeaf 是否是叶子节点: 1子节点，0父节点，2父节点且其子节点全部为功能类型
     */
    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
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