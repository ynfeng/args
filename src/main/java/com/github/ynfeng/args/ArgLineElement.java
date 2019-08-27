package com.github.ynfeng.args;

import java.util.Objects;

/**
 * @author fynwin@gmail.com
 */
public class ArgLineElement {
    private final String flag;
    private final String value;

    private ArgLineElement(String flag, String value) {
        this.flag = flag;
        this.value = value;
    }

    public static ArgLineElement of(String flag, String value) {
        return new ArgLineElement(flag, value);
    }

    public String flag() {
        return flag;
    }

    public String value() {
        return Objects.isNull(value) ? "" : value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ArgLineElement that = (ArgLineElement) o;

        if (!flag.equals(that.flag)) {
            return false;
        }
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        int result = flag.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }
}
