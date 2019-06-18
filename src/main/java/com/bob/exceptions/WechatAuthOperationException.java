package com.bob.exceptions;

/**
 * @author bob
 * @date 2019/6/17 17:46
 */
public class WechatAuthOperationException extends RuntimeException {
    public WechatAuthOperationException(String message) {
        super(message);
    }
}
