package ru.verlonar.hw212.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.verlonar.hw212.service.CalculatorService;

import java.util.stream.Stream;

import static ru.verlonar.hw212.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParamTest {

    CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTests")
    public void shouldGetCorrectPlusResult(double firstDouble, double secondDouble, String correctResult) {
        String result = out.plus(firstDouble, secondDouble);
        Assertions.assertEquals(correctResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTests")
    public void shouldGetCorrectMinusResult(double firstDouble, double secondDouble, String correctResult) {
        String result = out.minus(firstDouble, secondDouble);
        Assertions.assertEquals(correctResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldGetCorrectMultiplyResult(double firstDouble, double secondDouble, String correctResult) {
        String result = out.multiply(firstDouble, secondDouble);
        Assertions.assertEquals(correctResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldGetCorrectDivideResult(double firstDouble, double secondDouble, String correctResult) {
        String result = out.divide(firstDouble, secondDouble);
        Assertions.assertEquals(correctResult, result);
    }

    public static Stream<Arguments> provideParamsForPlusTests() {
        return Stream.of(
                Arguments.of(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE, FIRST_GROUP_CORRECT_PLUS_RESULT),
                Arguments.of(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE, SECOND_GROUP_CORRECT_PLUS_RESULT)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTests() {
        return Stream.of(
                Arguments.of(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE, FIRST_GROUP_CORRECT_MINUS_RESULT),
                Arguments.of(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE, SECOND_GROUP_CORRECT_MINUS_RESULT)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(

                Arguments.of(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE, FIRST_GROUP_CORRECT_MULTIPLY_RESULT),
                Arguments.of(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE, SECOND_GROUP_CORRECT_MULTIPLY_RESULT)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {
        return Stream.of(
                Arguments.of(FIRST_GROUP_FIRST_DOUBLE, FIRST_GROUP_SECOND_DOUBLE, FIRST_GROUP_CORRECT_DIVINE_RESULT),
                Arguments.of(SECOND_GROUP_FIRST_DOUBLE, SECOND_GROUP_SECOND_DOUBLE, SECOND_GROUP_CORRECT_DIVINE_RESULT)
        );
    }
}
