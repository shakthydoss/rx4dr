/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.bo.UserBo;
import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.error.FieldValidationException;
import com.rx4dr.service.model.ResponseEntity;
import com.rx4dr.service.model.User;
import com.rx4dr.service.util.ValidationUtil;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private UserBo userBo;

    @Autowired
    private ValidationUtil validationUtil;

    @Value("${app.lbl.success.code}")
    private String successCode;
    @Value("${app.error.FieldValidationException.name}")
    private String FieldValidationException;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> add(@RequestBody User user) {
        logger.info("Entering add");
        List<FieldError> errors = validationUtil.userAdd(user);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        user = userBo.add(user);
        return new ResponseEntity<User>(successCode, user);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getById(@PathVariable int id) {
        logger.info("Entering getById");
        List<FieldError> errors = validationUtil.userGetUserById(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        User user = userBo.getById(id);
        return new ResponseEntity<User>(successCode, user);
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<User> getByEmail(@PathVariable String email) {
        logger.info("Entering getByEmail");
        List<FieldError> errors = validationUtil.UserGetByEmail(email);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        User user = userBo.getByEmail(email);
        return new ResponseEntity<User>(successCode, user);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> update(@RequestBody User user) {
        logger.info("Entering update");
        List<FieldError> errors = validationUtil.userUpdate(user);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        user = userBo.update(user);
        return new ResponseEntity<User>(successCode, user);
    }

    @RequestMapping(value = "/return", method = RequestMethod.GET)
    public User returnthis() {
        User u = new User();
        return u;
    }
}
