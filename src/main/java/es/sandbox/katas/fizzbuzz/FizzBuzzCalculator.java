package es.sandbox.katas.fizzbuzz;

/**
 * Created by jeslopalo on 15/12/15.
 */
class FizzBuzzCalculator {

    String fizzBuzzOf(final int number) {
        String element = "";

        if (multipleOfThree(number)) {
            element += "Fizz";
        }
        if (multipleOfFive(number)) {
            element += "Buzz";
        }
        if (notMultipleOfThreeOrFive(number)) {
            element += Integer.toString(number);
        }
        return element;
    }

    private boolean notMultipleOfThreeOrFive(int number) {
        return !multipleOfThree(number) && !multipleOfFive(number);
    }

    private boolean multipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean multipleOfThree(int number) {
        return number % 3 == 0;
    }
}
