/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.error;

import java.util.List;

/**
 *
 * @author sakthidasans
 */
public class FieldValidationException extends RuntimeException {
        
        private List<FieldError> fieldErrors;

	public FieldValidationException(List<FieldError> fieldErrors){
		this.fieldErrors = fieldErrors;
	}
	
	public void setFieldErrors(List<FieldError> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	public List<FieldError> getFieldErrors() {
		return fieldErrors;
	}
}
