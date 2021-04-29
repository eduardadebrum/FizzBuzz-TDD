import org.junit.jupiter.api.Test;

public class ProcessPrintTest {

    @Test
    public void printNumberBetweenOneToHundred() {
        var fizzBuzzConverter =new FizzBuzzConverter();

        for(int i = 1; i <=100; i++) {
            System.out.println(fizzBuzzConverter.converter(i));
        }
    }
}
