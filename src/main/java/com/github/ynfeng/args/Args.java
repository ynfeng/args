package com.github.ynfeng.args;

import java.util.Optional;

/**
 * @author fynwin@gmail.com
 */
public class Args {

    private final Schema schema;
    private final ArgLine argLine;

    public Args(Schema schema, ArgLine argLine) {
        this.schema = schema;
        this.argLine = argLine;
    }

    public <T> T argValue(String label) {
        ArgSpec argSpec = schema.argSpec(label);
        Type<?> type = TypeFactory.get(argSpec.type());
        Optional<ArgLineElement> candidate = argLine.argLineElement(label);
        return candidate.isPresent() ? (T) type.toValue(candidate.get().value()) : (T) type.defaultValue();
    }
}
