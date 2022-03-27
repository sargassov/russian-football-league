package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.calendar_menu.PlayingCalendar;
import org.sargassov.example.menu.calendar_menu.VisualCalendar;
import org.sargassov.example.menu.finance_menu.BanksOffers;
import org.sargassov.example.menu.finance_menu.ExpensesReport;
import org.sargassov.example.menu.finance_menu.RevenueReport;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class FinanceMenu extends Menu implements MenuInterface {
    private static final String financeMenuViewAddress = "src\\main\\resources\\main_menu_screens\\finance_menu.txt";
//    private static League league;

    public FinanceMenu() {
        menuAddress = financeMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 3;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new RevenueReport(),
                new ExpensesReport(),
                new BanksOffers()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();
    }
}
