package edu.bsu.cs222;

public class LeapYearCalculator {
    public boolean isLeapYear(int year) {
        if(year < 1752) {
            return false;
        }
        else if(year % 100 == 0 && year % 400 != 0){
            return false;
        }
        return year % 4 == 0;
    }
}
