package org.sargassov.example.models;


import org.sargassov.example.coaches.Manager;
import org.sargassov.example.finance.Bank;
import org.sargassov.example.finance.Sponsor;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.strategies.Placement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private League league;
    private String name;
    private String homeTown;
    private Stadium stadium;
    private Sponsor sponsor;
    private Placement placement;

    private List<Manager> coaches;
    private List<Player> playerList;
    private List<Bank> loans;
//    private List<Market> markets;
//    public ArrayList<String> coachInterface;

    private final long startWealth;
    public final int maxValueOfLoans;
    private int regularCapacity;
    private int temporaryTicketCost;
    private int teamPower;
    private long wealth;
    private long transferExpenses;
    private long personalExpenses;
    private long marketExpenses;
    private long stadiumExpenses;
//    private boolean changeSponsor = false;

    public Team(String info) {
        //        markets = new ArrayList<>();
        coaches = new ArrayList<>();
        playerList = new ArrayList<>();
        loans = new ArrayList<>();

        String[] teamInfo = info.split("/");

        name = teamInfo[0];
        homeTown = teamInfo[1];
        stadium = new Stadium(teamInfo[2], Integer.parseInt(teamInfo[4]));
        if(coaches.size() == 0) {coaches.add(new Manager(teamInfo[3]));}

        wealth = Long.parseLong(teamInfo[5]) * 1_000_000;
        startWealth = wealth;
        temporaryTicketCost = 60;
        maxValueOfLoans = 5;

    }

    private void addToSponsor() {
        Random random = new Random();
        sponsor = league.getSponsorList().get(random.nextInt(16));
        wealth += sponsor.getContractBonusWage();
//        regularCapacity = capacityStad / 4;
        System.out.println(name + " " + sponsor.getName());
    }


    public List<Player> getPlayerList() {
        return playerList;
    }

//    public static void setLeague(League league) {
//        Team.league = league;
//    }

    public String getName() {
        return name;
    }

    //

//
//    public void breakSponsorContract(){
//        wealth -= sponsor.getContractBonusWage();
//        System.out.println("\n" + Corrector.getS(35) + "Contract with " + sponsor.getName() + " was broken!\n" +
//                Corrector.getS(35) + sponsor.getContractBonusWage() + " gived away from team budget!");
//        sponsor = null;
//
//    }
//
//    public void offerSponsorContract(Sponsor sponsor) {
//        this.sponsor = sponsor;
//        wealth += sponsor.getContractBonusWage();
//        System.out.println("\n" + Corrector.getS(30) + "Contract with " + sponsor.getName() + " was offered!\n" +
//                Corrector.getS(30) + sponsor.getContractBonusWage() + " came into team budget!");
//    }
//
//    public int teamCounter(){
//        for (int i = 0; i < rfpl.teams.length; i++) {
//            if(name.equals(rfpl.teams[i].name))
//                return i;
//        }
//        return -1;
//    }
//
//    public String nameOfTeamInRegister() {
//
//        char[] nameOfTeam = name.toCharArray();
//        StringBuilder toReturn = new StringBuilder();
//        for(int x = 0; x < nameOfTeam.length; x++){
//            toReturn.append(nameOfTeam[x]);
//            toReturn.append(' ');
//        }
//
//        return new String(toReturn);
//    }
//
//    public int getPoints(){
//        return wins * 3 + draws;
//    }
//

    public long getWealth() {
        return wealth;
    }

    public void setWealth(long wealth) {
        this.wealth = wealth;
    }

    public List<Bank> getLoans() {
        return loans;
    }


    public void selectSponsor() {
        addToSponsor();
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public Placement getPlacement() {
        return placement;
    }

    public int getTeamPower() {
        return teamPower;
    }

    public void setTeamPower(int teamPower) {
        this.teamPower = teamPower;
    }
}
