package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.Exceptions.ZeroDivizorException;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void shouldDivizorIsNull() {
        assertThrows(ZeroDivizorException.class,
                () -> out.getDivide(5, 0)
        );
    }

    @Test
    public void shouldDivizorIsNotNull() {
        Assertions.assertDoesNotThrow(() -> out.getDivide(5, 5));
    }


}