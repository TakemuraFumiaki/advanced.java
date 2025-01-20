package Sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSample5 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("デフォルトの出力形式" + localDateTime);
        // 「yyyy 月 MM 日 dd HH 時 mm 分 ss 秒」という形式で出力する
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 HH 時 mm 分 ss 秒");
        String format = localDateTime.format(formatter);
        System.out.println(format);
        System.out.println("=============================");
        System.out.println("文字列から LocalDateTime へ変換");
        String strLocalDateTime = "2018/12/31 23:59:59";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime localDateTime2
        = LocalDateTime.parse(strLocalDateTime, formatter2);
        System.out.println("文字列から変換された LocalDateTime:" + localDateTime2);
    }
}
