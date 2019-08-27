package com.github.ynfeng.args;

import java.util.stream.Stream;

/**
 * @author fynwin@gmail.com
 */
public class StringArrayType implements Type<String[]> {
    private final String name;

    public StringArrayType() {
        name = "strings";
    }

    @Override
    public String[] toValue(String textValue) {
        return Stream.of(textValue.split(",")).toArray(String[]::new);
    }

    @Override
    public String[] defaultValue() {
        return new String[0];
    }

    @Override
    public String name() {
        return name;
    }
}
