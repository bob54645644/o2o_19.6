package com.bob.exceptions;

/**
 * @author bob
 * @date 2019/6/17 17:45
 */
public class PersonInfoOperationException extends RuntimeException {
    public PersonInfoOperationException(String message) {
        super(message);
    }
}
