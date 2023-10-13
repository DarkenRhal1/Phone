package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {

        //Given - Arrange
        Calculator calculator = new Calculator();
        double x = 1;
        double y = 2;
        double expected = x + y;
        //When
        double actual = calculator.add(x, y);
        //Then -Act
        Assertions.assertEquals(expected, actual);
        //Assert

    }

    @Test
    void subtractTest(){
        Calculator calculator = new Calculator();

        double expected = 5;

        double actual = calculator.substract(10,5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideTest(){
        Calculator calculator = new Calculator();

        double expected = 2;

        double actual = calculator.divide(10,5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void exponentTest(){
        Calculator calculator = new Calculator();

        double expected = 25;

        double actual = calculator.exponent(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiplicationTest(){
        Calculator calculator = new Calculator();
        double x = 2;
        double y = 3;
        double expected = x * y;

        double actual = calculator.multiplication(x, y);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void checkIfParameterIsNullTest(){
        Calculator calculator = new Calculator();

        double expected = 0;

        double actual = calculator.checkIfParameterIsNull(1.0);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void inGreaterTest(){
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 5;
        boolean expected = x > y;

        boolean actual = calculator.inGreater(x, y);
        Assertions.assertFalse(actual);
    }

    @Test
    void multiplyArrayElementsByNumberGivenTest(){
        Calculator calculator = new Calculator();
        int[] x = {10, 20, 30, 40, 50};
        int y = 5;
        int result = 0;
            for (int xx : x) {
                System.out.println(xx * y);
                result = xx * y;
            }

            int expected = result;

//        int[] actual = calculator.multiplyArrayElementsByNumberGiven(x, y);
//        Assertions.assertEquals(x,y);
    }
}