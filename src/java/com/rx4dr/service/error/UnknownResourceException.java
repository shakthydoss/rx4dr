/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rx4dr.service.error;

/**
 *
 * @author sakthidasans
 */
public class UnknownResourceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;

    public UnknownResourceException(String message) {     
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public void setMessage(String message){
        this.message = message;
    }

}
