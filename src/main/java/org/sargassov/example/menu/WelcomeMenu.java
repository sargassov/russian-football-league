package org.sargassov.example.menu;

import lombok.SneakyThrows;
import org.sargassov.example.Corrector;
import org.sargassov.example.new_game_creator.NewGameCreator;
import org.sargassov.example.views.WelcomeView;

public class WelcomeMenu extends Menu{
    private static final String welcomeViewAddress = "src\\main\\resources\\views\\welcome.txt";

    public WelcomeMenu() {
        menuAddress = welcomeViewAddress;
        view = new WelcomeView(menuAddress);
        maximal = 2;
        minimal = 0;
    }

    @SneakyThrows
    @Override
    public void start() {
        view.print();
        int select = 1;//Corrector.inputIntMethod(minimal, maximal);

        if(select == 0) System.exit(0);
        else if(select == 1) new NewGameCreator().createGame();
        //else if(select == 2)
    }
}
