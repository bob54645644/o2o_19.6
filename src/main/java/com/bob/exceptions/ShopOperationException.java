package com.bob.exceptions;

/**
 * @author bob
 * @date 2019/6/17 17:43
 */
public class ShopOperationException extends RuntimeException {
    public ShopOperationException(String message) {
        super(message);
    }
}
