package com.rx4dr.service.error;

import java.util.List;

public class ApplicationException extends RuntimeException {

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

    public ApplicationException(String code, String error, String description, Exception e) {
        super(e);
        this.code = code;
        this.error = error;
        this.description = description;
    }

    public ApplicationException(String code, String error, FieldValidationException e) {
        this.code = code;
        this.error = error;
        this.setFieldErrors(e.getFieldErrors());
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
