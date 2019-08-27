package com.github.ynfeng.args;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * @author fynwin@gmail.com
 */
public class TypeFactory {
    private static final TypeFactory instance = new TypeFactory();
    private final List<Type> typeList;

    public TypeFactory() {
        typeList = Lists.newArrayList(TypeLoader.load());
    }

    public static Type get(String typeText) {
        return instance.typeList.stream()
            .filter(type -> type.name().equalsIgnoreCase(typeText))
            .findFirst().orElseThrow(() -> new NotSupportTypeException(typeText));
    }
}
