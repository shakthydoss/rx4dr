/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("rawtypes")
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer IUser;
	private User user;
	private String NFirst;
	private String NLast;
	private String NMid;
	private String NNick;
	private String XPh;
	private String XEmail;
	private String XUserTyp;
	private Integer IUserCreatd;
	private Date TStmpCreatd;
	private Integer IUserUpd;
	private Date TStmpUpd;
	private Set rxesForIPatient = new HashSet(0);
	private Set rxesForIDoctor = new HashSet(0);
	private Set users = new HashSet(0);

	public User() {
	}

	public User(User user, String NFirst, String NLast, String NMid,
			String NNick, String XPh, String XEmail, String XUserTyp,
			Integer IUserCreatd, Date TStmpCreatd, Integer IUserUpd,
			Date TStmpUpd, Set rxesForIPatient, Set rxesForIDoctor, Set users) {
		this.user = user;
		this.NFirst = NFirst;
		this.NLast = NLast;
		this.NMid = NMid;
		this.NNick = NNick;
		this.XPh = XPh;
		this.XEmail = XEmail;
		this.XUserTyp = XUserTyp;
		this.IUserCreatd = IUserCreatd;
		this.TStmpCreatd = TStmpCreatd;
		this.IUserUpd = IUserUpd;
		this.TStmpUpd = TStmpUpd;
		this.rxesForIPatient = rxesForIPatient;
		this.rxesForIDoctor = rxesForIDoctor;
		this.users = users;
	}

	public Integer getIUser() {
		return this.IUser;
	}

	public void setIUser(Integer IUser) {
		this.IUser = IUser;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNFirst() {
		return this.NFirst;
	}

	public void setNFirst(String NFirst) {
		this.NFirst = NFirst;
	}

	public String getNLast() {
		return this.NLast;
	}

	public void setNLast(String NLast) {
		this.NLast = NLast;
	}

	public String getNMid() {
		return this.NMid;
	}

	public void setNMid(String NMid) {
		this.NMid = NMid;
	}

	public String getNNick() {
		return this.NNick;
	}

	public void setNNick(String NNick) {
		this.NNick = NNick;
	}

	public String getXPh() {
		return this.XPh;
	}

	public void setXPh(String XPh) {
		this.XPh = XPh;
	}

	public String getXEmail() {
		return this.XEmail;
	}

	public void setXEmail(String XEmail) {
		this.XEmail = XEmail;
	}

	public String getXUserTyp() {
		return this.XUserTyp;
	}

	public void setXUserTyp(String XUserTyp) {
		this.XUserTyp = XUserTyp;
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

	public Set getRxesForIPatient() {
		return this.rxesForIPatient;
	}

	public void setRxesForIPatient(Set rxesForIPatient) {
		this.rxesForIPatient = rxesForIPatient;
	}

	public Set getRxesForIDoctor() {
		return this.rxesForIDoctor;
	}

	public void setRxesForIDoctor(Set rxesForIDoctor) {
		this.rxesForIDoctor = rxesForIDoctor;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
