/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.bo.DrBo;
import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.error.FieldValidationException;
import com.rx4dr.service.model.Dr;
import com.rx4dr.service.model.ResponseEntity;
import com.rx4dr.service.util.ValidationUtil;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/dr")
public class DrController {

    final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private DrBo drBo;

    @Autowired
    private ValidationUtil validationUtil;

    @Value("${app.lbl.success.code}")
    private String status;
    
    @Value("${app.error.FieldValidationException.name}")
    private String FieldValidationException;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dr> add(@RequestBody Dr dr) {
        logger.info("Entering add");
        List<FieldError> errors = validationUtil.userAdd(dr);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }  
        dr = drBo.add(dr);
        logger.info("Exting add");
        return new ResponseEntity<Dr>(HttpStatus.CREATED.toString(), dr);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Dr> getById(@PathVariable int id) {
        logger.info("Entering getById");
        List<FieldError> errors = validationUtil.userGetUserById(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Dr dr = drBo.getById(id);
        return new ResponseEntity<Dr>(HttpStatus.OK.toString(), dr);
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public ResponseEntity<Dr> getByEmail(@PathVariable String email) {
        logger.info("Entering getByEmail");
        List<FieldError> errors = validationUtil.UserGetByEmail(email);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Dr dr = drBo.getByEmail(email);
        return new ResponseEntity<Dr>(HttpStatus.OK.toString(), dr);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dr> update(@RequestBody Dr dr) {
        logger.info("Entering update");
        List<FieldError> errors = validationUtil.userUpdate(dr);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        dr = drBo.update(dr);
        return new ResponseEntity<Dr>(HttpStatus.OK.toString(), dr);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<Boolean> delete(@PathVariable int id) {
       logger.info("Entering delete");
       drBo.delete(id);
       return new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT.toString(), true);        
    }
    
    @RequestMapping(value = "/return", method = RequestMethod.GET)
    public Dr returnthis() {
        Dr u = new Dr();
        return u;
    }
}
