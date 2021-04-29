public class FizzBuzzConverter {

    public String converter (Integer number) {
        var isMultipleThree = number % 3 == 0;
        var isMultipleFive = number % 5 ==0;

        if(isMultipleThree && isMultipleFive) {
            return "FizzBuzz";
        }

        if(isMultipleThree) {
            return "Fizz";
        }

        if(isMultipleFive) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
