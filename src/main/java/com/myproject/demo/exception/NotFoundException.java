package com.myproject.demo.exception;

public class NotFoundException extends CustomException {

    private static final long serialVersionUID = 1L;

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String entityName, Long id) {
        super(entityName + " not found with id: " + id);
    }
}
