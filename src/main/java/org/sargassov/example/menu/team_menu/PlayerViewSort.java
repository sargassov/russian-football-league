package org.sargassov.example.menu.team_menu;

import org.sargassov.example.Game;
import org.sargassov.example.models.Team;
import org.sargassov.example.models.players.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerViewSort {
    private List<Player> playerList;

    public PlayerViewSort() {
        playerList = Game.getUserTeam().getPlayerList();
    }

    private static List<Comparator<Player>> comparators = new ArrayList<>(List.of(
            Comparator.comparing(Player::getName),
            Comparator.comparing(Player::getNatio),
            Comparator.comparing(Player::getNumber),
            Comparator.comparing(o -> o.getPosition().toString()),
            Comparator.comparing(Player::getGkAble, Comparator.reverseOrder()),
            Comparator.comparing(Player::getDefAble, Comparator.reverseOrder()),
            Comparator.comparing(Player::getMidAble, Comparator.reverseOrder()),
            Comparator.comparing(Player::getForwAble, Comparator.reverseOrder()),
            Comparator.comparing(Player::getCaptainAble, Comparator.reverseOrder()),
            Comparator.comparing(Player::isPlayerInjury),
            Comparator.comparing(Player::getTrainingAble, Comparator.reverseOrder()),
            Comparator.comparing(Player::getYearBirth),
            Comparator.comparing(Player::getStrategyPlace, Comparator.reverseOrder()),//есть баг с этим компаратором
            Comparator.comparing(Player::getPower, Comparator.reverseOrder()),
            Comparator.comparing(Player::getTire),
            Comparator.comparing(Player::getTimeBeforeTreat),
            Comparator.comparing(Player::getPrice, Comparator.reverseOrder()),
            Comparator.comparing(o -> o.getTeam().getName())
    ));

    public void sort(int variable){
        Collections.sort(playerList, comparators.get(variable - 1));
    }
}
