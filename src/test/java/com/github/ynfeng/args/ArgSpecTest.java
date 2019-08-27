package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;


/**
 * @author fynwin@gmail.com
 */
public class ArgSpecTest {

    @Test
    public void should_get_arg_spec_label() {
        assertThat(ArgSpec.of("l", "boolean").label(), is("l"));
        assertThat(ArgSpec.of("p", "int").label(), is("p"));
    }

    @Test
    public void should_get_arg_spec_type() {
        assertThat(ArgSpec.of("l", "boolean").type(), is("boolean"));
        assertThat(ArgSpec.of("p", "int").type(), is("int"));
    }

    @Test
    public void should_equals_given_same_label_and_type() {
        assertThat(ArgSpec.of("l", "boolean"), is(ArgSpec.of("l", "boolean")));
    }

    @Test
    public void should_get_default_value(){
        assertThat(ArgSpec.of("l", "boolean","false").defaultValue(), is("false"));
    }

}
