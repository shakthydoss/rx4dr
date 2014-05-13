package com.rx4dr.service.error;

import java.util.List;

public class ApplicationException  extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

        private String code;
	private String error;
	private String description;
	private List<FieldError> fieldErrors;

	public ApplicationException(Exception e) {
		super(e);
	}

	public ApplicationException(String error, String description,Exception e) {
		super(e);
		this.error = error;
		this.description = description;
	}

	public ApplicationException(String code , String error, List<FieldError> fieldErrors) {
	        this.code = code;
		this.error = error;
		this.setFieldErrors(fieldErrors);
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setErrorMessage(String errorMessage) {
		this.error = errorMessage;
	}

	public String getErrorMessage() {
		return error;
	}

	public void setFieldErrors(List<FieldError> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}

	public List<FieldError> getFieldErrors() {
		return fieldErrors;
	}
}
