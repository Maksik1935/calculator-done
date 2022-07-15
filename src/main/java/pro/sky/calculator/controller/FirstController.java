package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String sayHello() {
        return calculatorService.sayHello();
    }

    @GetMapping("/plus")
    public String getPlus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.getPlus(num1, num2);
    }
    @GetMapping("/minus")
    public String getMinus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.getMinus(num1, num2);
    }
    @GetMapping("/multiply")
    public String getMultiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.getMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String getDivide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.getDivide(num1, num2);
    }
}
