package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.league_menu.LeagueTable;
import org.sargassov.example.menu.league_menu.ResultsTable;
import org.sargassov.example.menu.league_menu.ViewAllPlayers;
import org.sargassov.example.menu.stadium_menu.*;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class LeagueMenu extends Menu implements MenuInterface {
    private static final String leagueMenuViewAddress = "src\\main\\resources\\main_menu_screens\\league_interface.txt";
//    private static League league;

    public LeagueMenu() {
        menuAddress = leagueMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 3;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new LeagueTable(),
                new ResultsTable(),
                new ViewAllPlayers()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();
    }
}
