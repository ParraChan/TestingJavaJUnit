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
        assertThat(FizzBuzz.fizzBuzz(3627), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(2553), is("Fizz"));
    }

    @Test
    public void return_Buzz_when_theN_number_is_divisible_by_5() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(32870), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(7160), is("Buzz"));
    }

    @Test
    public void return_FizzBuzz_when_the_number_is_divisible_by_3_dnd_by_5() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(2550), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(495), is("FizzBuzz"));
    }

    @Test
    public void return_the_same_number_in_other_cases() {
        assertThat(FizzBuzz.fizzBuzz(7), is("7"));
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(16), is("16"));
    }
}