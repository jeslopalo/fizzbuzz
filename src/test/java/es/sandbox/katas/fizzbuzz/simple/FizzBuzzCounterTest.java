package es.sandbox.katas.fizzbuzz.simple;

import org.junit.Test;

import static es.sandbox.katas.fizzbuzz.FizzBuzzAssertions.assertThatCountIsValid;

/**
 * Created by jeslopalo on 14/12/15.
 */
public class FizzBuzzCounterTest {

    @Test
    public void it_should_count() {
        assertThatCountIsValid(new FizzBuzzCounter(new FizzBuzzCalculator()).count());
    }
}
