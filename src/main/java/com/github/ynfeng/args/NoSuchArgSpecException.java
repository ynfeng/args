package com.github.ynfeng.args;

/**
 * @author fynwin@gmail.com
 */
public class NoSuchArgSpecException extends RuntimeException{
    public NoSuchArgSpecException(String label) {
        super(label);
    }
}
