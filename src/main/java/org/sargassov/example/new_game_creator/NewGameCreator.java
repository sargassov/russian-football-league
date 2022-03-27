package org.sargassov.example.new_game_creator;


import org.sargassov.example.menu.EnterMenu;
import org.sargassov.example.menu.MainMenu;
import org.sargassov.example.models.League;
import org.sargassov.example.models.YouthAcademy;
import org.sargassov.example.strategies.Strategy;
import org.sargassov.example.time.calendar_creators.FootballCalendar;

public class NewGameCreator{
    public League league;

    public NewGameCreator(League league){
        this.league = league;
    }


    public void createGame(){
        new OpenSource(league).unpack();
        new Strategy().strategyRandomizer(league);

        new EnterMenu().start();
        YouthAcademy.youthAcademyRecruitment(league);
        FootballCalendar.calendarCreator(league);
        new MainMenu().start();
//        FootballCalendar.editCalendar();
//        Interface.createInterfaces(rfpl);
//        Interface.readCoachInterface();
//
//
//        MenuClass.gameMenu();
    }
}
