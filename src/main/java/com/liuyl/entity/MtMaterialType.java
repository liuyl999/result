package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_material_type")
public class MtMaterialType {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 编码
     */
    private String code;

    /**
     * 全编码
     */
    @Column(name = "full_code")
    private String fullCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 父节点编号
     */
    private Long pid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态
     */
    private Byte state;

    /**
     * 添加时间
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
     * 获取编码
     *
     * @return code - 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编码
     *
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取全编码
     *
     * @return full_code - 全编码
     */
    public String getFullCode() {
        return fullCode;
    }

    /**
     * 设置全编码
     *
     * @param fullCode 全编码
     */
    public void setFullCode(String fullCode) {
        this.fullCode = fullCode;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父节点编号
     *
     * @return pid - 父节点编号
     */
    public Long getPid() {
        return pid;
    }

    /**
     * 设置父节点编号
     *
     * @param pid 父节点编号
     */
    public void setPid(Long pid) {
        this.pid = pid;
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
     * 获取状态
     *
     * @return state - 状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(Byte state) {
        this.state = state;
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