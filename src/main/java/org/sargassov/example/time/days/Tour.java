package org.sargassov.example.time.days;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Tour extends Day implements Cloneable{

    private List<DayMatch> matches;

    public Tour(GregorianCalendar date) {
        super(date);
        matches = new ArrayList<>();
    }

    public List<DayMatch> getMatches() {
        return matches;
    }

    @Override
    public Tour clone() {
        return (Tour) super.clone();
    }
}
