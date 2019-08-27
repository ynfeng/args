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
        assertThat(ArgSpec.of("l", "boolean","false").label(), is("l"));
        assertThat(ArgSpec.of("p", "int","8080").label(), is("p"));
    }

    @Test
    public void should_get_arg_spec_type() {
        assertThat(ArgSpec.of("l", "boolean","false").type(), is("boolean"));
        assertThat(ArgSpec.of("p", "int","8080").type(), is("int"));
    }

    @Test
    public void should_equals_given_same_label_and_type() {
        assertThat(ArgSpec.of("l", "boolean","false"), is(ArgSpec.of("l", "boolean","false")));
    }

    @Test
    public void should_get_default_value(){
        assertThat(ArgSpec.of("p", "int","8080").defaultValue(), is("8080"));
    }

}
