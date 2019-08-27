package com.github.ynfeng.args;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @author fynwin@gmail.com
 */
public class Schema {

    public static final String SPACE = " ";
    public static final String COLON = ":";
    public static final int ZERO = 0;
    public static final int ONE = 1;
    private final List<ArgSpec> argSpecList;

    private Schema(String schemaText) {
        argSpecList = Arrays.stream(schemaText.split(SPACE))
            .map(str -> str.split(COLON))
            .map(strArray -> ArgSpec.of(strArray[ZERO], strArray[ONE]))
            .collect(toList());
    }

    public static Schema of(String schemaText) {
        return new Schema(schemaText);
    }

    public ArgSpec argSpec(String label) {
        Optional<ArgSpec> candicate = argSpecList.stream()
            .filter(argSpec -> argSpec.label().equals(label))
            .findFirst();
        return candicate.orElseThrow(() -> new NoSuchArgSpecException(label));
    }

    public int numberOfArgSpecs() {
        return argSpecList.size();
    }

    public List<ArgSpec> argSpecs() {
        return Collections.unmodifiableList(argSpecList);
    }
}
