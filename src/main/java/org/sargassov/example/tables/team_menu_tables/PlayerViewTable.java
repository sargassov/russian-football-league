package org.sargassov.example.tables.team_menu_tables;


import org.sargassov.example.Corrector;
import org.sargassov.example.Game;
import org.sargassov.example.models.Team;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.tables.Table;

import java.util.ArrayList;

public class PlayerViewTable extends Table {
    private static final String playerViewTable = "src\\main\\resources\\tables\\player_view_table.txt";

    public PlayerViewTable() {
        super(playerViewTable);
    }

    @Override
    public void read() {
        Team userTeam = Game.getUserTeam();

        for(int x = 0; x < dataList.size(); x++){
            String[] mass = dataList.get(x).split("/");
            if(x == 1) mass[1] = Corrector.wordToCenter("P L A Y E R S  " +
                        " O F  " + userTeam.getName().toUpperCase(), mass[1].length());

            else if(x == 5)
                playerSubstitution(mass, userTeam, x);

            else {
                dataList.set(x, Corrector.stringStapler(mass));
                System.out.println(dataList.get(x));
            }
        }
        System.out.println("COMMANDS:\nMenu - \"1\"\nQuit to back menu - \"0\": ");
    }

    private void playerSubstitution(String[] mass, Team userTeam, int x) {

        for(int count = 0; count < userTeam.getPlayerList().size(); count++){

            Player pl = userTeam.getPlayerList().get(count);
            Object[] compareObj = {count + 1, pl.getName(), pl.getTeam().getName(),
                    pl.getNumber(), pl.getNatio(), Corrector.posInString(pl.getPosition()),
                    pl.getGkAble(), pl.getDefAble(), pl.getMidAble(), pl.getForwAble(),
                    pl.getCaptainAble(), pl.isPlayerInjury(), pl.getTrainingAble(), pl.getYearBirth(),
                    pl.getStrategyPlace(), pl.getPower(), pl.getTire(), pl.getTimeBeforeTreat(), pl.getPrice()};

            for(int y = 0; y < 19; y++){
                ableSubstitution(pl, compareObj, mass, y);
            }

            dataList.set(x, Corrector.stringStapler(mass));
            System.out.println(dataList.get(x));
        }
    }

    private void ableSubstitution(Player pl, Object[]compareObj, String[] mass, int y) {
        if(y == 1 || y == 2 || y == 4 || y == 5)
            mass[y + 1] = Corrector.wordToCenter((String) compareObj[y], mass[y + 1].length());

        else if(y == 11)
            booleanIntoTable(compareObj[y], mass, y);

        else if(y == 14)
            mass[y + 1] = pl.strategyPlaceInPosition();

        else if(y == 18)
            mass[y + 1] = Corrector.wordToCenter("" + Corrector.priceInMillion((int)compareObj[y]), mass[y + 1].length());

        else
            mass[y + 1] = Corrector.wordToCenter("" + (int)compareObj[y], mass[y + 1].length());
    }

    private void booleanIntoTable(Object obj, String[] mass, int y) {
        if((boolean) obj){
            mass[y + 1] = Corrector.wordToCenter("Yes", mass[y + 1].length());
        }
        else {
            mass[y + 1] = Corrector.wordToCenter("No", mass[y + 1].length());
        }
    }
}
