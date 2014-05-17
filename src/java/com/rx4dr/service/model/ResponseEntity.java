/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.model;

/**
 *
 * @author shakthydoss
 * @param <T>
 */
public class ResponseEntity<T> {
    
    private String code;
    private T data;

    public ResponseEntity(String code , T data){
        this.code = code;
        this.data = data;
    }

    public ResponseEntity() {
     /*this is defualt co*/   
    }

  
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    
    
}
