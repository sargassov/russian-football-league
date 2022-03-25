package org.sargassov.example.time.days;


import org.sargassov.example.models.League;
import org.sargassov.example.models.Stadium;
import org.sargassov.example.models.Team;
import org.sargassov.example.models.players.Player;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class DayMatch extends Day implements Cloneable {
    private Team home;
    private Team away;
    private Stadium stadium;
    private League league;

    private List<Player> scorePlayers;

    private int homeScore;
    private int awayScore;
    private boolean matchPassed;

    public DayMatch(GregorianCalendar date) {
        super(date);
        scorePlayers = new ArrayList<>();
    }

    @Override
    public DayMatch clone() {
        DayMatch dayMatch = null;
        return (DayMatch) super.clone();
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public List<Player> getScorePlayers() {
        return scorePlayers;
    }

    public void setScorePlayers(List<Player> scorePlayers) {
        this.scorePlayers = scorePlayers;
    }

    public boolean isMatchPassed() {
        return matchPassed;
    }

    public void setMatchPassed(boolean matchPassed) {
        this.matchPassed = matchPassed;
    }
}
