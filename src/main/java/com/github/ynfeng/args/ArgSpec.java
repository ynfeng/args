package com.github.ynfeng.args;

/**
 * @author fynwin@gmail.com
 */
public class ArgSpec {
    private final String label;
    private final String type;
    private final String defaultValue;

    private ArgSpec(String label, String type, String defaultValue) {
        this.label = label;
        this.type = type;
        this.defaultValue = defaultValue;
    }

    public static ArgSpec of(String label, String type) {
        return new ArgSpec(label, type, null);
    }

    public static ArgSpec of(String label, String type, String defaultValue) {
        return new ArgSpec(label, type, defaultValue);
    }

    public String label() {
        return label;
    }

    public String type() {
        return type;
    }

    public String defaultValue() {
        return defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArgSpec)) {
            return false;
        }

        ArgSpec argSpec = (ArgSpec) o;

        if (!label.equals(argSpec.label)) {
            return false;
        }
        if (!type.equals(argSpec.type)) {
            return false;
        }
        return defaultValue.equals(argSpec.defaultValue);
    }

    @Override
    public int hashCode() {
        int result = label.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + defaultValue.hashCode();
        return result;
    }
}
