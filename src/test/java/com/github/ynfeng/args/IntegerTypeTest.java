package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class IntegerTypeTest {

    @Test
    public void should_return_raw_number_value_given_number_text() {
        assertThat(new IntegerType().toValue("1"), is(1));
        assertThat(new IntegerType().toValue("23"), is(23));
    }

    @Test
    public void should_return_0_default_value() {
        assertThat(new IntegerType().defaultValue(), is(0));
    }

    @Test
    public void should_override_equals() {
        assertThat(new IntegerType(), Is.is(new IntegerType()));
    }
}
