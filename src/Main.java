/**
 * * Main
 * * Created By: Jason Rossetti
 * * Date Created: 2021-03-12
 * * @Email: rossetti.jason@gmail.com
 **/
        // TODO: Assignment was confusing as hell trying to figure out what it actually wanted you to do or what was actually
        //       the point of the DateTime class. No fun lol

/* TODO: Create a test that calls next day which increments into the next month and then the next year and print
         it all out.
         Modify increment Hour to call next day if the time is incremented into the next day.
         Modify toString and universalToString to output the date as well
         *** Specifically testing the time to lead into the next day



 */
public class Main {
    public static void main(String[] args) {
        Time2 t = new Time2();
        Date d = new Date(3, 18, 2021);
        DateTime dateTime = new DateTime(t, d);

        t.setTime(5, 59, 59);
        System.out.println(dateTime.toString());
        t.tick();
        //System.out.println(t.toString());
        System.out.println(dateTime.toString());
        t.nextDay();
        //System.out.println(t.toString());
        System.out.println(dateTime.toString());
        t.incrementHour();
        t.incrementMinute();
        //System.out.println(t.toString());
        System.out.println(dateTime.toString());
        d.nextDay();
        System.out.println(dateTime.toString());
        d.nextMonth();
        System.out.println(dateTime.toString());
        d.nextYear();
        System.out.println(dateTime.toString());

        // Setting time to 11:59:59 for next day
        t.setTime(11, 59, 59);
        t.tick();
        System.out.println(dateTime.toString());
        t.incrementHour();
        System.out.println(t.toUniversalString());
        t.setTime(23, 59, 59);
        System.out.println(dateTime.toString());

        System.out.println(dateTime.toString());

        // Now checking days
        while (d.getYear() != 2022) {
            System.out.println(d.toString());
            d.nextDay();
        }
    }




}





