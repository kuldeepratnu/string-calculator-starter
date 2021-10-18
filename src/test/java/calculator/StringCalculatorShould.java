package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    //testing for two 2-digit numbers
    @Test
    void string_with_two_digit_numbers_should_return_sum() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(42,stringCalculator.add("20,22"));
    }
    
    //testing for unknown amount of digits
    @Test
    void string_with_any_amount_of_digits() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(210,stringCalculator.add("10,20,80,100"));
    	
    }
    
    //testing for \n as new delimiter
    @Test
    void string_with_new_line_as_delimiter() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(35, stringCalculator.add("20\n15"));
    }
    
    //testing if method supports both \n and , as delimiter
    @Test
    void string_with_new_line_and_comma_as_delimiter() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(220, stringCalculator.add("80,60\n80"));
    }
}
