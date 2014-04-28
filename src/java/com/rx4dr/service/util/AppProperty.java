/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author sakthidasans
 */
@Component
public class AppProperty {
    
    @Value("${app.lbl.description}")
    private String lblError;

    public String getLblError() {
        return lblError;
    }

    public void setLblError(String lblError) {
        this.lblError = lblError;
    }
}
