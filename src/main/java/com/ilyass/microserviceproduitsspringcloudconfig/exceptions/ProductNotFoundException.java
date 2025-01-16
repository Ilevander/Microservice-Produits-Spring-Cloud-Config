package com.ilyass.microserviceproduitsspringcloudconfig.exceptions;

public class ProductNotFoundException extends RuntimeException{
    // Constructor accepting a message
    public ProductNotFoundException(String message) {
        super(message);
    }

    // Optional: Constructor accepting a message and a cause
    public ProductNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
