package org.sargassov.example.time.calendar_creators;

import lombok.SneakyThrows;
import org.sargassov.example.time.days.Day;
import org.sargassov.example.time.days.DayTrain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DateBook{
    private List<List<Day>> calendar;

    private static final GregorianCalendar startdate = new GregorianCalendar(2019, 7, 1);
    private static GregorianCalendar currentDate;
    private static final int monthVal = 11;
    private static class MonthDayConst{
        private static int[] dayConst = {31, 30, 31, 30,
                31, 31, 29, 31, 30, 31, 6};
    }

    public DateBook() {
        calendar = new ArrayList<>(monthVal);
        currentDate = (GregorianCalendar)startdate.clone();
        booker();
    }

    @SneakyThrows
    private void booker() {

        for(int x = 0; x < monthVal; x++){
            calendar.add(x, new ArrayList<>(MonthDayConst.dayConst[x]));
            System.out.println(x);

            for(int y = 0; y < MonthDayConst.dayConst[x]; y++) {
                Day day = new DayTrain(currentDate);
                day = day.clone();
                currentDate.add(Calendar.DAY_OF_MONTH, 1);
                calendar.get(x).add(day);
            }
        }
    }

    public List<List<Day>> getCalendar() {
        return calendar;
    }
}
