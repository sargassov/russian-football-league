package org.sargassov.example;

import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;

public class Game {
    protected static League league;
    protected static String userName;
    protected static Team userTeam;

    public static League getLeague() {
        return league;
    }

    public static void setLeague(League league) {
        Game.league = league;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        Game.userName = userName;
    }

    public static Team getUserTeam() {
        return userTeam;
    }

    public static void setUserTeam(Team userTeam) {
        Game.userTeam = userTeam;
    }
}
