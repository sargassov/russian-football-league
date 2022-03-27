package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.calendar_menu.PlayingCalendar;
import org.sargassov.example.menu.calendar_menu.VisualCalendar;
import org.sargassov.example.menu.transfer_menu.BuyingPlayer;
import org.sargassov.example.menu.transfer_menu.SellPlayer;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class CalendarMenu extends Menu implements MenuInterface {
    private static final String calendarMenuViewAddress = "src\\main\\resources\\main_menu_screens\\calendar_interface.txt";
//    private static League league;

    public CalendarMenu() {
        menuAddress = calendarMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 2;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new PlayingCalendar(),
                new VisualCalendar()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();

    }
}
