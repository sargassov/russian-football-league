package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.cheat_code_menu.RealiseCheatCodeOption;
import org.sargassov.example.menu.league_menu.LeagueTable;
import org.sargassov.example.menu.league_menu.ResultsTable;
import org.sargassov.example.menu.league_menu.ViewAllPlayers;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class CheatCodeMenu extends Menu implements MenuInterface {
    private static final String ceatCodeMenuViewAddress = "src\\main\\resources\\main_menu_screens\\cheat_code_interface.txt";
//    private static League league;

    public CheatCodeMenu() {
        menuAddress = ceatCodeMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 1;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new RealiseCheatCodeOption()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();
    }
}
