package com.github.ynfeng.args;

import static java.util.stream.Collectors.toSet;

import java.util.ServiceLoader;
import java.util.Set;
import java.util.stream.StreamSupport;

/**
 * @author fynwin@gmail.com
 */
public class TypeLoader {
    public static Set<Type> load() {
        return StreamSupport.stream(ServiceLoader.load(Type.class).spliterator(), false)
            .collect(toSet());
    }
}
