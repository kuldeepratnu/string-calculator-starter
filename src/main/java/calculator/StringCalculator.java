package calculator;

class StringCalculator {

    public int add(String input) {
    	try{
            int result = Integer.parseInt(input);
            return result;
        }catch(Exception e ){
            return 0;
        } 
    }

}
