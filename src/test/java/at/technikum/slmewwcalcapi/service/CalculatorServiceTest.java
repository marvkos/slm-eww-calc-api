package at.technikum.slmewwcalcapi.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    void addTwoPositiveIntegers() {
        // Arrange
        CalculatorService calculatorService =
                new CalculatorService();
        int a = 5;
        int b = 9;
        // Act
        int result = calculatorService.add(a, b);

        // Assert
        assertEquals(14, result);
    }
}