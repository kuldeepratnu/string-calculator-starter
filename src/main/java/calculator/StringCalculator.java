package calculator;

class StringCalculator {

    public int add(String input) 
    {
    	/* Checking for  empty input string */
        if(input.isEmpty())
        	return 0;
        else if(input.length() > 1)
        {
        	/* Split the string with delimiters ',' or '\n' and store in array */
        	String[] arrayOfNumbers = input.split(",|\n");
        	
        	return sumOfNumbericString(arrayOfNumbers);
        }
        else
        {
        	/* Return the string as integer when string has 1 digit */
        	return Integer.parseInt(input);
        }
    }
    
    /* To sum the numbers in string passed*/
    int sumOfNumbericString(String[] stringOfNumbers)
    {
    	int result = 0;
    	/* Convert each number in string to integer and add to sum */
    	for(String number:stringOfNumbers)
    	{
    		result += Integer.parseInt(number);
    	}
    	
    	return result;
    }
}
