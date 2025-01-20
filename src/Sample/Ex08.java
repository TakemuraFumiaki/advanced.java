package Sample;

import java.time.LocalDate;

import java.time.temporal.TemporalAdjusters;

public class Ex08 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020,2,1);
        LocalDate getsumatsu = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(getsumatsu);
        int lastday = getsumatsu.getDayOfMonth();
        System.out.println(lastday);
    }

}
