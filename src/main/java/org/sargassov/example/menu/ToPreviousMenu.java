package org.sargassov.example.menu;


import org.sargassov.example.menu.main_menu.MenuInterface;
import org.sargassov.example.menu.team_menu.TeamMenuInterface;
import org.sargassov.example.menu.train_menu.TrainingMenuInterface;

public class ToPreviousMenu implements MenuInterface {
    private Object object;

    public ToPreviousMenu(Object object) {
        this.object = object;
    }

    @Override
    public void start() {
        System.out.println("fgvhbnmk,");
        if(object instanceof TeamMenuInterface)
            new MainMenu();
        if(object instanceof TrainingMenuInterface)
            new MainMenu();
    }
//    @Override
//    public void getOption() {
//    }
}
