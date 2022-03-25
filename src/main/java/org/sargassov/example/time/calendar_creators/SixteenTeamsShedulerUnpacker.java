package org.sargassov.example.time.calendar_creators;

import org.sargassov.example.new_game_creator.unpackers.Unpacker;
import org.sargassov.example.time.interfaces.TeamSheduler;

import java.util.ArrayList;
import java.util.List;

public class SixteenTeamsShedulerUnpacker extends Unpacker implements TeamSheduler {

    private static final String calendarFile = "src\\main\\resources\\calendars\\calendar.txt";
    private static List<List<Shedule>> sheduler;
    private static int leagueTeamSize;
    private static int tours;
    private static int matchesInTour;

    public SixteenTeamsShedulerUnpacker() {
        super(calendarFile);
        if(sheduler == null){
            sheduler = new ArrayList<>(tours);
            leagueTeamSize = 16;
            tours = 30;
            matchesInTour = 8;
        }
        readAndUnpack();
    }

    @Override
    public void readAndUnpack() {

        for(int x = 0; x < tours; x++){

            sheduler.add(new ArrayList<>(matchesInTour));
            String[] bigSplit = dataList.get(x).split("/");

            for(int y = 0; y < matchesInTour; y++){
                String[] smallSplit = bigSplit[y].split("-");
                Shedule shed = new Shedule(smallSplit[0], smallSplit[1]);

                sheduler.get(x).add(shed);
            }
        }
    }

    @Override
    public List<List<Shedule>> getSheduler() {
        return sheduler;
    }

    public int getLeagueTeamSize() {
        return leagueTeamSize;
    }

    public int getMatchesInTour() {
        return matchesInTour;
    }

    public int getTours() {
        return tours;
    }
}
