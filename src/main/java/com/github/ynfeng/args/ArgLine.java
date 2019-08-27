package com.github.ynfeng.args;

import static java.util.stream.Collectors.toList;

import com.google.common.base.Strings;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author fynwin@gmail.com
 */
public class ArgLine {
    public static final String DASH = "-";
    public static final String SPACE = " ";
    public static final String EMPTY_STRING = "";
    public static final int ONE = 1;
    public static final int ZERO = 0;
    private final List<ArgLineElement> argLineElementList;

    private ArgLine(String argLineText) {
        argLineElementList = Arrays.stream(argLineText.split(DASH))
            .filter(str -> !Strings.isNullOrEmpty(str))
            .map(str -> str.split(SPACE))
            .map(strArr -> ArgLineElement.of(strArr[ZERO], strArr.length > ONE ? strArr[ONE] : EMPTY_STRING))
            .collect(toList());
    }

    public static ArgLine of(String argLineText) {
        return new ArgLine(argLineText);
    }

    public Optional<ArgLineElement> argLineElement(String flag) {
        return argLineElementList.stream().filter(ele -> ele.flag().equals(flag)).findFirst();
    }
}
