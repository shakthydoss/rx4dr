/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rx4dr.service.controller;

import com.rx4dr.service.error.ApplicationException;
import com.rx4dr.service.error.FieldValidationException;
import com.rx4dr.service.error.UnknownResourceException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.GenericJDBCException;
import org.hibernate.exception.JDBCConnectionException;
import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author sakthidasans
 */
@ControllerAdvice
public class RestExceptionHandler {

    final Log logger = LogFactory.getLog(getClass());

    @Value("${app.lbl.error}")
    private String error;
    @Value("${app.lbl.status}")
    private String status;
    @Value("${app.lbl.description}")
    private String description;

    @ExceptionHandler({UnknownResourceException.class})
    public ResponseEntity<Map<String, String>> handleUnknownResourceException(
            UnknownResourceException e) {
        logger.debug("Enyeting handleUnknownResourceException");
        Map<String, String> map = new HashMap<String, String>();
        map.put(status, HttpStatus.NOT_FOUND.toString());
        map.put(error, e.getClass().getSimpleName());
        map.put(description, e.getMessage());
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);

    }

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<Map<String, Object>> ApplicationExceptionHandler(
            ApplicationException e) {
        logger.debug("Enyeting exceptionHandler");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(status, e.getCode());
        map.put(error, e.getError());
        map.put(description, e.getDescription());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    @ExceptionHandler(FieldValidationException.class)
    public ResponseEntity<Map<String, Object>> FieldValidationExceptionHandler(
            FieldValidationException e) {
        logger.debug("Enyeting FieldValidationExceptionHandler");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(status, "422");
        map.put(error, e.getClass().getSimpleName());
        map.put(description, e.getFieldErrors());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }
    
    
    @ExceptionHandler(NonUniqueObjectException.class)
    public ResponseEntity<Map<String, Object>> NonUniqueObjectExceptionHandler(
            NonUniqueObjectException e) {
        logger.debug("Enyeting JDBCConnectionException");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(status, "500");
        map.put(error, e.getClass().getSimpleName());
        map.put(description, e.getMessage());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }
    
    @ExceptionHandler(JDBCConnectionException.class)
    public ResponseEntity<Map<String, Object>> JDBCConnectionExceptionHandler(
            JDBCConnectionException e) {
        logger.debug("Enyeting JDBCConnectionException");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(status, "500");
        map.put(error, e.getClass().getSimpleName());
        map.put(description, e.getMessage());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    @ExceptionHandler(SQLGrammarException.class)
    public ResponseEntity<Map<String, Object>> SQLGrammarExceptionHandler(
            SQLGrammarException e) {
        logger.debug("Enyeting SQLGrammarException");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(error, "500");
        map.put(status, e.getClass().getSimpleName());
        map.put(description, e.getMessage());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Map<String, Object>> ConstraintViolationExceptionHandler(
            ConstraintViolationException e) {
        logger.debug("Enyeting ConstraintViolationException");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(status, "500");
        map.put(error, e.getClass().getSimpleName());
        map.put(description, e.getMessage());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

    @ExceptionHandler(GenericJDBCException.class)
    public ResponseEntity<Map<String, Object>> GenericJDBCExceptionExceptionHandler(
            GenericJDBCException e) {
        logger.debug("Enyeting GenericJDBCException");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(status, "500");
        map.put(error, e.getClass().getSimpleName());
        map.put(description, e.getMessage());
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }

}
