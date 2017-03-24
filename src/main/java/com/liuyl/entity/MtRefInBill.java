package com.liuyl.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "mt_ref_in_bill")
public class MtRefInBill {
    /**
     * 单据GUID，唯一
     */
    @Id
    @Column(name = "GUID")
    private String guid;

    /**
     * 项目编码
     */
    @Column(name = "projectCode")
    private String projectcode;

    /**
     * 供应商编码
     */
    @Column(name = "GYSBM")
    private String gysbm;

    /**
     * 类型，0收料，1发料
     */
    @Column(name = "LX")
    private String lx;

    /**
     * 类型，收料（采购、调入、甲供），发料（发料、废旧物资、调出、售出）
     */
    @Column(name = "LX_YT")
    private String lxYt;

    /**
     * 单据编号，不唯一
     */
    @Column(name = "BDBH")
    private String bdbh;

    /**
     * 备注，字符串
     */
    @Column(name = "BZ")
    private String bz;

    /**
     * 1正常 0 作废
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 车牌号
     */
    @Column(name = "CPH")
    private String cph;

    /**
     * 单据来源，有“称重”、“补录”
     */
    @Column(name = "DJLY")
    private String djly;

    /**
     * 皮重
     */
    @Column(name = "PZ")
    private BigDecimal pz;

    /**
     * 毛重
     */
    @Column(name = "MZ")
    private BigDecimal mz;

    /**
     * 净重
     */
    @Column(name = "JZ")
    private BigDecimal jz;

    /**
     * 最后修改时间
     */
    @Column(name = "ZHXGSJ")
    private String zhxgsj;

    /**
     * 称皮时间
     */
    @Column(name = "CPSJ")
    private String cpsj;

    /**
     * 称毛时间
     */
    @Column(name = "CMSJ")
    private String cmsj;

    /**
     * 出场时间
     */
    @Column(name = "CCSJ")
    private String ccsj;

    /**
     * 单位工程
     */
    @Column(name = "DWGC")
    private String dwgc;

    /**
     * 过磅员
     */
    @Column(name = "GBY")
    private String gby;

    /**
     * 偏差结果，0正常 1超正差 -1 超负差
     */
    @Column(name = "PCJG")
    private String pcjg;

    /**
     * 使用部位
     */
    @Column(name = "SYBW")
    private String sybw;

    /**
     * 原始单据编码
     */
    @Column(name = "YSDJBH")
    private String ysdjbh;

    /**
     * 时间戳
     */
    @Column(name = "Timestamp")
    private String timestamp;

    /**
     * 获取单据GUID，唯一
     *
     * @return GUID - 单据GUID，唯一
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置单据GUID，唯一
     *
     * @param guid 单据GUID，唯一
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 获取项目编码
     *
     * @return projectCode - 项目编码
     */
    public String getProjectcode() {
        return projectcode;
    }

