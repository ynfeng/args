package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class StringTypeTest {

    @Test
    public void should_return_raw_string_given_string_text(){
        assertThat(new StringType().toValue("abc"), is("abc"));
    }

    @Test
    public void should_return_empty_defalut_value(){
        assertThat(new StringType().defaultValue(), is(""));
    }

    @Test
    public void should_override_equals(){
        assertThat(new StringType(),is(new StringType()));
    }
}
