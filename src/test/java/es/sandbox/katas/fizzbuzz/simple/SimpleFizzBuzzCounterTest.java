package es.sandbox.katas.fizzbuzz.simple;

import static es.sandbox.katas.fizzbuzz.FizzBuzzAssertions.*;

import org.junit.Test;

/**
 * Created by jeslopalo on 14/12/15.
 */
public class SimpleFizzBuzzCounterTest {

    @Test
    public void it_should_count() {
        assertThatCountIsValid(new SimpleFizzBuzzCounter().count());
    }
}
