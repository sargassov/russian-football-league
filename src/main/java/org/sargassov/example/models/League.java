package org.sargassov.example.models;

import lombok.Data;
import org.sargassov.example.finance.Bank;
import org.sargassov.example.finance.Sponsor;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.time.days.Day;
import org.sargassov.example.time.days.Tour;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public abstract class League {
    private String leagueName;

    private List<List<Day>> calendar;
    private List<Tour> allTourDates;
    private List<Sponsor> sponsorList;
    private List<Team> teamList;
    private List<Bank> banks;
    private List<Player> youthPool;
    private Team userTeam;

    public League(String leagueName) {
        this.leagueName = leagueName;
        sponsorList = new ArrayList<>();
        teamList = new ArrayList<>();
        youthPool = new ArrayList<>();
        banks = new ArrayList<>();
    }

    public String getLeagueName() {
        return leagueName;
    }

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void addToTeamList(Team t) {
        t.setLeague(this);
        teamList.add(t);
    }

    public void addToBankList(Bank b) {
        b.setLeague(this);
        banks.add(b);
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public List<Player> getYouthPool() {
        return youthPool;
    }

    public List<Bank> getBanks() {
        return banks;
    }

    public void setBanks(List<Bank> banks) {
        this.banks = banks;
    }

    public List<List<Day>> getCalendar() {
        return calendar;
    }

    public void setCalendar(List<List<Day>> calendar) {
        this.calendar = calendar;
    }

    public List<Tour> getAllTourDates() {
        return allTourDates;
    }

    public void setAllTourDates(List<Tour> allTourDates) {
        this.allTourDates = allTourDates;
    }
}
