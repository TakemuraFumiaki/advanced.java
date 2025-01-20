package Sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeSample2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        
        
        int year = localDateTime.getYear();
        System.out.println("年："+year);

        int month = localDateTime.getMonthValue();
        System.out.println("月:" + month);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("日:" + dayOfMonth);
        int hour = localDateTime.getHour();
        System.out.println("時:" + hour);
        int minute = localDateTime.getMinute();
        System.out.println("分:" + minute);
        int second = localDateTime.getSecond();
        System.out.println("秒:" + second);
        int nano = localDateTime.getNano();
        System.out.println("ナノ秒:" + nano);

        localDateTime = localDateTime.plusYears(1);
        localDateTime = localDateTime.plusMonths(2);
        localDateTime = localDateTime.plusDays(3);
        localDateTime = localDateTime.plusHours(4);
        localDateTime = localDateTime.plusMinutes(5);
        localDateTime = localDateTime.plusSeconds(6);
        localDateTime = localDateTime.plusNanos(7);
        System.out.println("進めた後:" + localDateTime);

        LocalDate localDate = LocalDate.now();
        localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(localDate);

        


    }
    
}
