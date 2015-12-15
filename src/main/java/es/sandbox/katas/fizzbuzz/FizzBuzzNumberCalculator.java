package es.sandbox.katas.fizzbuzz;

/**
 * Created by jeslopalo on 15/12/15.
 */
class FizzBuzzNumberCalculator {

    String fizzBuzzOf(final int number) {
        String element = "";

        if (multipleOfThree(number)) {
            element += "Fizz";
        }
        if (multipleOfFive(number)) {
            element += "Buzz";
        }
        if (!multipleOfThree(number) && !multipleOfFive(number)) {
            element += Integer.toString(number);
        }
        return element;
    }

    private boolean multipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean multipleOfThree(int number) {
        return number % 3 == 0;
    }
}
