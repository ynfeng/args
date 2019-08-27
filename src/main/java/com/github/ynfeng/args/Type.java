package com.github.ynfeng.args;

/**
 * @author fynwin@gmail.com
 */
public interface Type<T> {
    T toValue(String textValue);

    T defaultValue();

    String name();
}
