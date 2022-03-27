package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.finance_menu.BanksOffers;
import org.sargassov.example.menu.finance_menu.ExpensesReport;
import org.sargassov.example.menu.finance_menu.RevenueReport;
import org.sargassov.example.menu.stadium_menu.*;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class StadiumMenu extends Menu implements MenuInterface {
    private static final String stadiumMenuViewAddress = "src\\main\\resources\\main_menu_screens\\stadium_interface.txt";
//    private static League league;

    public StadiumMenu() {
        menuAddress = stadiumMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 5;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new InfoOption(),
                new SetTicketCostOption(),
                new SplitSectorsOption(),
                new MarketOption(),
                new BuildSittingPlaceOption()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();
    }
}
