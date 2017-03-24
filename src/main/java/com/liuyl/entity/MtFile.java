package com.liuyl.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mt_file")
public class MtFile {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文件大小
     */
    private Long size;

    /**
     * 原文件名称
     */
    private String name;

    /**
     * 存储路径（名称）
     */
    private String path;

    /**
     * 关联实体名称
     */
    @Column(name = "relation_entity")
    private String relationEntity;

    /**
     * 关联实体主键
     */
    @Column(name = "relation_id")
    private Long relationId;

    /**
     * 添加人
     */
    @Column(name = "user_id")
    private String userId;

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
     * 获取文件大小
     *
     * @return size - 文件大小
     */
    public Long getSize() {
        return size;
    }

    /**
     * 设置文件大小
     *
     * @param size 文件大小
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * 获取原文件名称
     *
     * @return name - 原文件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置原文件名称
     *
     * @param name 原文件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取存储路径（名称）
     *
     * @return path - 存储路径（名称）
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置存储路径（名称）
     *
     * @param path 存储路径（名称）
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取关联实体名称
     *
     * @return relation_entity - 关联实体名称
     */
    public String getRelationEntity() {
        return relationEntity;
    }

    /**
     * 设置关联实体名称
     *
     * @param relationEntity 关联实体名称
     */
    public void setRelationEntity(String relationEntity) {
        this.relationEntity = relationEntity;
    }

    /**
     * 获取关联实体主键
     *
     * @return relation_id - 关联实体主键
     */
    public Long getRelationId() {
        return relationId;
    }

    /**
     * 设置关联实体主键
     *
     * @param relationId 关联实体主键
     */
    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    /**
     * 获取添加人
     *
     * @return user_id - 添加人
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置添加人
     *
     * @param userId 添加人
     */
    public void setUserId(String userId) {
        this.userId = userId;
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