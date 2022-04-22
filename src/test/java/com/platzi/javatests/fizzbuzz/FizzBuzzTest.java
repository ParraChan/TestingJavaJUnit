package com.platzi.javatests.fizzbuzz;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;


public class FizzBuzzTest {

    @Test
    public void return_Fizz_when_the_number_is_divisible_by_3() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(6), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(9), is("Fizz"));
    }

    @Test
    public void return_Buzz_when_the_number_is_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(20), is("Buzz"));
    }

    @Test
    public void return_FizzBuzz_when_the_number_is_divisible_by_3_dnd_by_5() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(45), is("FizzBuzz"));
    }

    @Test
    public void return_the_same_number_in_other_cases() {
        assertThat(FizzBuzz.fizzBuzz(7), is("7"));
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));
    }
}