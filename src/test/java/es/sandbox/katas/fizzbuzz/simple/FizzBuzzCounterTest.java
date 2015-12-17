package es.sandbox.katas.fizzbuzz.simple;

import static es.sandbox.katas.fizzbuzz.FizzBuzzAssertions.*;

import es.sandbox.katas.fizzbuzz.simple.FizzBuzzCalculator;
import es.sandbox.katas.fizzbuzz.simple.FizzBuzzCounter;
import org.junit.Test;

/**
 * Created by jeslopalo on 14/12/15.
 */
public class FizzBuzzCounterTest {

    @Test
    public void it_should_count() {
        assertThatCountIsValid(new FizzBuzzCounter(new FizzBuzzCalculator()).count());
    }
}
