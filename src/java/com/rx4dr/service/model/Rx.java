/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */

package com.rx4dr.service.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Rx  implements java.io.Serializable {


     private int IRx;
     private Dr dr;
     private String patientName;
     private char patientGender;
     private String patientAge;
     private Integer IUserCreatd;
     private Date TStmpCreatd;
     private Integer IUserUpd;
     private Date TStmpUpd;
     private Set<RxRec> rxRecs = new HashSet<RxRec>(0);

    public Rx() {
    }

	
    public Rx(int IRx, Dr dr, String patientName, char patientGender) {
        this.IRx = IRx;
        this.dr = dr;
        this.patientName = patientName;
        this.patientGender = patientGender;
    }
    public Rx(int IRx, Dr dr, String patientName, char patientGender, String patientAge, Integer IUserCreatd, Date TStmpCreatd, Integer IUserUpd, Date TStmpUpd, Set<RxRec> rxRecs) {
       this.IRx = IRx;
       this.dr = dr;
       this.patientName = patientName;
       this.patientGender = patientGender;
       this.patientAge = patientAge;
       this.IUserCreatd = IUserCreatd;
       this.TStmpCreatd = TStmpCreatd;
       this.IUserUpd = IUserUpd;
       this.TStmpUpd = TStmpUpd;
       this.rxRecs = rxRecs;
    }
   
    public int getIRx() {
        return this.IRx;
    }
    
    public void setIRx(int IRx) {
        this.IRx = IRx;
    }
    public Dr getDr() {
        return this.dr;
    }
    
    public void setDr(Dr dr) {
        this.dr = dr;
    }
    public String getPatientName() {
        return this.patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public char getPatientGender() {
        return this.patientGender;
    }
    
    public void setPatientGender(char patientGender) {
        this.patientGender = patientGender;
    }
    public String getPatientAge() {
        return this.patientAge;
    }
    
    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
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


