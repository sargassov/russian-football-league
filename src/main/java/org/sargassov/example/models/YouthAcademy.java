package org.sargassov.example.models;

import org.sargassov.example.models.players.Player;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class YouthAcademy {

    public static void youthAcademyRecruitment(League league) {
        league.getTeamList().stream()
                .forEach(YouthAcademy::fantasyDraft);
    }

    private static void fantasyDraft(Team team) {
        System.out.println("fantasty draft = " + team.getName());
        List<Player> playerList = team.getLeague().getYouthPool();

        Player.getPositions().forEach(pos -> {
            List<Player> selectedList = playerList.stream()
                    .filter(player -> player.getPosition().equals(pos))
                    .limit(2).collect(Collectors.toList());

            playerInvitation(selectedList, team);
        });
    }

    private static void playerInvitation(List<Player> selectedList, Team team) {
        List<Player> youthPool = team.getLeague().getYouthPool();

        for(Player p : selectedList){
            youthPool.remove(p);
            team.addToPlayerList(p);
        }
        System.out.println("team " + team.getName() + " playerList size = " + team.getPlayerList().size());
    }
}
