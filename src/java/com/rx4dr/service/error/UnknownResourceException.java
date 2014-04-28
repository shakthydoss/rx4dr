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

	private String error;
	private String description;

	public UnknownResourceException(String message) {
		super(message);
	}

	public UnknownResourceException(String error, String description) {
		this.error = error;
		this.description = description;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
    
}
