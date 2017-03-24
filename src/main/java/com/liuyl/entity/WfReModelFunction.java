package com.liuyl.entity;

import javax.persistence.*;

@Table(name = "wf_re_model_function")
public class WfReModelFunction {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 菜单id
     */
    @Column(name = "func_id")
    private String funcId;

    /**
     * ACT_RE_MODEL 模板表id
     */
    @Column(name = "model_id")
    private String modelId;

    @Column(name = "model_key")
    private String modelKey;

    /**
     * 状态： 0禁用 1启用
     */
    @Column(name = "model_state")
    private Integer modelState;

    /**
     * 添加人id
     */
    @Column(name = "add_user_id")
    private String addUserId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取菜单id
     *
     * @return func_id - 菜单id
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * 设置菜单id
     *
     * @param funcId 菜单id
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * 获取ACT_RE_MODEL 模板表id
     *
     * @return model_id - ACT_RE_MODEL 模板表id
     */
    public String getModelId() {
        return modelId;
    }

    /**
     * 设置ACT_RE_MODEL 模板表id
     *
     * @param modelId ACT_RE_MODEL 模板表id
     */
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * @return model_key
     */
    public String getModelKey() {
        return modelKey;
    }

    /**
     * @param modelKey
     */
    public void setModelKey(String modelKey) {
        this.modelKey = modelKey;
    }

    /**
     * 获取状态： 0禁用 1启用
     *
     * @return model_state - 状态： 0禁用 1启用
     */
    public Integer getModelState() {
        return modelState;
    }

    /**
     * 设置状态： 0禁用 1启用
     *
     * @param modelState 状态： 0禁用 1启用
     */
    public void setModelState(Integer modelState) {
        this.modelState = modelState;
    }

    /**
     * 获取添加人id
     *
     * @return add_user_id - 添加人id
     */
    public String getAddUserId() {
        return addUserId;
    }

    /**
     * 设置添加人id
     *
     * @param addUserId 添加人id
     */
    public void setAddUserId(String addUserId) {
        this.addUserId = addUserId;
    }
}