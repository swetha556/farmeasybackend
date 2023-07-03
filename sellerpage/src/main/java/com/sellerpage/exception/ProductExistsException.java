package com.sellerpage.exception;

public class ProductExistsException extends Exception {
    public ProductExistsException() {
        super();
    }

    public ProductExistsException(String message) {
        super(message);
    }
}