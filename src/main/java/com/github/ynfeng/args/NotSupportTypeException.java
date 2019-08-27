package com.github.ynfeng.args;

/**
 * @author fynwin@gmail.com
 */
public class NotSupportTypeException extends RuntimeException{

    public NotSupportTypeException(String typeText) {
        super(typeText);
    }
}
