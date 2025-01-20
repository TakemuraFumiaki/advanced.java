package Sample;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex11 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 7, 24);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日");

        String format = localDate.format(formatter2);
        String dayOfWeekJapanese = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE);
        System.out.println("オリンピックが開催される"+format+"は"+dayOfWeekJapanese+"です");

        LocalDate localDate3 = LocalDate.of(1999, 7, 23);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日");

        String format3 = localDate3.format(formatter3);
        String dayOfWeekJapanese3 = localDate3.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.JAPANESE);
        System.out.println("自分の誕生日である"+format3+"は"+dayOfWeekJapanese3+"です");





    }
}
