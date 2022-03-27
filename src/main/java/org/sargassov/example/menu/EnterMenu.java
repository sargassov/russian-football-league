package org.sargassov.example.menu;

import lombok.SneakyThrows;
import org.sargassov.example.Game;
import org.sargassov.example.coaches.Manager;
import org.sargassov.example.menu.main_menu.MenuInterface;
import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;
import org.sargassov.example.views.EnterView;

public class EnterMenu extends Menu implements MenuInterface {

    private static final String enterViewAddress = "src\\main\\resources\\views\\enter_view.txt";

    public EnterMenu() {
        menuAddress = enterViewAddress;
        view = new EnterView(menuAddress);
        minimal = 1;
        maximal = 16;
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
        Game.setUserName(lastName);

        EnterView.setInterval(26);
        view.print();
        Team userTeam = league.getTeamList().get(2);//Corrector.inputIntMethod(minimal, maximal) - 1);
        userTeam.getCoaches().set(0, new Manager(lastName));
        setUserTeam(userTeam);
        league.setUserTeam(userTeam);
    }
}
