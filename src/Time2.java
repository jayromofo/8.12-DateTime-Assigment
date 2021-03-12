/**
 * * Time2
 * * Created By: Jason Rossetti
 * * Date Created: 2021-03-12
 * * @Email: rossetti.jason@gmail.com
 **/

public class Time2 {
    private int hour;
    private int minute;
    private int second;


    // Constructors
    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public Time2(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0 - 23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0 - 59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0 - 59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(Time2 time) {
        this(time.hour, time.minute, time.second);
    }

    // Set Methods
    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0 - 23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0 - 59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0 - 59");
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0 - 23");
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0 - 59");
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0 - 59");
        this.second = second;
    }

    // Getters
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    // TODO: Finish these methods and test them. Should be able to increment into the next day (11:59:59 "PM" -> 12:00:00 "AM")

    public void tick() {

    }

    public void incrementHour() {

    }

    public void incrementMinute() {

    }
}