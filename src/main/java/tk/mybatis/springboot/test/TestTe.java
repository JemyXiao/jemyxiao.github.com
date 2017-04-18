package tk.mybatis.springboot.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jmx on 16/5/17.
 */
public class TestTe {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTimeInMillis());
        calendar.setTimeInMillis(1490814000000L);
        System.out.println(calendar.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long timeStart = 0;
        try {
            timeStart = sdf.parse("2017-01-12 08:00:00").getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(timeStart);
        Date date = new Date(timeStart);
        System.out.println(sdf.format(date));
    }
//    public static void main(String[] args) {
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDateTime.getHour());
////        System.out.println(localDate.format(DateTimeFormatter.ofPattern("")));
//        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
//        System.out.println(System.currentTimeMillis());
//        LocalDateTime dt = LocalDateTime.now();
//        ZonedDateTime zonedDateTime = dt.atZone(ZoneId.systemDefault());
//        System.out.println(zonedDateTime.toInstant().toEpochMilli());
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime localDateTime = LocalDateTime.parse("2017-02-27 09:00:00",dateTimeFormatter);
//        System.out.println(localDateTime.getHour());
//        LocalTime localTime;
//        System.out.println(localTime.getHour()+":"+localTime.getMinute());
//        localTime = LocalTime.of(9,0,0);
//        System.out.println(localTime.getHour()+":"+localTime.getMinute());
//    }
}
