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
public class Rx implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Integer IRx;
	private User userByIPatient;
	private User userByIDoctor;
	private Integer IUserCreatd;
	private Date TStmpCreatd;
	private Integer IUserUpd;
	private Date TStmpUpd;
	
	private Set<RxRec> rxRecs = new HashSet(0);

	public Rx() {
	}

	public Rx(User userByIPatient, User userByIDoctor) {
		this.userByIPatient = userByIPatient;
		this.userByIDoctor = userByIDoctor;
	}

	public Rx(User userByIPatient, User userByIDoctor, Integer IUserCreatd,
			Date TStmpCreatd, Integer IUserUpd, Date TStmpUpd, Set rxRecs) {
		this.userByIPatient = userByIPatient;
		this.userByIDoctor = userByIDoctor;
		this.IUserCreatd = IUserCreatd;
		this.TStmpCreatd = TStmpCreatd;
		this.IUserUpd = IUserUpd;
		this.TStmpUpd = TStmpUpd;
		this.rxRecs = rxRecs;
	}

	public Integer getIRx() {
		return this.IRx;
	}

	public void setIRx(Integer IRx) {
		this.IRx = IRx;
	}

	public User getUserByIPatient() {
		return this.userByIPatient;
	}

	public void setUserByIPatient(User userByIPatient) {
		this.userByIPatient = userByIPatient;
	}

	public User getUserByIDoctor() {
		return this.userByIDoctor;
	}

	public void setUserByIDoctor(User userByIDoctor) {
		this.userByIDoctor = userByIDoctor;
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

	public Set<RxRec> getRxRecs() {
		return this.rxRecs;
	}

	public void setRxRecs(Set<RxRec> rxRecs) {
		this.rxRecs = rxRecs;
	}

}
