package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class ArgsTest {

    @Test
    public void should_create_args_given_schema_and_arg_line() {
        Args args = new Args(Schema.of("l:boolean:false p:int:8080"), ArgLine.of("-l -p 8080"));
        assertThat(args, notNullValue());
    }

    @Test
    public void should_get_defalut_value() {
        Args args = new Args(Schema.of("l:boolean:false p:int:8080"), ArgLine.of(""));
        assertThat(args.argValue("l"), is(false));
        assertThat(args.argValue("p"), is(0));
    }

    @Test
    public void should_get_true_given_boolean_type_arg_line() {
        Args args = new Args(Schema.of("l:boolean:false"), ArgLine.of("-l"));
        assertThat(args.argValue("l"), is(true));
    }

    @Test
    public void should_get_correct_given_complex_arg_line() {
        Args args = new Args(Schema.of("l:boolean:false p:int:8080 u:string:root f:boolean:false"),
            ArgLine.of("-l -p 8080 -u root "));
        assertThat(args.argValue("l"), is(true));
        assertThat(args.argValue("p"), is(8080));
        assertThat(args.argValue("u"), is("root"));
        assertThat(args.argValue("f"), is(false));
    }

    @Test
    public void should_support_string_array_type() {
        Args args = new Args(Schema.of("l:strings:[]"), ArgLine.of("-l this,is,a,list"));
        assertThat(args.argValue("l"), is(new String[] {"this", "is", "a", "list"}));
    }
}

