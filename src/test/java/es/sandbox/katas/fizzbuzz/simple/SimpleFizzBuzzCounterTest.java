package es.sandbox.katas.fizzbuzz.simple;

import static es.sandbox.katas.fizzbuzz.FizzBuzzAssertions.*;

import org.junit.Test;

import java.util.Collection;

/**
 * Created by jeslopalo on 14/12/15.
 */
public class SimpleFizzBuzzCounterTest {

    @Test
    public void it_should_count_as_a_string() {
        assertThatCountIsValid(new SimpleFizzBuzzCounter().countAsString());
    }

    @Test
    public void it_should_count_as_a_collection() {
        assertThatCountIsValid(new SimpleFizzBuzzCounter().countAsCollection());
    }
}
