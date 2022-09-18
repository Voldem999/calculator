package com.calculator.calculator;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {

    public int plus(Integer a, Integer b);
    public int minus(Integer a, Integer b);
    public int multiply(Integer a, Integer b);
    public double divide(Integer a, Integer b);

}
