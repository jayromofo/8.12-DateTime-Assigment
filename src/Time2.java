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


    // Getters
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    // Constructors
    public Time2() {
        this(0, 0, 0);
    }

    // Constructs with hour
    public Time2(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0 - 23");
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    // Constructs with hour and minute
    public Time2(int hour, int minute) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0 - 23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("Minute must be 0 - 59");
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    // Constructs with all (validation)
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


    // Time2 String (converts to 12h clock)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    // Time2 Universal String
    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    /*
        Increments seconds. Guessing if this were to go on a loop it should check if minute/second are 60 then automatically call
        incrementMinute/Increment hour. If seconds hit 60 then they get reset back to 0
     */
    public void tick() {
        ++this.second;
        if (second == 60){
            incrementMinute();
            second = 0;
        }

        if (minute == 60) {
            incrementHour();
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
            nextDay();
        }
    }

    // Increments hour
    public void incrementHour() {
        ++hour;
        if (hour == 24)
            hour = 0;
    }

    // Increments minute
    public void incrementMinute() {
        ++minute;
        if (minute == 60)
            minute = 0;
    }



    // Next day resets the minutes and seconds and sets the hour to 12 (which should switch to AM in toString and 0:00 in universal)
    public void nextDay(){
        hour = 12;
        minute = 0;
        second = 0;
    }
}

