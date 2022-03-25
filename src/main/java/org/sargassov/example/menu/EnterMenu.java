package org.sargassov.example.menu;

import lombok.SneakyThrows;
import org.sargassov.example.Corrector;
import org.sargassov.example.RussianLeague;
import org.sargassov.example.coaches.Manager;
import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;
import org.sargassov.example.new_game_creator.NewGameCreator;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.WelcomeView;

import java.util.Scanner;

public class EnterMenu extends Menu{

    private static final String enterViewAddress = "src\\main\\resources\\views\\enter_view.txt";
    private static League league;

    public EnterMenu() {
        menuAddress = enterViewAddress;
        view = new EnterView(menuAddress);
        minimal = 1;
        maximal = 16;
    }

    public EnterMenu init(League league){
        EnterMenu.league = league;
        return this;
    }

    @SneakyThrows
    @Override
    public void start() {
        view.print();
        String name, lastName;
        name = "Mark";//Corrector.inputStringMethod();

        EnterView.setInterval(5);
        view.print();
        lastName = "Giovanni";//Corrector.inputStringMethod();
        lastName = lastName.concat(" ").concat(name);

        EnterView.setInterval(26);
        view.print();
        Team userTeam = league.getTeamList().get(5);//Corrector.inputIntMethod(minimal, maximal) - 1);
        userTeam.getCoaches().set(0, new Manager(lastName));

        league.setUserTeam(userTeam);
    }

//    public static void gameMenu(){
//        new MainMenuTable(rfpl.interfaces.get(0).fields).toPrint(rfpl);
//        int choise = Corrector.inputIntMethod(0, 9);
//        rfpl.userInterfaces.get(choise).Do(rfpl);
//    }
//
//
//    @Override
//    public void start() {
//
//    }
}
