package org.sargassov.example.models;

import lombok.Data;
import org.sargassov.example.models.players.Player;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class League {
    private static String leagueName;
    private static League instance;

    private static List<Sponsor> sponsorList;
    private static List<Team> teamList;
    private static List<Player> youthPool;
    private static Team userTeam;

    private League() {

    }

    public static League getInstance(){
        if(instance == null){
            instance = new League();
            leagueName = "Russian Premier League";
            sponsorList = new ArrayList<>();
            teamList = new ArrayList<>();
            youthPool = new ArrayList<>();
        }
        return instance;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public static List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public Team getUserTeam() {
        return userTeam;
    }

    public static List<Team> getTeamList() {
        return teamList;
    }

    public static void setTeamList(List<Team> teamList) {
        League.teamList = teamList;
    }

    public static List<Player> getYouthPool() {
        return youthPool;
    }
}
