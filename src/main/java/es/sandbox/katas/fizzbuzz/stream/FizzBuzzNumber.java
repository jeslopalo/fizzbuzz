package es.sandbox.katas.fizzbuzz.stream;

/**
 * Created by jeslopalo on 17/12/15.
 */
public class FizzBuzzNumber {

    private final int number;

    public FizzBuzzNumber(final int number) {
        this.number= number;
    }

    public String print() {
        String element = "";

        if (multipleOfThree(this.number)) {
            element += "Fizz";
        }
        if (multipleOfFive(this.number)) {
            element += "Buzz";
        }
        if (notMultipleOfThreeOrFive(this.number)) {
            element += Integer.toString(this.number);
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