    /**
     * 设置项目编码
     *
     * @param projectcode 项目编码
     */
    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode;
    }

    /**
     * 获取供应商编码
     *
     * @return GYSBM - 供应商编码
     */
    public String getGysbm() {
        return gysbm;
    }

    /**
     * 设置供应商编码
     *
     * @param gysbm 供应商编码
     */
    public void setGysbm(String gysbm) {
        this.gysbm = gysbm;
    }

    /**
     * 获取类型，0收料，1发料
     *
     * @return LX - 类型，0收料，1发料
     */
    public String getLx() {
        return lx;
    }

    /**
     * 设置类型，0收料，1发料
     *
     * @param lx 类型，0收料，1发料
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    /**
     * 获取类型，收料（采购、调入、甲供），发料（发料、废旧物资、调出、售出）
     *
     * @return LX_YT - 类型，收料（采购、调入、甲供），发料（发料、废旧物资、调出、售出）
     */
    public String getLxYt() {
        return lxYt;
    }

    /**
     * 设置类型，收料（采购、调入、甲供），发料（发料、废旧物资、调出、售出）
     *
     * @param lxYt 类型，收料（采购、调入、甲供），发料（发料、废旧物资、调出、售出）
     */
    public void setLxYt(String lxYt) {
        this.lxYt = lxYt;
    }

    /**
     * 获取单据编号，不唯一
     *
     * @return BDBH - 单据编号，不唯一
     */
    public String getBdbh() {
        return bdbh;
    }

    /**
     * 设置单据编号，不唯一
     *
     * @param bdbh 单据编号，不唯一
     */
    public void setBdbh(String bdbh) {
        this.bdbh = bdbh;
    }

    /**
     * 获取备注，字符串
     *
     * @return BZ - 备注，字符串
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置备注，字符串
     *
     * @param bz 备注，字符串
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * 获取1正常 0 作废
     *
     * @return STATUS - 1正常 0 作废
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1正常 0 作废
     *
     * @param status 1正常 0 作废
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取车牌号
     *
     * @return CPH - 车牌号
     */
    public String getCph() {
        return cph;
    }

    /**
     * 设置车牌号
     *
     * @param cph 车牌号
     */
    public void setCph(String cph) {
        this.cph = cph;
    }

    /**
     * 获取单据来源，有“称重”、“补录”
     *
     * @return DJLY - 单据来源，有“称重”、“补录”
     */
    public String getDjly() {
        return djly;
    }

    /**
     * 设置单据来源，有“称重”、“补录”
     *
     * @param djly 单据来源，有“称重”、“补录”
     */
    public void setDjly(String djly) {
        this.djly = djly;
    }

    /**
     * 获取皮重
     *
     * @return PZ - 皮重
     */
    public BigDecimal getPz() {
        return pz;
    }

    /**
     * 设置皮重
     *
     * @param pz 皮重
     */
    public void setPz(BigDecimal pz) {
        this.pz = pz;
    }

    /**
     * 获取毛重
     *
     * @return MZ - 毛重
     */
    public BigDecimal getMz() {
        return mz;
    }

    /**
     * 设置毛重
     *
     * @param mz 毛重
     */
    public void setMz(BigDecimal mz) {
        this.mz = mz;
    }

    /**
     * 获取净重
     *
     * @return JZ - 净重
     */
    public BigDecimal getJz() {
        return jz;
    }

    /**
     * 设置净重
     *
     * @param jz 净重
     */
    public void setJz(BigDecimal jz) {
        this.jz = jz;
    }

    /**
     * 获取最后修改时间
     *
     * @return ZHXGSJ - 最后修改时间
     */
    public String getZhxgsj() {
        return zhxgsj;
    }

    /**
     * 设置最后修改时间
     *
     * @param zhxgsj 最后修改时间
     */
    public void setZhxgsj(String zhxgsj) {
        this.zhxgsj = zhxgsj;
    }

    /**
     * 获取称皮时间
     *
     * @return CPSJ - 称皮时间
     */
    public String getCpsj() {
        return cpsj;
    }

    /**
     * 设置称皮时间
     *
     * @param cpsj 称皮时间
     */
    public void setCpsj(String cpsj) {
        this.cpsj = cpsj;
    }

    /**
     * 获取称毛时间
     *
     * @return CMSJ - 称毛时间
     */
    public String getCmsj() {
        return cmsj;
    }

    /**
     * 设置称毛时间
     *
     * @param cmsj 称毛时间
     */
    public void setCmsj(String cmsj) {
        this.cmsj = cmsj;
    }

    /**
     * 获取出场时间
     *
     * @return CCSJ - 出场时间
     */
    public String getCcsj() {
        return ccsj;
    }

    /**
     * 设置出场时间
     *
     * @param ccsj 出场时间
     */
    public void setCcsj(String ccsj) {
        this.ccsj = ccsj;
    }

    /**
     * 获取单位工程
     *
     * @return DWGC - 单位工程
     */
    public String getDwgc() {
        return dwgc;
    }

    /**
     * 设置单位工程
     *
     * @param dwgc 单位工程
     */
    public void setDwgc(String dwgc) {
        this.dwgc = dwgc;
    }

    /**
     * 获取过磅员
     *
     * @return GBY - 过磅员
     */
    public String getGby() {
        return gby;
    }

    /**
     * 设置过磅员
     *
     * @param gby 过磅员
     */
    public void setGby(String gby) {
        this.gby = gby;
    }

    /**
     * 获取偏差结果，0正常 1超正差 -1 超负差
     *
     * @return PCJG - 偏差结果，0正常 1超正差 -1 超负差
     */
    public String getPcjg() {
        return pcjg;
    }

    /**
     * 设置偏差结果，0正常 1超正差 -1 超负差
     *
     * @param pcjg 偏差结果，0正常 1超正差 -1 超负差
     */
    public void setPcjg(String pcjg) {
        this.pcjg = pcjg;
    }

    /**
     * 获取使用部位
     *
     * @return SYBW - 使用部位
     */
    public String getSybw() {
        return sybw;
    }

    /**
     * 设置使用部位
     *
     * @param sybw 使用部位
     */
    public void setSybw(String sybw) {
        this.sybw = sybw;
    }

    /**
     * 获取原始单据编码
     *
     * @return YSDJBH - 原始单据编码
     */
    public String getYsdjbh() {
        return ysdjbh;
    }

    /**
     * 设置原始单据编码
     *
     * @param ysdjbh 原始单据编码
     */
    public void setYsdjbh(String ysdjbh) {
        this.ysdjbh = ysdjbh;
    }

    /**
     * 获取时间戳
     *
     * @return Timestamp - 时间戳
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 设置时间戳
     *
     * @param timestamp 时间戳
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}