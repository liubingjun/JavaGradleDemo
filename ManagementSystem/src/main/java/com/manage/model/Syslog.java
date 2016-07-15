package com.manage.model;

import java.io.Serializable;

/**
 * 系统日志表


; InnoDB free: 10240 kB
 */
public class Syslog implements Serializable {

	/**
	 * 主键
	 */
	private String sysLogId;
	/**
	 * 会员账户
	 */
	private String sysLogAcct;
	/**
	 * 会员ID
	 */
	private String sysLogAdminId;
	/**
	 * 操作了别
	 */
	private String sysLogAdminOperCls;
	/**
	 * 操作描述
	 */
	private String sysLogAdminOperDes;
	/**
	 * 操作URI
	 */
	private String sysLogAdminURI;
	/**
	 * 登录日期
	 */
	private Double sysLogAdminLoginDate;
	/**
	 * 登录时间
	 */
	private Integer sysLogAdminLoginTime;
	/**
	 * 创建日期
	 */
	private Integer createDate;
	/**
	 * 创建时间
	 */
	private Integer createTime;
	/**
	 * 日志归档状态
	 */
	private String logArchiveStatus;
	/**
	 * 归档日期
	 */
	private Integer logArchiveDate;
	/**
	 * 归档时间
	 */
	private Integer logArchiveTime;

	public String getSysLogId() {
		return sysLogId;
	}

	public void setSysLogId(String sysLogId) {
		this.sysLogId = sysLogId;
	}

	public String getSysLogAcct() {
		return sysLogAcct;
	}

	public void setSysLogAcct(String sysLogAcct) {
		this.sysLogAcct = sysLogAcct;
	}

	public String getSysLogAdminId() {
		return sysLogAdminId;
	}

	public void setSysLogAdminId(String sysLogAdminId) {
		this.sysLogAdminId = sysLogAdminId;
	}

	public String getSysLogAdminOperCls() {
		return sysLogAdminOperCls;
	}

	public void setSysLogAdminOperCls(String sysLogAdminOperCls) {
		this.sysLogAdminOperCls = sysLogAdminOperCls;
	}

	public String getSysLogAdminOperDes() {
		return sysLogAdminOperDes;
	}

	public void setSysLogAdminOperDes(String sysLogAdminOperDes) {
		this.sysLogAdminOperDes = sysLogAdminOperDes;
	}

	public String getSysLogAdminURI() {
		return sysLogAdminURI;
	}

	public void setSysLogAdminURI(String sysLogAdminURI) {
		this.sysLogAdminURI = sysLogAdminURI;
	}

	public Double getSysLogAdminLoginDate() {
		return sysLogAdminLoginDate;
	}

	public void setSysLogAdminLoginDate(Double sysLogAdminLoginDate) {
		this.sysLogAdminLoginDate = sysLogAdminLoginDate;
	}

	public Integer getSysLogAdminLoginTime() {
		return sysLogAdminLoginTime;
	}

	public void setSysLogAdminLoginTime(Integer sysLogAdminLoginTime) {
		this.sysLogAdminLoginTime = sysLogAdminLoginTime;
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

	public String getLogArchiveStatus() {
		return logArchiveStatus;
	}

	public void setLogArchiveStatus(String logArchiveStatus) {
		this.logArchiveStatus = logArchiveStatus;
	}

	public Integer getLogArchiveDate() {
		return logArchiveDate;
	}

	public void setLogArchiveDate(Integer logArchiveDate) {
		this.logArchiveDate = logArchiveDate;
	}

	public Integer getLogArchiveTime() {
		return logArchiveTime;
	}

	public void setLogArchiveTime(Integer logArchiveTime) {
		this.logArchiveTime = logArchiveTime;
	}
}