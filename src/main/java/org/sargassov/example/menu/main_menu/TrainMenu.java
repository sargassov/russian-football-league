package org.sargassov.example.menu.main_menu;

import org.sargassov.example.Corrector;
import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.team_menu.*;
import org.sargassov.example.menu.train_menu.CoachesMenu;
import org.sargassov.example.menu.train_menu.TrainingBalance;
import org.sargassov.example.menu.train_menu.TrainingProgram;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class TrainMenu extends Menu implements MenuInterface {
    private static final String trainMenuViewAddress = "src\\main\\resources\\main_menu_screens\\training_interface.txt";
//    private static League league;

    public TrainMenu() {
        menuAddress = trainMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 3;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new CoachesMenu(),
                new TrainingProgram(),
                new TrainingBalance()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();

    }
}
