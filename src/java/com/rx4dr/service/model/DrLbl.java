/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */

package com.rx4dr.service.model;

public class DrLbl  implements java.io.Serializable {


     private int IDocIbl;
     private int IDrId;
     private String lbl1;
     private String lbl2;
     private String lbl3;
     private String lbl4;

    public DrLbl() {
    }

	
    public DrLbl(int IDocIbl, int IDrId, String lbl1) {
        this.IDocIbl = IDocIbl;
        this.IDrId = IDrId;
        this.lbl1 = lbl1;
    }
    public DrLbl(int IDocIbl, int IDrId, String lbl1, String lbl2, String lbl3, String lbl4) {
       this.IDocIbl = IDocIbl;
       this.IDrId = IDrId;
       this.lbl1 = lbl1;
       this.lbl2 = lbl2;
       this.lbl3 = lbl3;
       this.lbl4 = lbl4;
    }
   
    public int getIDocIbl() {
        return this.IDocIbl;
    }
    
    public void setIDocIbl(int IDocIbl) {
        this.IDocIbl = IDocIbl;
    }
    public int getIDrId() {
        return this.IDrId;
    }
    
    public void setIDrId(int IDrId) {
        this.IDrId = IDrId;
    }
    public String getLbl1() {
        return this.lbl1;
    }
    
    public void setLbl1(String lbl1) {
        this.lbl1 = lbl1;
    }
    public String getLbl2() {
        return this.lbl2;
    }
    
    public void setLbl2(String lbl2) {
        this.lbl2 = lbl2;
    }
    public String getLbl3() {
        return this.lbl3;
    }
    
    public void setLbl3(String lbl3) {
        this.lbl3 = lbl3;
    }
    public String getLbl4() {
        return this.lbl4;
    }
    
    public void setLbl4(String lbl4) {
        this.lbl4 = lbl4;
    }




}


