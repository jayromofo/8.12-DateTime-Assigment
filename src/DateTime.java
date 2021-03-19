/**
 * * DateTime
 * * Created By: Jason Rossetti
 * * Date Created: 2021-03-12
 * * @Email: rossetti.jason@gmail.com
 **/

public class DateTime {

    private Time2 time;
    private Date date;


    // Initialize DateTime with a Time2 and Date object
    public DateTime(Time2 time, Date date) {
        this.time = time;
        this.date = date;
    }

    // Trying to make the day increment if hour reaches 24
    public void nextDay() {
        if (time.getHour() == 24) {
            time.nextDay();
            date.nextDay();
        }
    }

    // Prints Date and Time2 string
    public String toString() {
        return String.format("%S \t %S", date.toString(), time.toString());
    }

    // Prints Date and Time2 universal string
    public String toUniversalString() {
        return String.format("%S \t %S", date.toString(), time.toUniversalString());
    }
}