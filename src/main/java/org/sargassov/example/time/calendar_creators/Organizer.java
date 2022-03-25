package org.sargassov.example.time.calendar_creators;

import org.sargassov.example.models.Team;
import org.sargassov.example.time.days.Day;
import org.sargassov.example.time.days.DayMatch;
import org.sargassov.example.time.days.Tour;
import org.sargassov.example.time.interfaces.TeamSheduler;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Organizer implements Cloneable {
    private final TeamSheduler teamSheduler;

    private List<List<Day>> calendar;
    private List<List<Shedule>> shedulerList;
    private List<Draw> drawList;
    private List<Tour> allTourDates;

    private int leagueTeamsSize;
    private int toursSum;
    private int mathcesInToursSum;

    public Organizer(TeamSheduler teamSheduler, List<List<Day>> calendar, List<Draw> drawList) {
        this.calendar = calendar;
        this.drawList = drawList;
        this.teamSheduler = teamSheduler;
        this.shedulerList = teamSheduler.getSheduler();
        leagueTeamsSize = teamSheduler.getLeagueTeamSize();
        toursSum = teamSheduler.getTours();
        mathcesInToursSum = teamSheduler.getMatchesInTour();

    }

    public void organizeCalendar(){
        tourFactory();
        matchesInToursFactory();
        setMatchesInCalendar();
    }

    private void setMatchesInCalendar() {
        for(int month = 0, tour = 0; month < calendar.size(); month++){
            for(int day = 0; day < calendar.get(month).size(); day++){
                if(calendar.get(month).get(day).equals(allTourDates.get(tour))){
                    calendar.get(month).set(day, allTourDates.get(tour++).clone());
                }
            }
        }

        for(int x = 0, z = 0; x < calendar.size(); x++){
            for(int y = 0; y < calendar.get(x).size(); y++){
                System.out.println(calendar.get(x).get(y).getClass().getName() + " ");
                System.out.print(calendar.get(x).get(y).getDate().get(Calendar.DAY_OF_MONTH)
                        + " " + calendar.get(x).get(y).getDate().get(Calendar.MONTH)
                        + " " + calendar.get(x).get(y).getDate().get(Calendar.YEAR) + " ");
                if(calendar.get(x).get(y).equals(allTourDates.get(z)) && calendar.get(x).get(y) instanceof Tour){
                    for(int a = 0; a < ((Tour) calendar.get(x).get(y)).getMatches().size(); a++){
                        Tour tour = (Tour) calendar.get(x).get(y);
                        System.out.println(tour.getMatches().get(a).getHome().getName() + " " +
                                tour.getMatches().get(a).getAway().getName());
                    }
                    z++;
                }
            }
        }
    }

    private void matchesInToursFactory() {

        for(int tour = 0; tour < shedulerList.size(); tour++){
            ArrayList<DayMatch> dayMatchList = new ArrayList<>();
            for(int match = 0; match < mathcesInToursSum; match++){

                DayMatch dayMatch = new DayMatch(allTourDates.get(tour).getDate());
                dayMatch = (DayMatch) dayMatch.clone();
                dayMatch.setHome(encrypt(shedulerList.get(tour).get(match).getHomeTeamNum()));
                dayMatch.setStadium(dayMatch.getHome().getStadium());
                dayMatch.setAway(encrypt(shedulerList.get(tour).get(match).getVisitorTeamNum()));
                dayMatch.setLeague(dayMatch.getHome().getLeague());
                dayMatchList.add(dayMatch);
            }
            allTourDates.get(tour).getMatches().addAll(dayMatchList);
        }
    }




    private Team encrypt(String teamNum) {
        int num = Integer.parseInt(teamNum);
        return drawList.stream().filter(d -> d.getPlaceOfLot() == num)
                .map(dr -> dr.getNameOfTeam()).findFirst().get();
    }


    private void tourFactory() {
        GregorianCalendar dateOfCurrentTour = new GregorianCalendar(2019, 7, 3);
        allTourDates = new ArrayList<>();

        for (int count = 0; count < toursSum; count++){
            Tour tour = new Tour(dateOfCurrentTour);
            tour = tour.clone();

            if(count % 2 == 1)dateOfCurrentTour.add(Calendar.DAY_OF_MONTH, 7);
            else dateOfCurrentTour.add(Calendar.DAY_OF_MONTH, 14);

            allTourDates.add(tour);
        }

//        for(int x = 0; x < toursSum; x++){
//            System.out.println(allTourDates.get(x).getDate().get(Calendar.DAY_OF_MONTH)
//                        + " " + allTourDates.get(x).getDate().get(Calendar.MONTH)
//                        + " " + allTourDates.get(x).getDate().get(Calendar.YEAR));
//
//        }
    }

    public List<Tour> getAllTourDates() {
        return allTourDates;
    }

    public List<List<Day>> getCalendar() {
        return calendar;
    }
}
