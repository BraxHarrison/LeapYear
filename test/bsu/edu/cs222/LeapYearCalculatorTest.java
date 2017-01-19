package bsu.edu.cs222;

import edu.bsu.cs222.LeapYearCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapYearCalculatorTest {
    private LeapYearCalculator leapYear;

    @Before
    public void initialize(){
         leapYear = new LeapYearCalculator();
    }
    @Test
    public void test2004IsLeapYear(){
        boolean result = leapYear.isLeapYear(2004);
        Assert.assertTrue(result);
    }
    @Test
    public void test2003IsLeapYear(){
        boolean result = leapYear.isLeapYear(2003);
        Assert.assertFalse(result);
    }
    @Test
    public void test1751IsLeapYear(){
        boolean result = leapYear.isLeapYear(1751);
        Assert.assertFalse(result);
    }
    @Test
    public void test2016IsLeapYear(){
        boolean result = leapYear.isLeapYear(2016);
        Assert.assertTrue(result);
    }
    @Test
    public void test1900IsLeapYear(){
        boolean result = leapYear.isLeapYear(1900);
        Assert.assertFalse(result);
    }
    @Test
    public void testneg200sLeapYear(){
        boolean result = leapYear.isLeapYear(-200);
        Assert.assertFalse(result);
    }
    @Test
    public void test0isLeapYear(){
        boolean result = leapYear.isLeapYear(0);
        Assert.assertFalse(result);
    }
    @Test
    public void test9001isLeapYear(){
        boolean result = leapYear.isLeapYear(9001);
        Assert.assertFalse(result);
    }

}
