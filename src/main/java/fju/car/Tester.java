package fju.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date date = sdf.parse("08:58");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 30);
        System.out.println(calendar.getTime());
        //
        Car c1 = new Car("abc-123");
        Car c2 = new Car("xyz-888", "07:30");
        System.out.println(c1.enter);

        Date now = new Date();
        System.out.println(now.getTime());

        long dis = now.getTime() - c1.enter.getTime();
        System.out.println(dis);
    }
}
