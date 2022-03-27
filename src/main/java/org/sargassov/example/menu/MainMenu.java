package org.sargassov.example.menu;

import org.sargassov.example.Corrector;
import org.sargassov.example.menu.main_menu.*;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Menu implements MenuInterface{
    private static final String mainMenuViewAddress = "src\\main\\resources\\main_menu_screens\\game_menu_interface.txt";


    public MainMenu() {
        menuAddress = mainMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 9;

        menu = new ArrayList<>(List.of(
                new QuitMenu(),
                new NextDayMenu(),
                new TeamMenu(),
                new TrainMenu(),
                new TransferMenu(),
                new CalendarMenu(),
                new FinanceMenu(),
                new StadiumMenu(),
                new LeagueMenu(),
                new CheatCodeMenu()
        ));
    }

    @Override
    public void start() {
        view.print();

        int select = Corrector.inputIntMethod(minimal, maximal);

        for(int x = 0; x < menu.size(); x++){
            if(select == x) menu.get(x).start();
        }

    }
}
