/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */

package com.rx4dr.service.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Dr  implements java.io.Serializable {


     private int IDr;
     private String NFirst;
     private String NLast;
     private String NMid;
     private String NNick;
     private String XPh;
     private String XEmail;
     private Integer IUserCreatd;
     private Date TStmpCreatd;
     private Integer IUserUpd;
     private Date TStmpUpd;
     private Set<Rx> rxes = new HashSet<Rx>(0);

    public Dr() {
    }

	
    public Dr(int IDr, String NFirst, String NLast, String NMid, String NNick, String XEmail) {
        this.IDr = IDr;
        this.NFirst = NFirst;
        this.NLast = NLast;
        this.NMid = NMid;
        this.NNick = NNick;
        this.XEmail = XEmail;
    }
    public Dr(int IDr, String NFirst, String NLast, String NMid, String NNick, String XPh, String XEmail, Integer IUserCreatd, Date TStmpCreatd, Integer IUserUpd, Date TStmpUpd, Set<Rx> rxes) {
       this.IDr = IDr;
       this.NFirst = NFirst;
       this.NLast = NLast;
       this.NMid = NMid;
       this.NNick = NNick;
       this.XPh = XPh;
       this.XEmail = XEmail;
       this.IUserCreatd = IUserCreatd;
       this.TStmpCreatd = TStmpCreatd;
       this.IUserUpd = IUserUpd;
       this.TStmpUpd = TStmpUpd;
       this.rxes = rxes;
    }
   
    public int getIDr() {
        return this.IDr;
    }
    
    public void setIDr(int IDr) {
        this.IDr = IDr;
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
    public Set<Rx> getRxes() {
        return this.rxes;
    }
    
    public void setRxes(Set<Rx> rxes) {
        this.rxes = rxes;
    }




}


