import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizzBuzzConverterNotMultipleForThreeOrFive() {
        var fizzBuzzConverter = new FizzBuzzConverter();

        assertEquals("1", fizzBuzzConverter.converter(1));
    }

    @Test
    public void fizzBuzzConverterMultipleThree() {
        var fizzBuzzConverter = new FizzBuzzConverter();

        assertEquals("Fizz", fizzBuzzConverter.converter(3));
        assertEquals("Fizz", fizzBuzzConverter.converter(9));
        assertEquals("Fizz", fizzBuzzConverter.converter(12));
    }

    @Test
    public void fizzBuzzConverterMultipleFive() {
        var fizzBuzzConverter = new FizzBuzzConverter();

        assertEquals("Buzz", fizzBuzzConverter.converter(5));
        assertEquals("Buzz", fizzBuzzConverter.converter(10));
    }

    @Test
    public void fizzBuzzConverterMultipleThreeAndFive() {
        var fizzBuzzConverter= new FizzBuzzConverter();

        assertEquals("FizzBuzz", fizzBuzzConverter.converter(15));
    }
}
