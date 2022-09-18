package com.calculator.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String hello() {
        return "<b>Добро пожаловать в калькулятор<b>";
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam(name = "num1", required = false) Integer a,
                       @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return "Один из параметров не введен";
        int plus = calculatorService.plus(a, b);
        return a + "+" + b + "=" + plus;
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(name = "num1", required = false) Integer a,
                        @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return "Один из параметров не введен";
        int minus = calculatorService.minus(a, b);
        return a + "-" + b + "=" + minus;
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(name = "num1", required = false) Integer a,
                           @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return "Один из параметров не введен";
        int multiply = calculatorService.multiply(a, b);
        return a + "*" + b + "=" + multiply;
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(name = "num1", required = false) Integer a,
                         @RequestParam(name = "num2", required = false) Integer b) {
        if (a == null || b == null) return "Один из параметров не введен";
        double divide = calculatorService.divide(a, b);
        if (b == 0) return "На ноль делить нельзя";
        return a + ":" + b + "=" + divide;
    }
}

