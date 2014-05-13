/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.bo.IUserBo;
import com.rx4dr.service.error.ApplicationException;
import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.model.ResponseEntity;
import com.rx4dr.service.model.User;
import com.rx4dr.service.util.ValidationUtil;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author shakthydoss
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserBo userBo;

    public ResponseEntity<User> add(User user) {
        ValidationUtil validationUtil = new ValidationUtil();
        List<FieldError> errors = validationUtil.userAdd(user);
        if (errors != null) {
            throw new ApplicationException("422", "field validation exception", errors);
        }

        //user = userBo.add(user);
        return new ResponseEntity<User>("200", user);
    }

    @RequestMapping(value = "/return", method = RequestMethod.GET)
    public User returnthis() {
        User u = new User();
        return u;
    }
}
