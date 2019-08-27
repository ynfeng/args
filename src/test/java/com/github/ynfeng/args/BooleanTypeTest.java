package com.github.ynfeng.args;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class BooleanTypeTest {

    @Test
    public void should_return_false_value_given_empty_text() {
        assertThat(new BooleanType().toValue(null), is(false));
    }

    @Test
    public void should_return_true_value_given_empty_text() {
        assertThat(new BooleanType().toValue("true"), is(true));
    }


    @Test
    public void should_override_equals() {
        assertThat(new BooleanType(), is(new BooleanType()));
    }
}
