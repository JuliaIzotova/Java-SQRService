package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Limits', 200, 300, 3",
            "'Critical borders', 100, 9801, 90",
            "'Over 9801', 9802, 100000, 0",
            "'Over 99', 99, 1, 0"})
    void shouldCalculateSqr(String testName, int underLimit, int overLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSqr(underLimit, overLimit);

        assertEquals(expected, actual);
    }
}