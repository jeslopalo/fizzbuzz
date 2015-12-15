package es.sandbox.katas.fizzbuzz;

import es.sandbox.katas.fizzbuzz.FizzBuzzCounter;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by jeslopalo on 14/12/15.
 */
public class SimpleFizzBuzzCounter implements FizzBuzzCounter {

    @Override
    public Collection<String> count() {
        final List<String> count = new ArrayList<String>(100);

        for (int i = 1; i <= 100; i++) {
            String element = "";

            if (multipleOfThree(i)) {
                element += "Fizz";
            }
            if (multipleOfFive(i)) {
                element += "Buzz";
            }
            if (!multipleOfThree(i) && !multipleOfFive(i)) {
                element += Integer.toString(i);
            }
            count.add(i - 1, element);
        }

        return count;
    }

    private boolean multipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean multipleOfThree(int number) {
        return number % 3 == 0;
    }
}
