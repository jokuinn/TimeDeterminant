package com.epam.date.determinant.logic;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testGetHoursShouldCalculateWhenNumberIsPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        int actual = calculator.getHours(50000);
        //then
        Assert.assertEquals(13, actual);
    }

    @Test
    public void testGetMinutesShouldCalculateWhenNumberIsPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        int actual = calculator.getMinutes(50000, 13);
        //then
        Assert.assertEquals(53, actual);
    }

    @Test
    public void testGetSecondsShouldCalculateWhenNumberIsPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        int actual = calculator.getSeconds(50000, 13, 53);
        //then
        Assert.assertEquals(19, actual);
    }
}
