import java.util.Scanner;

class Date {
    private int month;
    private int day;
    private int year;
    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Month not valid");
        }
    }
    public void setDay(int day) {
        if (day > 0 && day <= 31) { 
            this.day = day;
        } else {
            System.out.println("Day not valid");
        }
    }
    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Year not valid");
        }
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
public class practical_14 {
    public static void main(String[] args) {
        Date d1 = new Date(1, 16, 2006); 
        d1.displayDate();
        d1.setMonth(1); 
        d1.setDay(1);   
        d1.setYear(2001);  

        System.out.println("Updated date is printed here");
        d1.displayDate();
    }
}
