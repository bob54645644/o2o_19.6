package com.bob.exceptions;

/**
 * @author bob
 * @date 2019/6/17 17:43
 */
public class ProductCategoryOperationException extends RuntimeException {
    public ProductCategoryOperationException(String message) {
        super(message);
    }
}
