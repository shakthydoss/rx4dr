package com.rx4dr.service.util;

import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.model.Rx;
import com.rx4dr.service.model.RxRec;
import com.rx4dr.service.model.User;
import com.sun.xml.ws.api.pipe.Fiber;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ValidationUtil {

    public List<FieldError> userAdd(User user) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (user == null) {
            errors.add(new FieldError("user object", "is invalid"));
        }
        if (isNullOrEmpty(user.getXEmail())) {
            errors.add(new FieldError("user email", "is invalid"));
        }
        if (isNullOrEmpty(user.getNNick())) {
            errors.add(new FieldError("user nickname", "is invalid"));
        }
        if (isNullOrEmpty(user.getNFirst())) {
            errors.add(new FieldError("user firstName", "is invalid"));
        }
        if (isNullOrEmpty(user.getNFirst())) {
            errors.add(new FieldError("user lastName", "is invalid"));
        }
        if (isNullOrEmpty(user.getXUserTyp())) {
            errors.add(new FieldError("user type", "is invalid"));
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

    public List<FieldError> userUpdate(User user) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (user == null) {
            errors.add(new FieldError("user object", "is invalid"));
        }
        if (isNullOrEmpty(user.getXEmail())) {
            errors.add(new FieldError("user email", "is invalid"));
        }
        if (isNullOrEmpty(user.getNNick())) {
            errors.add(new FieldError("user nickname", "is invalid"));
        }
        if (isNullOrEmpty(user.getNFirst())) {
            errors.add(new FieldError("user firstName", "is invalid"));
        }
        if (isNullOrEmpty(user.getNFirst())) {
            errors.add(new FieldError("user lastName", "is invalid"));
        }
        if (isNullOrEmpty(user.getXUserTyp())) {
            errors.add(new FieldError("user type", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionControllerAdd(Rx rx) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (rx == null) {
            errors.add(new FieldError("prescription object", "is invalid"));
            return errors;
        }

        if (rx.getUserByIDoctor() == null) {
            errors.add(new FieldError("User object", "is invalid"));
            return errors;
        }

        if (rx.getUserByIDoctor().getIUser() == null) {
            errors.add(new FieldError("doctor object", "is invalid"));
        }

        if (rx.getUserByIPatient() == null) {
            errors.add(new FieldError("patient object", "is invalid"));
            return errors;
        }

        if (rx.getUserByIPatient().getIUser() == null) {
            errors.add(new FieldError("patient object", "is invalid"));
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

    public List<FieldError> prescriptionControllerGet(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionControllerDelete(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionControllerSendEmail(int id) {
        List<FieldError> errors = new ArrayList<FieldError>();
        if (isLesserThanZero(id)) {
            errors.add(new FieldError("id", "is invalid"));
        }
        return errors;
    }

    public List<FieldError> prescriptionControllerSearch(String name) {
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
