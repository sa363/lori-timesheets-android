package com.lori.core.gate.lori.exception;

/**
 * @author artemik
 */
public class LoriAuthenticationException extends Exception {

    public LoriAuthenticationException() {
        super();
    }

    public LoriAuthenticationException(String message) {
        super(message);
    }

    public LoriAuthenticationException(Throwable cause) {
        super(cause);
    }
}
