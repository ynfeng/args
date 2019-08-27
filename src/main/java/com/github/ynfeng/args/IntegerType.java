package com.github.ynfeng.args;

import static java.lang.Integer.valueOf;

/**
 * @author fynwin@gmail.com
 */
public class IntegerType implements Type<Integer> {

    private final String name;

    public IntegerType() {
        name = "int";
    }

    @Override
    public Integer toValue(String textValue) {
        return valueOf(textValue);
    }

    @Override
    public Integer defaultValue() {
        return valueOf(0);
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
        if (!(o instanceof IntegerType)) {
            return false;
        }

        IntegerType that = (IntegerType) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
