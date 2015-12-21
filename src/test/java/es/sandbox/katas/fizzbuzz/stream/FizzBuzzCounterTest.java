package es.sandbox.katas.fizzbuzz.stream;

import org.junit.Test;

import static es.sandbox.katas.fizzbuzz.FizzBuzzAssertions.assertThatCountIsValid;

public class FizzBuzzCounterTest {

    @Test
    public void it_should_count() {
        assertThatCountIsValid(new FizzBuzzCounter().count());
    }
}