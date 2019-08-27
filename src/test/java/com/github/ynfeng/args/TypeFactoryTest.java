package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class TypeFactoryTest {

    @Test
    public void should_get_boolean_type_given_boolean_type_text(){
        assertThat(TypeFactory.get("boolean"), instanceOf(BooleanType.class));
    }

    @Test
    public void should_get_string_type_given_string_type_text(){
        assertThat(TypeFactory.get("string"), instanceOf(StringType.class));
    }

    @Test
    public void should_get_integer_type_given_string_type_text(){
        assertThat(TypeFactory.get("int"), instanceOf(IntegerType.class));
    }

    @Test(expected = NotSupportTypeException.class)
    public void should_throw_exception_if_get_not_support_type(){
        TypeFactory.get("notexists");
    }

    @Test
    public void should_get_string_array_type_given_string_array_type_text(){
        assertThat(TypeFactory.get("strings"), instanceOf(StringArrayType.class));
    }
}
