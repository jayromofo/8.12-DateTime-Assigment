/**
 * * Date
 * * Created By: Jason Rossetti
 * * Date Created: 2021-03-12
 * * @Email: rossetti.jason@gmail.com
 **/

    // TODO: Copy the class from fig 8.7 and then enchance the class from exercise 8.8
    // TODO: Validate for year

public class Date {
    private int month;
    private int day;
    private int year;
    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getDay() { return day; }
    public int getYear() { return year; }
    public int getMonth() { return month; }

    // Sets the day with validation checkers for leap year and current month
    public void setDay(int day) {
        if (day <= 0 || day < 12) {
            throw new IllegalArgumentException("Month  ("+ month + ") must be 1 - 12");
        }
        if ((month == 2 && day == 29) && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specific month");
        }
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specific month");
        }
        this.day = day;
    }

    // Sets the year
    public void setYear(int year) {
        if (year <= 0 || year >= 2621) {
            throw new IllegalArgumentException("Month  (" + month + ") must be 1 - 2621");
        }
        this.year = year;
    }


    // Sets the month
    public void setMonth(int month) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month  ("+ month + ") must be 1 - 12");
        }
        this.month = month;
    }



    // Date constructor using mm/dd/yyyy
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month  ("+ month + ") must be 1 - 12");
        }
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specific month");
        }
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specific month");
        }

        if (year <= 0 || year > 3000) {
            throw new IllegalArgumentException("Month  ("+ month + ") must be 1 - 12");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    // Date toString
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    // Increments the day by one
    public void nextDay() {
        ++day;
        if (day > daysPerMonth[month]) {
                nextMonth();
                day = 1;
        }
    }

    // Increments the month by one according to the days in the month
    public void nextMonth() {
        int index = month;
        if (day > (daysPerMonth[index])) {
            day = 1;
            ++month;
            if (month == 13) {
                month = 1;
                nextYear();
            }
        } else {
            ++month;
        }
    }

    // Increments the year
    public void nextYear() {
            ++year;
    }

}


