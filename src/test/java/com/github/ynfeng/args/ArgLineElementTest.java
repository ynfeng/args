package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class ArgLineElementTest {

    @Test
    public void should_get_p_flag_and_empty_value() {
        ArgLineElement argLineElement = ArgLineElement.of("p", "");
        assertThat(argLineElement.flag(), is("p"));
        assertThat(argLineElement.value(), is(""));
    }

    @Test
    public void should_get_empty_value_given_null_value() {
        ArgLineElement argLineElement = ArgLineElement.of("p", null);
        assertThat(argLineElement.value(), is(""));
    }

    @Test
    public void should_equals_given_same_flag_and_value() {
        assertThat(ArgLineElement.of("p", ""), is(ArgLineElement.of("p", "")));
    }
}
