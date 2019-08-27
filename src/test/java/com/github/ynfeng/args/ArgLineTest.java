package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class ArgLineTest {

    @Test
    public void should_create_arg_line_given_arg_line_text() {
        assertThat(ArgLine.of("-l -p 8080 -u root"), notNullValue());
    }

    @Test
    public void should_get_empty_value_given_none_value_falg() {
        ArgLine argLine = ArgLine.of("-l -p");
        assertThat(argLine.argLineElement("l").get().value(), is(""));
        assertThat(argLine.argLineElement("p").get().value(), is(""));
    }

    @Test
    public void should_get_arg_line_element() {
        ArgLine argLine = ArgLine.of("-l -p 8080 -u root");
        assertThat(argLine.argLineElement("l").get(), is(ArgLineElement.of("l", "")));
        assertThat(argLine.argLineElement("p").get(), is(ArgLineElement.of("p", "8080")));
        assertThat(argLine.argLineElement("u").get(), is(ArgLineElement.of("u", "root")));
    }
}
