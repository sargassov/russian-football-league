package org.sargassov.example.tables.team_menu_tables;

import org.sargassov.example.tables.Table;

public class PlayerViewTableSecond extends Table {
    private static final String playerViewTable2 = "src\\main\\resources\\tables\\player_view_table_2.txt";

    public PlayerViewTableSecond() {
        super(playerViewTable2);
    }

    @Override
    public void read() {
        dataList.forEach(System.out::println);
    }
}
