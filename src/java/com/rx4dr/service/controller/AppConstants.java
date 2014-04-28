/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.controller;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author sakthidasans
 */
public class AppConstants {
    
    @Value("${app.lbl.description}")
    private String lblError;

    @Value("${app.lbl.description}")
    public static String TEST; 
    
    public String getLblError() {
        return lblError;
    }

    public void setLblError(String lblError) {
        this.lblError = lblError;
    }
}
