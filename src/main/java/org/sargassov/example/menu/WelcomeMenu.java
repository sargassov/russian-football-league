package org.sargassov.example.menu;

import lombok.SneakyThrows;
import org.sargassov.example.Game;
import org.sargassov.example.RussianLeague;
import org.sargassov.example.menu.main_menu.MenuInterface;
import org.sargassov.example.models.League;
import org.sargassov.example.new_game_creator.NewGameCreator;
import org.sargassov.example.views.ScreenView;

public class WelcomeMenu extends Menu implements MenuInterface {
    private static final String welcomeViewAddress = "src\\main\\resources\\views\\welcome.txt";

    public WelcomeMenu() {
        menuAddress = welcomeViewAddress;
        view = new ScreenView(menuAddress);
        maximal = 2;
        minimal = 0;
    }

    @SneakyThrows
    @Override
    public void start() {
        view.print();
        int select = 1;//Corrector.inputIntMethod(minimal, maximal);

        if(select == 0) System.exit(0);
        else if(select == 1) {
            League league = new RussianLeague();
            Game.setLeague(league);
            new NewGameCreator(league).createGame();
        }
        //else if(select == 2)
    }
}
