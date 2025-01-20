package Sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex07 {
    public static void main(String[] args) {
    LocalDate birthDate = LocalDate.of(1999, 7, 23);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy 年 M 月 dd 日");
    String format = birthDate.format(formatter);
    System.out.println("私の誕生日は"+format+"です!");

    }
    
    
}
