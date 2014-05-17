package com.rx4dr.service.controller;

import com.rx4dr.service.bo.PrescriptionBo;
import com.rx4dr.service.error.FieldError;
import com.rx4dr.service.error.FieldValidationException;
import com.rx4dr.service.model.ResponseEntity;
import com.rx4dr.service.model.Rx;
import com.rx4dr.service.util.ValidationUtil;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/greeting")
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

    public ResponseEntity<Rx> add(Rx rx) {
        logger.info("Entering add");
        List<FieldError> errors = validationUtil.prescriptionControllerAdd(rx);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Rx result = prescriptionBo.add(rx);
        return new ResponseEntity<Rx>(status, result);
    }

    public ResponseEntity<Rx> get(int id) {
        logger.info("Entering get");
        List<FieldError> errors = validationUtil.prescriptionControllerGet(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Rx result = prescriptionBo.get(id);
        return new ResponseEntity<Rx>(status, result);
    }

    public ResponseEntity<List<Rx>> search(String name, boolean sortBydate, boolean sortByName) {
        logger.info("Entering searching");
        List<FieldError> errors = validationUtil.prescriptionControllerSearch(name);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        List<Rx> results = prescriptionBo.search(name, sortBydate, sortByName);
        return new ResponseEntity<List<Rx>>(status, results);
    }

    public ResponseEntity<Boolean> delete(int id) {
        logger.info("Entering delete");
        List<FieldError> errors = validationUtil.prescriptionControllerDelete(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Boolean result = prescriptionBo.delete(id);
        return new ResponseEntity<Boolean>(status, result);
    }

    public ResponseEntity<Boolean> sendEmail(int id) {
        logger.info("Entering sendEmail");
        List<FieldError> errors = validationUtil.prescriptionControllerSendEmail(id);
        if (errors.size() > 0) {
            logger.debug(FieldValidationException + " : " + errors);
            throw new FieldValidationException(errors);
        }
        Boolean result = prescriptionBo.sendEmail(id);
        return new ResponseEntity<Boolean>(status, result);
    }

}
