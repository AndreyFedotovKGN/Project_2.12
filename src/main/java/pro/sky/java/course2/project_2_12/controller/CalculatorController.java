package pro.sky.java.course2.project_2_12.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.project_2_12.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1",required = false) Integer a,
                    @RequestParam(name = "num2",required = false) Integer b) {
        if (a == null || b == null) return "значение не передано";
       int plus = calculatorService.plus(a, b);
        return a + " + " + b + " = " + plus;
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(name = "num1",required = false) Integer a,
                        @RequestParam(name = "num2",required = false) Integer b) {
        if (a == null || b == null) return "значение не передано";
        int minus = calculatorService.minus(a,b);
        return a + " - " + b + " = " + minus;
    }

    @GetMapping("/multiple")
    public String multiple(@RequestParam(name = "num1", required = false) Integer a,
                       @RequestParam(name = "num2",required = false) Integer b) {
        if (a == null || b == null) return "значение не передано";
        int multiple = calculatorService.multiple(a,b);
        return a + " * " + b + " = " + multiple;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(name = "num1",required = false) Integer a,
                           @RequestParam(name = "num2",required = false) Integer b) {
        double divide = calculatorService.divide(a, b);
        return a + " / " + b + " = " + divide;
    }

}
