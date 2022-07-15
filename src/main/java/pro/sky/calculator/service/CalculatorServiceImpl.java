package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.calculator.Exceptions.ZeroDivizorException;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String sayHello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String getPlus(int num1, int num2) {
        String s = String.valueOf(num1) + " + " + String.valueOf(num2) + " = " + String.valueOf(num1+num2);
        return s;
    }

    @Override
    public String getMinus(int num1, int num2) {
        String s = String.valueOf(num1) + " - " + String.valueOf(num2) + " = " + String.valueOf(num1-num2);
        return s;
    }

    @Override
    public String getMultiply(int num1, int num2) {
        String s = String.valueOf(num1) + " * " + String.valueOf(num2) + " = " + String.valueOf(num1*num2);
        return s;
    }

    @Override
    public String getDivide(int num1, int num2) {
        if(num2 == 0) {
            throw new ZeroDivizorException("Деление на ноль!");
        }
        String s = String.valueOf(num1) + " / " + String.valueOf(num2) + " = " + String.valueOf(num1/num2);
        return s;
    }
}
