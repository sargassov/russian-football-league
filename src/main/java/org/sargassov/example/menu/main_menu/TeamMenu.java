package org.sargassov.example.menu.main_menu;

import org.sargassov.example.Corrector;
import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.team_menu.*;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class TeamMenu extends Menu implements MenuInterface {
    private static final String teamMenuViewAddress = "src\\main\\resources\\main_menu_screens\\team_interface.txt";
//    private static League league;

    public TeamMenu() {
        menuAddress = teamMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 5;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new PlayerView(),
                new TeamTactic(),
                new CaptainSelection(),
                new PlayerEditor(),
                new Academy()
        ));


    }

    @Override
    public void start() {

        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();
            

    }
}
