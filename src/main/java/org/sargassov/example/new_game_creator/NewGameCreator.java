package org.sargassov.example.new_game_creator;


import org.sargassov.example.models.League;
import org.springframework.beans.factory.annotation.Autowired;

public class NewGameCreator {

    private final League league;

    public NewGameCreator(){
        league = League.getInstance();
    }




    public void createGame(){

        new OpenSource().unpack();

//        Strategy.strategyCreator(rfpl);
//        Strategy.autoStrategyCreator();
//        Strategy.capitanDeterminer();
//        Strategy.powerTeamCounter();
//        MenuClass.newGameMenu(rfpl);
//        YouthAcademy.youthAcademyPlayersAdd(rfpl);
//        FootballCalendar.sheduleCreator(rfpl);
//        FootballCalendar.editCalendar();
//        Interface.createInterfaces(rfpl);
//        Interface.readCoachInterface();
//
//
//        MenuClass.gameMenu();
    }
}
