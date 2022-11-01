package pro.sky.java.course2.project_2_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.project_2_12.service.CalculatorService;

import java.util.stream.Stream;

import static pro.sky.java.course2.project_2_12.CalculatorServiceTest.*;

public class CalculatorServiceParamsTests {


    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> paramsForCalculatorTest() {
        return Stream.of(
                Arguments.of(one, two),
                Arguments.of(two, two),
                Arguments.of(zero,minusTwo)
        );
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculatorTest")
    public void paramPlusTest(int a,int b) {
        int result = calculatorService.plus(a, b);
        Assertions.assertEquals(a + b, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculatorTest")
    public void paramMinusTest(int a,int b) {
        int result = calculatorService.minus(a, b);
        Assertions.assertEquals(a - b, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculatorTest")
    public void paramMultipleTest(int a,int b) {
        int result = calculatorService.multiple(a, b);
        Assertions.assertEquals(a * b, result);
    }

    @ParameterizedTest
    @MethodSource("paramsForCalculatorTest")
    public void paramDivideTest(int a,int b) {
        double result = calculatorService.divide(a, b);
        Assertions.assertEquals((double)a / b, result);
    }
}
