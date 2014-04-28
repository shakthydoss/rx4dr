/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rx4dr.service.controller;

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
            UnknownResourceException ue) {
        Map<String, String> map = new HashMap<String, String>();
        String error = (ue.getError() != null) ? ue.getError()
                : "UnknownResourceException";
        String description = (ue.getDescription() != null) ? ue
                .getDescription()
                : "UnknownResourceException occured";

        map.put("staus", HttpStatus.NOT_FOUND.toString());
        map.put("error", error);
        map.put("description", description);
        return new ResponseEntity<Map<String, String>>(map, HttpStatus.OK);

    }

}
