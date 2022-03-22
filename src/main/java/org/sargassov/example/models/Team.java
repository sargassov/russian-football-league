package org.sargassov.example.models;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Team {
    private static League league;
    private String name;
    private String homeTown;
    private Stadium stadium;
    private long wealth;
    private final long startWealth;
    private List<Coach> coaches;
    private List<Player> playerList;
//    private List<Market> markets;
//    private List<Bank> loans;
//    public int temporaryTicketCost = 60;
//    public int regularCapacity;
//
//
//
//    public final long startWealth;
//    public long transferExpenses;
//    public long personalExpenses;
//    public long marketExpenses;
//    public long stadiumExpenses;
//
//    public Strategy strategy = new Strategy();
//    public ArrayList<String> coachInterface;
//    public Sponsor sponsor;
//    public int maxValueOfLoans = 5;
//    public boolean changeSponsor = false;
//
//    private Random random;
//
//
    public Team(String info) {

        String[] teamInfo = info.split("/");

        name = teamInfo[0];
        homeTown = teamInfo[1];
        stadium = new Stadium(teamInfo[2], Integer.parseInt(teamInfo[4]));

//        if(coaches.size() == 0) {coaches.add(new Manager(teamInfo[3]));}
//        Manager manager = new Manager(teamInfo[3]);

        wealth = Integer.parseInt(teamInfo[5]) * 1_000_000;
        startWealth = wealth;
//        markets = new ArrayList<>();
        coaches = new ArrayList<>();
        playerList = new ArrayList<>();
//        loans = new ArrayList<>();

//        addToSponsor();

    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public static void setLeague(League league) {
        Team.league = league;
    }

    public String getName() {
        return name;
    }

    //
//    private void addToSponsor() {
//
//        random = new Random();
//        sponsor = rfpl.sponsorList.get(random.nextInt(16));
//        wealth += sponsor.getContractBonusWage();
//        regularCapacity = capacityStad / 4;
//        System.out.println(name + " " + sponsor.getName());
//    }
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
//    @Override
//    public String toString() {
//        return "Team{" +
//                "name='" + name + '\'' +
//                ", town='" + town + '\'' +
//                ", stadium=" + stadium +
//                ", games=" + games +
//                ", wins=" + wins +
//                ", draws=" + draws +
//                ", defeats=" + defeats +
//                ", goalScored=" + goalScored +
//                ", goalMissed=" + goalMissed +
//                ", teamPower=" + teamPower +
//                ", capacityStad=" + capacityStad +
//                ", temporaryTicketCost=" + temporaryTicketCost +
//                ", regularCapacity=" + regularCapacity +
//                ", coaches=" + coaches +
//                ", loans=" + loans +
//                ", wealth=" + wealth +
//                ", startWealth=" + startWealth +
//                ", transferExpenses=" + transferExpenses +
//                ", personalExpenses=" + personalExpenses +
//                ", marketExpenses=" + marketExpenses +
//                ", stadiumExpenses=" + stadiumExpenses +
//                ", playerList=" + playerList +
//                ", strategy=" + strategy +
//                ", coachInterface=" + coachInterface +
//                ", sponsor=" + sponsor +
//                ", maxValueOfLoans=" + maxValueOfLoans +
//                ", changeSponsor=" + changeSponsor +
//                ", rfpl=" + rfpl +
//                ", random=" + random +
//                ", markets=" + markets +
//                '}';
//    }
}
