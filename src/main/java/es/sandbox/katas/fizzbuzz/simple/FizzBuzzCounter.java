package es.sandbox.katas.fizzbuzz.simple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by jeslopalo on 14/12/15.
 */
public class FizzBuzzCounter {

    private FizzBuzzCalculator calculator;

    FizzBuzzCounter(final FizzBuzzCalculator calculator) {
        this.calculator = calculator;
    }

    public Collection<String> count() {
        final List<String> count = new ArrayList<String>(100);

        for (int i = 1; i <= 100; i++) {
            count.add(i - 1, this.calculator.fizzBuzzOf(i));
        }

        return count;
    }
}
