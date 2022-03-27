package org.sargassov.example.menu.main_menu;

import lombok.SneakyThrows;
import org.sargassov.example.RussianLeague;
import org.sargassov.example.menu.Menu;
import org.sargassov.example.menu.ToPreviousMenu;
import org.sargassov.example.menu.train_menu.CoachesMenu;
import org.sargassov.example.menu.train_menu.TrainingBalance;
import org.sargassov.example.menu.train_menu.TrainingProgram;
import org.sargassov.example.menu.transfer_menu.BuyingPlayer;
import org.sargassov.example.menu.transfer_menu.SellPlayer;
import org.sargassov.example.models.League;
import org.sargassov.example.new_game_creator.NewGameCreator;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

import java.util.ArrayList;
import java.util.List;

public class TransferMenu extends Menu implements MenuInterface {
    private static final String transferMenuViewAddress = "src\\main\\resources\\main_menu_screens\\transfer_interface.txt";
//    private static League league;

    public TransferMenu() {
        menuAddress = transferMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 2;

        menu = new ArrayList<>(List.of(
                new ToPreviousMenu(this),
                new BuyingPlayer(),
                new SellPlayer()
        ));
    }

    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();

    }
}
