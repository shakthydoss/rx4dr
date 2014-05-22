/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.model;

import java.util.Date;

public class Drug  implements java.io.Serializable {


     private int IDrug;
     private String NDrug;
     private String XDesc;
     private Integer IUserCreatd;
     private Date TStmpCreatd;
     private Integer IUserUpd;
     private Date TStmpUpd;

    public Drug() {
    }

	
    public Drug(int IDrug, String NDrug) {
        this.IDrug = IDrug;
        this.NDrug = NDrug;
    }
    public Drug(int IDrug, String NDrug, String XDesc, Integer IUserCreatd, Date TStmpCreatd, Integer IUserUpd, Date TStmpUpd) {
       this.IDrug = IDrug;
       this.NDrug = NDrug;
       this.XDesc = XDesc;
       this.IUserCreatd = IUserCreatd;
       this.TStmpCreatd = TStmpCreatd;
       this.IUserUpd = IUserUpd;
       this.TStmpUpd = TStmpUpd;
    }
   
    public int getIDrug() {
        return this.IDrug;
    }
    
    public void setIDrug(int IDrug) {
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


