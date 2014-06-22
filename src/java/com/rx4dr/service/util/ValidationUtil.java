/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.util;

import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.model.Dr;
import com.rx4dr.service.model.DrLbl;
import com.rx4dr.service.model.Rx;
import com.rx4dr.service.model.RxRec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author shakthydoss
 */
public class ValidationUtil {

    public List<FieldError> userAdd(Dr dr) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (dr == null) {
            errors.add(new FieldError("user object", "is invalid"));
        }
        if (isNullOrEmpty(dr.getXEmail())) {
            errors.add(new FieldError("user email", "is invalid"));
        } else {
            if (!new Util().validateEmail(dr.getXEmail())) {
                errors.add(new FieldError("user email", "is invalid"));
            }
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
        } else {
            if (!new Util().validateEmail(email)) {
                errors.add(new FieldError("email", "is invalid"));
            }
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

    public List<FieldError> userDelete(int drId){
        List<FieldError> errors = new ArrayList<FieldError>();
        if(drId <= 0){
             errors.add(new FieldError("drId", "is invalid"));
        }
        return errors;
    }
    
    public List<FieldError> userGetDrLableBy (int drId){
        List<FieldError> errors = new ArrayList<FieldError>();
        if(drId <= 0){
            errors.add(new FieldError("drId", "is invalid"));
        }
        return errors;
    }
    
    public List<FieldError> userAddDrLable(DrLbl drLbl){
        List<FieldError> errors = new ArrayList<FieldError>();
        if(drLbl == null){
            errors.add(new FieldError("Lable objects", "is invalid"));
            return errors;
        }
        if( isNullOrEmpty(drLbl.getLbl1())){
            errors.add(new FieldError("Lable 1", "is invalid"));
        }
          if( isNullOrEmpty(drLbl.getLbl2())){
            errors.add(new FieldError("Lable 2", "is invalid"));
        }
        return errors;
    }
    
    public List<FieldError> userUpdateDrLable (DrLbl drLbl){        
        List<FieldError> errors = new ArrayList<FieldError>();
        if(drLbl == null){
            errors.add(new FieldError("Lable objects", "is invalid"));
            return errors;
        }
        if( isNullOrEmpty(drLbl.getLbl1())){
            errors.add(new FieldError("Lable 1", "is invalid"));
        }
          if( isNullOrEmpty(drLbl.getLbl2())){
            errors.add(new FieldError("Lable 2", "is invalid"));
        } 
        return errors;
    }
    
    public List<FieldError> userDeleteDrLableBy (int drId){
        List<FieldError> errors = new ArrayList<FieldError>();
        if(drId <= 0){
            errors.add(new FieldError("drId", "is invalid"));
        }
        return errors;
    }
    
    public List<FieldError> prescriptionAdd(Rx rx) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (rx == null) {
            errors.add(new FieldError("prescription object", "is invalid"));
            return errors;
        }

        if (rx.getDr() == null || isLesserThanZero(rx.getDr().getIDr())) {
            errors.add(new FieldError("Doctor id", "is invalid"));
        }

        if (isNullOrEmpty(rx.getPatientName())) {
            errors.add(new FieldError("patient name", "is invalid"));

        }

        if (isNullOrEmpty(rx.getPatientAge())) {
            errors.add(new FieldError("patient age", "is invalid"));
        }

        String temp = new Character(rx.getPatientGender()).toString();
        if (!(temp.equals("M") || temp.equals("F"))) {
            errors.add(new FieldError("patient gender", "is invalid"));
        }

        if (rx.getRxRecs() == null || rx.getRxRecs().isEmpty()) {
            errors.add(new FieldError("Drug name", "is invalid"));
        } else {
            Set<RxRec> RxRecs = rx.getRxRecs();
            for (RxRec rxRec : RxRecs) {
                if (isNullOrEmpty(rxRec.getNDrug())) {
                    errors.add(new FieldError("Drug name", "is invalid"));
                } else {
                    if (isLesserThanZero(rxRec.getDuration())) {
                        errors.add(new FieldError("Duration", "is invalid"));
                    }
                    if (isNullOrEmpty(rxRec.getRte())) {
                        errors.add(new FieldError("Route", "is invalid"));
                    }

                    if (rxRec.getPeriodAfternoon() == true && rxRec.getDosageAfternoon() <= 0.0) {
                        errors.add(new FieldError("Afternoon dosage", "is invalid"));
                    }
                    if (rxRec.getPeriodEvening() == true && rxRec.getDosageEvening() <= 0.0) {
                        errors.add(new FieldError("Evening dosage", "is invalid"));
                    }
                    if (rxRec.getPeriodMorning() == true && rxRec.getDosageMorning() <= 0.0) {
                        errors.add(new FieldError("Morning dosage", "is invalid"));
                    }
                    if (rxRec.getPeriodNight() == true && rxRec.getDosageNight() <= 0.0) {
                        errors.add(new FieldError("Night dosage", "is invalid"));
                    }

                    if (rxRec.getPeriodAfternoon() == false && rxRec.getDosageAfternoon() > 0.0) {
                        errors.add(new FieldError("Afternoon period", "is invalid"));
                    }
                    if (rxRec.getPeriodEvening() == false && rxRec.getDosageEvening() > 0.0) {
                        errors.add(new FieldError("Evening period", "is invalid"));
                    }
                    if (rxRec.getPeriodMorning() == false && rxRec.getDosageMorning() > 0.0) {
                        errors.add(new FieldError("Morning period", "is invalid"));
                    }
                    if (rxRec.getPeriodNight() == false && rxRec.getDosageNight() > 0.0) {
                        errors.add(new FieldError("Night period", "is invalid"));
                    }

                }
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
