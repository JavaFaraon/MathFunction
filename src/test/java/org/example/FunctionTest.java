package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionTest {
    private static final double a = 2.7;
    private static final double b = -0.3;
    private static final int c = 4;
    private double x;
    Function function;

    @org.testng.annotations.BeforeMethod
    public void setUp() {
        function = new Function();
    }

    @org.testng.annotations.Test
    public void testCalcExpression() {
        x=1;
        double expected = 6.4;
        double actual = function.calcExpression(x);
        assertEquals(actual,expected, 0.000001, "Function wrong");
    }
    @org.testng.annotations.Test
    public void test1CalcExpression() {
        x=1.4;
        double expected = 3.649036;
        double actual = function.calcExpression(x);
        assertEquals(actual,expected, 0.000001, "Function wrong");
    }
    @org.testng.annotations.Test
    public void test2CalcExpression() {
        x=2;
        double expected = 0.939148;
        double actual = function.calcExpression(x);
        assertEquals(actual,expected, 0.000001, "Function wrong");
    }

    @Test
    public void testNumberOfTabSteps() {
        double s = 0.0;
        double f = 2.0;
        double st = 0.002;
        int expected = 1001;
        int actual = function.numberOfTabSteps(s,f, st);
        assertEquals(actual,expected,"Function wrong");
    }

    @Test
    public void testTabFunction() {
        int stepNumber = 0;
        double expected = 4.0;
        double actual = function.tabFunction()[stepNumber][1];
        assertEquals(actual,expected, 0.000001, "Function wrong");

    }

    @Test
    public void test1TabFunction() {
        int stepNumber = 700;
        double expected = 3.649036;
        double actual = function.tabFunction()[stepNumber][1];
        assertEquals(actual,expected, 0.000001, "Function wrong");

    }

    @Test
    public void test2TabFunction() {
        int stepNumber = 1000;
        double expected = 0.939148;
        double actual = function.tabFunction()[stepNumber][1];
        assertEquals(actual,expected, 0.000001, "Function wrong");

    }

    @Test
    public void testNumberOfMinElement() {
        double[][] array = {{1.0,2.0}, {3.0,4.0}, {5.0,6.0}, {7.0,8.0}};
        int expected = 0;
        int actual =  function.numberOfMinElement(array);
        assertEquals(actual,expected,"Function wrong");
    }

    @Test
    public void testNumberOfMaxElement() {
        double[][] array = {{1.0,2.0}, {3.0,4.0}, {5.0,6.0}, {7.0,8.0}};
        int expected = 3;
        int actual =  function.numberOfMaxElement(array);
        assertEquals(actual,expected,"Function wrong");
    }

    @Test
    public void testSumOfArray() {
        double[][] array = {{1.0,2.0}, {3.0,4.0}, {5.0,6.0}, {7.0,8.0}};
        double expected = 20.0;
        double actual = function.sumOfArray(array);
        assertEquals(actual,expected, 0.000001, "Function wrong");
    }

    @Test
    public void testMeanOfArray() {
        double[][] array = {{1.0,2.0}, {3.0,4.0}, {5.0,6.0}, {7.0,8.0}};
        double expected = 5.0;
        double actual = function.meanOfArray(array);
        assertEquals(actual,expected, 0.000001, "Function wrong");
    }
}