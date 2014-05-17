/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.bo.PrescriptionBo;
import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.error.FieldValidationException;
import com.rx4dr.service.model.ResponseEntity;
import com.rx4dr.service.model.Rx;
import com.rx4dr.service.util.ValidationUtil;
import java.util.List;
import javax.ws.rs.QueryParam;
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

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

    final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private PrescriptionBo prescriptionBo;

    @Autowired
    private ValidationUtil validationUtil;

    @Value("${app.lbl.success.code}")
    private String status;
    @Value("${app.error.FieldValidationException.name}")
    private String FieldValidationException;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Rx> add(@RequestBody Rx rx) {
        logger.info("Entering add");
        List<FieldError> errors = validationUtil.prescriptionAdd(rx);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Rx result = prescriptionBo.add(rx);
        return new ResponseEntity<Rx>(status, result);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Rx> get(@PathVariable int id) {
        logger.info("Entering get");
        List<FieldError> errors = validationUtil.prescriptionGet(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Rx result = prescriptionBo.get(id);
        return new ResponseEntity<Rx>(status, result);
    }

    @RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<Rx>> search(@PathVariable String name, @QueryParam("sort") String sort) {
        logger.info("Entering searching");
        List<FieldError> errors = validationUtil.prescriptionSearch(name);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        boolean sortBydate = false;
        boolean sortByName = false;
        List<Rx> results = prescriptionBo.search(name, sortBydate, sortByName);
        return new ResponseEntity<List<Rx>>(status, results);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<Boolean> delete(@PathVariable int id) {
        logger.info("Entering delete");
        List<FieldError> errors = validationUtil.prescriptionDelete(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Boolean result = prescriptionBo.delete(id);
        return new ResponseEntity<Boolean>(status, result);
    }

    @RequestMapping(value = "/sendEmail/{id}", method = RequestMethod.GET)
    public ResponseEntity<Boolean> sendEmail(@PathVariable int id) {
        logger.info("Entering sendEmail");
        List<FieldError> errors = validationUtil.prescriptionSendEmail(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Boolean result = prescriptionBo.sendEmail(id);
        return new ResponseEntity<Boolean>(status, result);
    }

}
