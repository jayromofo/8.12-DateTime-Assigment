/**
 * * Main
 * * Created By: Jason Rossetti
 * * Date Created: 2021-03-12
 * * @Email: rossetti.jason@gmail.com
 **/


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

        t.setTime(5, 59, 59);
        System.out.println(t.toString());
        t.tick();
        System.out.println(t.toString());
        t.nextDay();
        System.out.println(t.toString());
        t.incrementHour();
        t.incrementMinute();
        System.out.println(t.toString());

        // Setting time to 11:59:59 for next day
        t.setTime(11, 59, 59);
        t.tick();
        System.out.println(t.toString());
        t.incrementHour();
        System.out.println(t.toUniversalString());
        t.setTime(23, 59, 59);
        System.out.println(t.toUniversalString());
        t.tick();
        System.out.println(t.toString());

        // Now checking days
        while (d.getYear() != 2022) {
            System.out.println(d.toString());
            d.nextDay();
        }
//        System.out.println(d.toString());
//        d.nextMonth();
//        System.out.println(d.toString());
//        d.nextYear();
//        System.out.println(d.toString());




        // DateTime dateTime = new DateTime(d, t);
//        Boolean isRunning = true;
//        while (isRunning) {
//            t.tick();
//            if (d.getYear() == 2023){
//                System.out.println("The year is 2023, goodbye");
//                isRunning = false;
//            }
//        } if (t.getHour() > 23){
//            System.out.println("Next Day");
//            d.nextDay();
//            d.toString();
//        }

    }




}





