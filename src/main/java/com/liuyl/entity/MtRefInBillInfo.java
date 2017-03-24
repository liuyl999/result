package com.liuyl.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "mt_ref_in_bill_info")
public class MtRefInBillInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 磅单id
     */
    @Column(name = "bill_uuid")
    private String billUuid;

    /**
     * 材料编码
     */
    @Column(name = "CLBM")
    private String clbm;

    /**
     * 第三方系统材料ID
     */
    @Column(name = "DSFCLID")
    private String dsfclid;

    /**
     * 材料名称
     */
    @Column(name = "CLMC")
    private String clmc;

    /**
     * 规格型号
     */
    @Column(name = "GGXH")
    private String ggxh;

    /**
     * 计量单位
     */
    @Column(name = "JLDW")
    private String jldw;

    /**
     * 偏差结果，0正常 1超正差 -1 超负差
     */
    @Column(name = "PCJG")
    private Integer pcjg;

    /**
     * 偏差类型（%或吨）
     */
    @Column(name = "PCLX")
    private String pclx;

    /**
     * 实际数量
     */
    @Column(name = "SJSL")
    private BigDecimal sjsl;

    /**
     * 实际重量,单位是吨
     */
    @Column(name = "SJZL")
    private BigDecimal sjzl;

    /**
     * 使用换算系数
     */
    @Column(name = "SYHSXS")
    private String syhsxs;

    /**
     * 运单数量
     */
    @Column(name = "YDSL")
    private BigDecimal ydsl;

    /**
     * 运单重量,单位是吨
     */
    @Column(name = "YDZL")
    private BigDecimal ydzl;

    /**
     * 扣量
     */
    @Column(name = "KL")
    private BigDecimal kl;

    /**
     * 正差
     */
    @Column(name = "ZC")
    private BigDecimal zc;

    /**
     * 负差
     */
    @Column(name = "FC")
    private BigDecimal fc;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取磅单id
     *
     * @return bill_uuid - 磅单id
     */
    public String getBillUuid() {
        return billUuid;
    }

    /**
     * 设置磅单id
     *
     * @param billUuid 磅单id
     */
    public void setBillUuid(String billUuid) {
        this.billUuid = billUuid;
    }

    /**
     * 获取材料编码
     *
     * @return CLBM - 材料编码
     */
    public String getClbm() {
        return clbm;
    }

    /**
     * 设置材料编码
     *
     * @param clbm 材料编码
     */
    public void setClbm(String clbm) {
        this.clbm = clbm;
    }

    /**
     * 获取第三方系统材料ID
     *
     * @return DSFCLID - 第三方系统材料ID
     */
    public String getDsfclid() {
        return dsfclid;
    }

    /**
     * 设置第三方系统材料ID
     *
     * @param dsfclid 第三方系统材料ID
     */
    public void setDsfclid(String dsfclid) {
        this.dsfclid = dsfclid;
    }

    /**
     * 获取材料名称
     *
     * @return CLMC - 材料名称
     */
    public String getClmc() {
        return clmc;
    }

    /**
     * 设置材料名称
     *
     * @param clmc 材料名称
     */
    public void setClmc(String clmc) {
        this.clmc = clmc;
    }

    /**
     * 获取规格型号
     *
     * @return GGXH - 规格型号
     */
    public String getGgxh() {
        return ggxh;
    }

    /**
     * 设置规格型号
     *
     * @param ggxh 规格型号
     */
    public void setGgxh(String ggxh) {
        this.ggxh = ggxh;
    }

    /**
     * 获取计量单位
     *
     * @return JLDW - 计量单位
     */
    public String getJldw() {
        return jldw;
    }

    /**
     * 设置计量单位
     *
     * @param jldw 计量单位
     */
    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    /**
     * 获取偏差结果，0正常 1超正差 -1 超负差
     *
     * @return PCJG - 偏差结果，0正常 1超正差 -1 超负差
     */
    public Integer getPcjg() {
        return pcjg;
    }

    /**
     * 设置偏差结果，0正常 1超正差 -1 超负差
     *
     * @param pcjg 偏差结果，0正常 1超正差 -1 超负差
     */
    public void setPcjg(Integer pcjg) {
        this.pcjg = pcjg;
    }

    /**
     * 获取偏差类型（%或吨）
     *
     * @return PCLX - 偏差类型（%或吨）
     */
    public String getPclx() {
        return pclx;
    }

    /**
     * 设置偏差类型（%或吨）
     *
     * @param pclx 偏差类型（%或吨）
     */
    public void setPclx(String pclx) {
        this.pclx = pclx;
    }

    /**
     * 获取实际数量
     *
     * @return SJSL - 实际数量
     */
    public BigDecimal getSjsl() {
        return sjsl;
    }

    /**
     * 设置实际数量
     *
     * @param sjsl 实际数量
     */
    public void setSjsl(BigDecimal sjsl) {
        this.sjsl = sjsl;
    }

    /**
     * 获取实际重量,单位是吨
     *
     * @return SJZL - 实际重量,单位是吨
     */
    public BigDecimal getSjzl() {
        return sjzl;
    }

    /**
     * 设置实际重量,单位是吨
     *
     * @param sjzl 实际重量,单位是吨
     */
    public void setSjzl(BigDecimal sjzl) {
        this.sjzl = sjzl;
    }

    /**
     * 获取使用换算系数
     *
     * @return SYHSXS - 使用换算系数
     */
    public String getSyhsxs() {
        return syhsxs;
    }

    /**
     * 设置使用换算系数
     *
     * @param syhsxs 使用换算系数
     */
    public void setSyhsxs(String syhsxs) {
        this.syhsxs = syhsxs;
    }

    /**
     * 获取运单数量
     *
     * @return YDSL - 运单数量
     */
    public BigDecimal getYdsl() {
        return ydsl;
    }

    /**
     * 设置运单数量
     *
     * @param ydsl 运单数量
     */
    public void setYdsl(BigDecimal ydsl) {
        this.ydsl = ydsl;
    }

    /**
     * 获取运单重量,单位是吨
     *
     * @return YDZL - 运单重量,单位是吨
     */
    public BigDecimal getYdzl() {
        return ydzl;
    }

    /**
     * 设置运单重量,单位是吨
     *
     * @param ydzl 运单重量,单位是吨
     */
    public void setYdzl(BigDecimal ydzl) {
        this.ydzl = ydzl;
    }

    /**
     * 获取扣量
     *
     * @return KL - 扣量
     */
    public BigDecimal getKl() {
        return kl;
    }

    /**
     * 设置扣量
     *
     * @param kl 扣量
     */
    public void setKl(BigDecimal kl) {
        this.kl = kl;
    }

    /**
     * 获取正差
     *
     * @return ZC - 正差
     */
    public BigDecimal getZc() {
        return zc;
    }

    /**
     * 设置正差
     *
     * @param zc 正差
     */
    public void setZc(BigDecimal zc) {
        this.zc = zc;
    }

    /**
     * 获取负差
     *
     * @return FC - 负差
     */
    public BigDecimal getFc() {
        return fc;
    }

    /**
     * 设置负差
     *
     * @param fc 负差
     */
    public void setFc(BigDecimal fc) {
        this.fc = fc;
    }
}