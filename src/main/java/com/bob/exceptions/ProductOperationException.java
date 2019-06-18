package com.bob.exceptions;

/**
 * @author bob
 * @date 2019/6/17 17:44
 */
public class ProductOperationException extends RuntimeException {
    public ProductOperationException(String message) {
        super(message);
    }
}
