package ru.verlonar.hw212.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.verlonar.hw212.service.CalculatorService;

import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.FIRST_GROUP_FIRST_DOUBLE;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.FIRST_GROUP_SECOND_DOUBLE;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.SECOND_GROUP_FIRST_DOUBLE;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.SECOND_GROUP_SECOND_DOUBLE;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.ARGUMENT_FOR_EXCEPTION_CHECK;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.FIRST_GROUP_CORRECT_PLUS_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.SECOND_GROUP_CORRECT_PLUS_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.FIRST_GROUP_CORRECT_MINUS_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.SECOND_GROUP_CORRECT_MINUS_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.FIRST_GROUP_CORRECT_MULTIPLY_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.SECOND_GROUP_CORRECT_MULTIPLY_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.FIRST_GROUP_CORRECT_DIVINE_RESULT;
import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.SECOND_GROUP_CORRECT_DIVINE_RESULT;



public class CalculatorServiceImplTest {

    CalculatorService out = new CalculatorServiceImpl();
    @Test
    public void firstGroupPlus() {
        String result = out.plus(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, FIRST_GROUP_CORRECT_PLUS_RESULT);
    }

    @Test
    public void secondGroupPlus() {
        String result = out.plus(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, SECOND_GROUP_CORRECT_PLUS_RESULT);
    }

    @Test
    public void firstGroupMinus() {
        String result = out.minus(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, FIRST_GROUP_CORRECT_MINUS_RESULT);
    }

    @Test
    public void secondGroupMinus() {
        String result = out.minus(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, SECOND_GROUP_CORRECT_MINUS_RESULT);
    }

    @Test
    public void firstGroupMultiply() {
        String result = out.multiply(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, FIRST_GROUP_CORRECT_MULTIPLY_RESULT);
    }

    @Test
    public void secondGroupMultiply() {
        String result = out.multiply(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, SECOND_GROUP_CORRECT_MULTIPLY_RESULT);
    }

    @Test
    public void firstGroupDivide() {
        String result = out.divide(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, FIRST_GROUP_CORRECT_DIVINE_RESULT);
    }

    @Test
    public void secondGroupDivide() {
        String result = out.divide(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE);
        Assertions.assertEquals(result, SECOND_GROUP_CORRECT_DIVINE_RESULT);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> out.divide(FIRST_GROUP_FIRST_DOUBLE, ARGUMENT_FOR_EXCEPTION_CHECK));
    }
}
