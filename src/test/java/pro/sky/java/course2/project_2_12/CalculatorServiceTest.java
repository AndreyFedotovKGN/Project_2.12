package pro.sky.java.course2.project_2_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.project_2_12.service.CalculatorService;


public class CalculatorServiceTest {

    public static int one = 1;
    public static int two = 2;
    public static int minusTwo = -2;
    public static int zero = 0;

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void plusTestOne() {
        int actual = calculatorService.plus(two, two);
        Assertions.assertEquals(two+two, actual);
    }
    @Test
    public void plusTestTwo() {
        int actual = calculatorService.plus(minusTwo, one);
        Assertions.assertEquals(minusTwo+one,actual);
    }

    @Test
    public void minusTestOne() {
        int actual = calculatorService.minus(two, one);
        Assertions.assertEquals(1, actual);
    }
     @Test
     public void minusTestTwo(){
        int actual = calculatorService.minus(minusTwo, one);
        Assertions.assertEquals(-3,actual);
    }

    @Test
    public void multipleTestOne() {
        int actual = calculatorService.multiple(two, one);
        Assertions.assertEquals(two*one, actual);
    }
    @Test
    public void multipleTestTwo() {
        int actual = calculatorService.multiple(minusTwo, one);
        Assertions.assertEquals(minusTwo*one, actual);
    }
    @Test
    public void divideTestOne() {
        double actual = calculatorService.divide(two, two);
        Assertions.assertEquals((double) two/two, actual);
    }

    @Test
    public void divideTestTwo() {
        double actual = calculatorService.divide(minusTwo, two);
        Assertions.assertEquals((double) minusTwo/two,actual);
    }
    @Test
    public void divisionByZeroErrorTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(one, zero));
    }


}
