package org.sargassov.example.time.calendar_creators;

public class Shedule {

    private String homeTeamNum;
    private String visitorTeamNum;

    public Shedule(String homeTeamNum, String visitorTeamNum) {
        this.homeTeamNum = homeTeamNum;
        this.visitorTeamNum = visitorTeamNum;
    }

    public String getHomeTeamNum() {
        return homeTeamNum;
    }

    public String getVisitorTeamNum() {
        return visitorTeamNum;
    }
}
