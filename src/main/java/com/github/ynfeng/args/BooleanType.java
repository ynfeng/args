package com.github.ynfeng.args;

import static java.lang.Boolean.FALSE;

/**
 * @author fynwin@gmail.com
 */
public class BooleanType implements Type<Boolean> {
    private final String name;

    public BooleanType() {
        name = "boolean";
    }

    @Override
    public Boolean toValue(String textValue) {
        return null != textValue;
    }

    @Override
    public Boolean defaultValue() {
        return FALSE;
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
        if (!(o instanceof BooleanType)) {
            return false;
        }

        BooleanType that = (BooleanType) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
