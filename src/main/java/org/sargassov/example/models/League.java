package org.sargassov.example.models;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class League {
    private static String leagueName;

    private List<Sponsor> sponsorList;
    private List<Team> teamList;
    private Team userTeam;

    public League() {
        leagueName = "Russian Premier League";
        sponsorList = new ArrayList<>();
        teamList = new ArrayList<>();
    }

    public static String getLeagueName() {
        return leagueName;
    }

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public Team getUserTeam() {
        return userTeam;
    }

    public List<Team> getTeamList() {
        return teamList;
    }


}
