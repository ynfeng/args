package com.github.ynfeng.args;

/**
 * @author fynwin@gmail.com
 */
public class NoSuchArgLineFlagException extends RuntimeException {
    public NoSuchArgLineFlagException(String flag) {
        super(flag);
    }
}
