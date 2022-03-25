package org.sargassov.example.time.days;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayTrain extends Day {

    public DayTrain(GregorianCalendar date) {
        super(date);
    }

    @Override
    public String toString(){
        return getDate().get(Calendar.DAY_OF_MONTH)
                + " " + getDate().get(Calendar.MONTH)
                + " " + getDate().get(Calendar.YEAR)
                + " " + " training";
    }

}
