package es.sandbox.katas.fizzbuzz.stream;

import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.rangeClosed;

/**
 * Created by jeslopalo on 17/12/15.
 */
public class FizzBuzzCounter {

    public Collection<String> count() {

        return rangeClosed(1, 100)
                .mapToObj(FizzBuzzNumber::new)
                .map(FizzBuzzNumber::print)
                .collect(Collectors.toList());
    }
}
