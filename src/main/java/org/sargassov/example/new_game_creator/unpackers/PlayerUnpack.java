package org.sargassov.example.new_game_creator.unpackers;

import org.sargassov.example.models.League;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.models.Team;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayerUnpack extends Unpacker{
    private static final String playersFile = "src\\main\\resources\\sources\\players.txt";

    public PlayerUnpack() {
        super(playersFile);
    }

    @Override
    public void readAndUnpack() {

        for (String s : dataList) {

            Player player = null;
            player = new Player(s);
            String teamName = player.getTeamName();

            player.setTeam(league.getTeamList().stream()
                .filter(t -> t.getName().equals(teamName)).findFirst().get());

            player.getTeam().getPlayerList().add(player);
        }

        playerLastnameSorting();
    }

    private void playerLastnameSorting() {
        league.getTeamList().forEach(team -> {
            team.getPlayerList().sort(Comparator.comparing(Player::getName));
        });

        for (Team t : league.getTeamList()) {
            //============================================================//
            System.out.println("playerlist = " + t.getPlayerList().size());
            //============================================================//
        }
    }
}


