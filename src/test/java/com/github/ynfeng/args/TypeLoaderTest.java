package com.github.ynfeng.args;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author fynwin@gmail.com
 */
public class TypeLoaderTest {

    @Test
    public void should_load_supported_type(){
        assertThat(TypeLoader.load(), hasItems(new StringType(),new BooleanType(),new IntegerType()));
    }
}
