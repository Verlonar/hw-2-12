package ru.verlonar.hw212.service.impl;

import org.springframework.stereotype.Service;
import ru.verlonar.hw212.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(double num1, double num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(double num1, double num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(double num1, double num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(double num1, double num2) {

        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}