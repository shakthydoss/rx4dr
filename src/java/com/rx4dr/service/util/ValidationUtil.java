package com.rx4dr.service.util;

import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.model.User;
import java.util.ArrayList;
import java.util.List;

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

    public boolean isNullOrEmpty(String value) {
        if (value == null) {
            return true;
        }
        return (value.trim().isEmpty()) ? true : false;
    }
}
