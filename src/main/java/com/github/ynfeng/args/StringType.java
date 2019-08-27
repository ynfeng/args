package com.github.ynfeng.args;

import static java.lang.String.valueOf;

/**
 * @author fynwin@gmail.com
 */
public class StringType implements Type<String> {

    private final String name;

    public StringType() {
        name = "string";
    }

    @Override
    public String toValue(String textValue) {
        return valueOf(textValue);
    }

    @Override
    public String defaultValue() {
        return "";
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StringType that = (StringType) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
