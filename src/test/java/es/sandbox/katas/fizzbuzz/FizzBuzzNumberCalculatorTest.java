package es.sandbox.katas.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzNumberCalculatorTest {

    private FizzBuzzNumberCalculator sut;

    @Before
    public void setUp() throws Exception {
        this.sut = new FizzBuzzNumberCalculator();
    }

    @Test
    public void fizzbuzz_for_1_is_1() {
        assertThat(this.sut.fizzBuzzOf(1)).isEqualTo("1");
    }

    @Test
    public void fizzbuzz_for_a_multiple_of_three_is_fizz() {
        assertThat(this.sut.fizzBuzzOf(3)).isEqualTo("Fizz");
    }

    @Test
    public void fizzbuzz_for_a_multiple_of_five_is_buzz() {
        assertThat(this.sut.fizzBuzzOf(5)).isEqualTo("Buzz");
    }

    @Test
    public void fizzbuzz_for_a_multiple_of_three_and_five_is_fizzbuzz() {
        assertThat(this.sut.fizzBuzzOf(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void fizzbuzz_for_multiples_of_three_is_fizz() {
        assertThatFizzBuzzOfNumbersIs(new int[]{3, 6, 9, 12, 18, 21, 24, 27}, "Fizz");
    }

    @Test
    public void fizzbuzz_for_multiples_of_five_is_fizz() {
        assertThatFizzBuzzOfNumbersIs(new int[]{5, 10, 20, 25}, "Buzz");
    }

    @Test
    public void fizzbuzz_for_multiples_of_three_and_five_is_fizzbuzz() {
        assertThatFizzBuzzOfNumbersIs(new int[]{15, 30, 45, 60}, "FizzBuzz");
    }

    private void assertThatFizzBuzzOfNumbersIs(final int[] numbers, final String expectedFizzBuzz) {
        for (final int number : numbers) {
            assertThatFizzBuzzOfNumberIs(number, expectedFizzBuzz);
        }
    }

    private void assertThatFizzBuzzOfNumberIs(final int number, final String expectedFizzBuzz) {
        assertThat(this.sut.fizzBuzzOf(number))
                .as(String.format("Calculating %d FizzBuzz number", number))
                .isEqualTo(expectedFizzBuzz);
    }
}