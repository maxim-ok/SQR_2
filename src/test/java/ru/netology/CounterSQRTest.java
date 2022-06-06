package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CounterSQRTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})


    public void checkingCounter(int startBoard, int endBoard, int expected) {
        CounterSQR checking = new CounterSQR();

        int actual = checking.counter(startBoard, endBoard);
        //int expected = 11;

        Assertions.assertEquals(expected, actual);

    }


}
