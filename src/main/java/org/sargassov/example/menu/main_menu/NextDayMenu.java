package org.sargassov.example.menu.main_menu;

import org.sargassov.example.menu.Menu;

public class NextDayMenu extends Menu implements MenuInterface {
    @Override
    public void start() {
        int select = showViewAndSelect();

        for(int x = 0; x < menu.size(); x++)
            if(select == x) menu.get(x).start();
    }
}
