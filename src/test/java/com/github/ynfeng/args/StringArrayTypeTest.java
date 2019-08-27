package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class StringArrayTypeTest {

    @Test
    public void should_return_string_array() {
        assertThat(new StringArrayType().toValue("this,is,a,list"), is(new String[] {"this", "is", "a", "list"}));
    }

}
