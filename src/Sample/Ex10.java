package Sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Ex10 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 7, 27);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy 年 M 月 dd 日");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy / MM / dd ");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 (E)");

        String format = localDate.format(formatter);
        System.out.println(format);
        String format1 = localDate.format(formatter1);
        System.out.println(format1);
        String format2 = localDate.format(formatter2);
        System.out.println(format2);
    }
}
