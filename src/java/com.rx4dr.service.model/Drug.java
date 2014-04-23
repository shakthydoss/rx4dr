package com.rx4dr.service;

import java.util.Date;


public class Drug implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer IDrug;
	private String NDrug;
	private String XDesc;
	private Integer IUserCreatd;
	private Date TStmpCreatd;
	private Integer IUserUpd;
	private Date TStmpUpd;

	public Drug() {
	}

	public Drug(String NDrug) {
		this.NDrug = NDrug;
	}

	public Drug(String NDrug, String XDesc, Integer IUserCreatd,
			Date TStmpCreatd, Integer IUserUpd, Date TStmpUpd) {
		this.NDrug = NDrug;
		this.XDesc = XDesc;
		this.IUserCreatd = IUserCreatd;
		this.TStmpCreatd = TStmpCreatd;
		this.IUserUpd = IUserUpd;
		this.TStmpUpd = TStmpUpd;
	}

	public Integer getIDrug() {
		return this.IDrug;
	}

	public void setIDrug(Integer IDrug) {
		this.IDrug = IDrug;
	}

	public String getNDrug() {
		return this.NDrug;
	}

	public void setNDrug(String NDrug) {
		this.NDrug = NDrug;
	}

	public String getXDesc() {
		return this.XDesc;
	}

	public void setXDesc(String XDesc) {
		this.XDesc = XDesc;
	}

	public Integer getIUserCreatd() {
		return this.IUserCreatd;
	}

	public void setIUserCreatd(Integer IUserCreatd) {
		this.IUserCreatd = IUserCreatd;
	}

	public Date getTStmpCreatd() {
		return this.TStmpCreatd;
	}

	public void setTStmpCreatd(Date TStmpCreatd) {
		this.TStmpCreatd = TStmpCreatd;
	}

	public Integer getIUserUpd() {
		return this.IUserUpd;
	}

	public void setIUserUpd(Integer IUserUpd) {
		this.IUserUpd = IUserUpd;
	}

	public Date getTStmpUpd() {
		return this.TStmpUpd;
	}

	public void setTStmpUpd(Date TStmpUpd) {
		this.TStmpUpd = TStmpUpd;
	}

}
