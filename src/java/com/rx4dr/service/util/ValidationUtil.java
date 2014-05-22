/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.util;

import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.model.Dr;
import com.rx4dr.service.model.Rx;
import com.rx4dr.service.model.RxRec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ValidationUtil {

    public List<FieldError> userAdd(Dr dr) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (dr == null) {
            errors.add(new FieldError("user object", "is invalid"));
        }
        if (isNullOrEmpty(dr.getXEmail())) {
            errors.add(new FieldError("user email", "is invalid"));
        }
        if (isNullOrEmpty(dr.getNNick())) {
            errors.add(new FieldError("user nickname", "is invalid"));
        }
        if (isNullOrEmpty(dr.getNFirst())) {
            errors.add(new FieldError("user firstName", "is invalid"));
        }
        if (isNullOrEmpty(dr.getNFirst())) {
            errors.add(new FieldError("user lastName", "is invalid"));
        }
       
        return errors;
    }

    public List<FieldError> userGetUserById(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> UserGetByEmail(String email) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isNullOrEmpty(email)) {
            errors.add(new FieldError("email", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> userUpdate(Dr dr) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (dr == null) {
            errors.add(new FieldError("user object", "is invalid"));
        }
        if (isNullOrEmpty(dr.getXEmail())) {
            errors.add(new FieldError("user email", "is invalid"));
        }
        if (isNullOrEmpty(dr.getNNick())) {
            errors.add(new FieldError("user nickname", "is invalid"));
        }
        if (isNullOrEmpty(dr.getNFirst())) {
            errors.add(new FieldError("user firstName", "is invalid"));
        }
        if (isNullOrEmpty(dr.getNFirst())) {
            errors.add(new FieldError("user lastName", "is invalid"));
        }
      
        return errors;
    }

    public List<FieldError> prescriptionAdd(Rx rx) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (rx == null) {
            errors.add(new FieldError("prescription object", "is invalid"));
            return errors;
        }
        
        if (isNullOrEmpty(rx.getPatientName())) {
            errors.add(new FieldError("patient name", "is invalid"));
            return errors;
        }       

        if(isNullOrEmpty(rx.getPatientAge())){
            errors.add(new FieldError("patient age", "is invalid"));            
            return errors;
        }
        
        if (rx.getRxRecs() == null || rx.getRxRecs().isEmpty()) {
            errors.add(new FieldError("Drug name", "is invalid"));            
            return errors;
        }

        Set<RxRec> RxRecs = rx.getRxRecs();
        for (RxRec rxRec : RxRecs) {
            if (isNullOrEmpty(rxRec.getNDrug())) {
                errors.add(new FieldError("Drug name", "is invalid"));
                return errors;
            }
        }
        return errors;
    }

    public List<FieldError> prescriptionGet(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionDelete(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionSendEmail(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionSearch(String name) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isNullOrEmpty(name)) {
            errors.add(new FieldError("name", "is invalid"));
        }
        return errors;
    }

    public boolean isNullOrEmpty(String value) {
        if (value == null) {
            return true;
        }
        return (value.trim().isEmpty()) ? true : false;
    }

    public boolean isLesserThanZero(int value) {
        return (value <= 0) ? true : false;
    }
}
