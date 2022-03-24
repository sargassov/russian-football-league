package org.sargassov.example.new_game_creator;


import org.sargassov.example.RussianLeague;
import org.sargassov.example.models.League;
import org.sargassov.example.strategies.Strategy;

public class NewGameCreator{
    public League league;

    public NewGameCreator(League league){
        this.league = league;
    }


    public void createGame(){
        new OpenSource(league).unpack();
        new Strategy().strategyRandomizer(league);

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
