package org.sargassov.example;

import org.sargassov.example.models.League;

public class RussianLeague extends League {
    private final static String leagueName = "Russian Football Premier League";
    private final static int leagueTeamSize = 16;

    public RussianLeague() {
        super(leagueName);
    }

    public static int getLeagueTeamSize() {
        return leagueTeamSize;
    }
}
