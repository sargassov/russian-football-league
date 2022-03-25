package org.sargassov.example.time.days;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Day implements Cloneable{

    private GregorianCalendar date;

    private boolean isPassed;
    private boolean atPresentTime;


    public Day(GregorianCalendar date) {
        this.date = date;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }

    public boolean isAtPresentTime() {
        return atPresentTime;
    }

    public void setAtPresentTime(boolean atPresentTime) {
        this.atPresentTime = atPresentTime;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.get(Calendar.DAY_OF_MONTH) + " " + date.get(Calendar.MONTH) + " "
                + date.get(Calendar.YEAR);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Day)) return false;
        Day day = (Day) o;
        return getDate().get(Calendar.DAY_OF_MONTH) == day.getDate().get(Calendar.DAY_OF_MONTH) &&
                getDate().get(Calendar.MONTH) == day.getDate().get(Calendar.MONTH) &&
                getDate().get(Calendar.YEAR) == day.getDate().get(Calendar.YEAR);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPassed(), isAtPresentTime(), getDate());
    }

    @Override
    public Day clone() {
        try {
            Day day = null;
            day = (Day) super.clone();
            day.isPassed = isPassed;
            day.atPresentTime = atPresentTime;
            day.date = (GregorianCalendar) date.clone();
            return day;

        }
        catch( CloneNotSupportedException ex ) {
                throw new InternalError();
        }
    }
}
