package com.bob.exceptions;

/**
 * @author bob
 * @date 2019/6/17 17:46
 */
public class LocalAuthOperationException extends RuntimeException {
    public LocalAuthOperationException(String message) {
        super(message);
    }
}
