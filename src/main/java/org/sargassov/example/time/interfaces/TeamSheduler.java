package org.sargassov.example.time.interfaces;

import org.sargassov.example.time.calendar_creators.Shedule;

import java.util.List;

public interface TeamSheduler {
    List<List<Shedule>> getSheduler();
    int getLeagueTeamSize();
    int getMatchesInTour();
    int getTours();
}
