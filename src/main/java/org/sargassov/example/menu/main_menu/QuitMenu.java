package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;
import org.sargassov.example.views.EnterView;
import org.sargassov.example.views.ScreenView;

public class QuitMenu extends Menu implements MenuInterface {
    private static final String quitMenuViewAddress = "src\\main\\resources\\main_menu_screens\\game_menu_interface.txt";


    public QuitMenu() {
        menuAddress = quitMenuViewAddress;
        view = new ScreenView(menuAddress);
        minimal = 0;
        maximal = 1;
    }

    @Override
    public void start() {
        return;
//        view.print();

    }
}
