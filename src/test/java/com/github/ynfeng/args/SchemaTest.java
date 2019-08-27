package com.github.ynfeng.args;


import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class SchemaTest {

    @Test
    public void should_create_schema_from_schema_text() {
        assertThat(Schema.of("l:boolean p:int"), notNullValue());
    }

    @Test
    public void should_return_2_number_of_arg_specs() {
        assertThat(Schema.of("l:boolean p:int").numberOfArgSpecs(), is(2));
    }

    @Test
    public void should_get_arg_spec_from_schema() {
        assertThat(Schema.of("l:boolean p:int").argSpec("l"), is(ArgSpec.of("l", "boolean")));
        assertThat(Schema.of("l:boolean p:int").argSpec("p"), is(ArgSpec.of("p", "int")));
    }

    @Test(expected = NoSuchArgSpecException.class)
    public void should_throw_exception_when_get_not_exists_arg_spec() {
        Schema.of("l:boolean p:int").argSpec("u");
    }

    @Test
    public void should_get_all_arg_spec() {
        assertThat(Schema.of("l:boolean p:int").argSpecs(), hasItems(
            ArgSpec.of("l", "boolean"),
            ArgSpec.of("p", "int")));
    }
}
