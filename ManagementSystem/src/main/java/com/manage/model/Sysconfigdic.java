package com.manage.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * 数据字典表（sysConfigDic）; InnoDB free: 10240 kB
 */
public class Sysconfigdic implements Serializable {

	/**
	 * 主键
	 */
	private String sysCfgDicId;
	/**
	 * Key
	 */
	private String sysCfgDicKey;
	/**
	 * Value
	 */
	private String sysCfgDicVal;
	/**
	 * 描述信息
	 */
	private String sysCfgDicDes;
	/**
	 * 父节点
	 */
	private String sysCfgDicParenntId;
	/**
	 * 数据类型
	 */
	private String sysCfgDicDataType;
	/**
	 * 是否为根节点
	 */
	private String sysCfgDicIsRoot;
	/**
	 * 默认值得
	 */
	private String sysCfgDicDfVal;
	/**
	 * 启用状态
	 */
	private String status;
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 创建日期
	 */
	private Integer createDate;
	/**
	 * 创建时间
	 */
	private Integer createTime;
	/**
	 * 修改人
	 */
	private String modifyBy;
	/**
	 * 修改日期
	 */
	private Integer modifyDate;
	/**
	 * 修改时间
	 */
	private Integer modifyTime;


	public String getSysCfgDicId() {
		return sysCfgDicId;
	}

	public void setSysCfgDicId(String sysCfgDicId) {
		this.sysCfgDicId = sysCfgDicId;
	}

	public String getSysCfgDicKey() {
		return sysCfgDicKey;
	}

	public void setSysCfgDicKey(String sysCfgDicKey) {
		this.sysCfgDicKey = sysCfgDicKey;
	}

	public String getSysCfgDicVal() {
		return sysCfgDicVal;
	}

	public void setSysCfgDicVal(String sysCfgDicVal) {
		this.sysCfgDicVal = sysCfgDicVal;
	}

	public String getSysCfgDicDes() {
		return sysCfgDicDes;
	}

	public void setSysCfgDicDes(String sysCfgDicDes) {
		this.sysCfgDicDes = sysCfgDicDes;
	}

	public String getSysCfgDicParenntId() {
		return sysCfgDicParenntId;
	}

	public void setSysCfgDicParenntId(String sysCfgDicParenntId) {
		this.sysCfgDicParenntId = sysCfgDicParenntId;
	}

	public String getSysCfgDicDataType() {
		return sysCfgDicDataType;
	}

	public void setSysCfgDicDataType(String sysCfgDicDataType) {
		this.sysCfgDicDataType = sysCfgDicDataType;
	}

	public String getSysCfgDicIsRoot() {
		return sysCfgDicIsRoot;
	}

	public void setSysCfgDicIsRoot(String sysCfgDicIsRoot) {
		this.sysCfgDicIsRoot = sysCfgDicIsRoot;
	}

	public String getSysCfgDicDfVal() {
		return sysCfgDicDfVal;
	}

	public void setSysCfgDicDfVal(String sysCfgDicDfVal) {
		this.sysCfgDicDfVal = sysCfgDicDfVal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Integer getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Integer createDate) {
		this.createDate = createDate;
	}

	public Integer getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Integer getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Integer modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Integer getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Integer modifyTime) {
		this.modifyTime = modifyTime;
	}
}