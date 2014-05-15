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

    @ExceptionHandler({UnknownResourceException.class})
    public ResponseEntity<Map<String, String>> handleUnknownResourceException(
            UnknownResourceException e) {
        Map<String, String> map = new HashMap<String, String>();      
        map.put("staus", HttpStatus.NOT_FOUND.toString());
        map.put("error", e.getClass().getSimpleName());
        map.put("description", e.getMessage());
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);

    }
    
    @ExceptionHandler(FieldValidationException.class)
	public ResponseEntity<Map<String, Object>> FieldValidationExceptionHandler(
			FieldValidationException e) {           
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("status","422");
            map.put("error", e.getClass().getSimpleName());
            map.put("description", e.getFieldErrors());            
            return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);           
        }
    
    @ExceptionHandler(ApplicationException.class)
	public ResponseEntity<Map<String, Object>> exceptionHandler(
			ApplicationException e) {

		Map<String, Object> map = new HashMap<String, Object>();

		if (e.getCode().equals("422")) {
			map.put("status",HttpStatus.BAD_REQUEST.toString());
			map.put("error","field validation exception");					
			map.put("description", e.getFieldErrors());

		}  else {
			String error = e.getError();
                        String description = e.getDescription();                        
			map.put("status", HttpStatus.BAD_REQUEST.toString());
			map.put("error", error);
                        map.put("description", description);
		}

		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);

	}

        
}
