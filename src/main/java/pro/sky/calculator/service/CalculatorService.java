package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

public interface CalculatorService {
    public String sayHello();
    public String getPlus(int num1, int num2);
    public String getMinus(int num1, int num2);
    public String getMultiply(int num1, int num2);
    public String getDivide(int num1, int num2);
}
