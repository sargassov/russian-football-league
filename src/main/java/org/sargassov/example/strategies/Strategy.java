package org.sargassov.example.strategies;


import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.new_game_creator.unpackers.placement_unpackers.*;

import java.util.*;
import java.util.stream.Collectors;

public class Strategy {
    private static List<PlacementUnpacker> placements;


    public Strategy(){
        placements = new ArrayList<>(List.of(
                new FourFourTwoPlacementUnpacker(),
                new FiveFourOnePlacementUnpacker(),
                new FourFiveOnePlacementUnpacker(),
                new ThreeFourThreePlacementUnpacker(),
                new ThreeFiveTwoPlacementUnpacker()
        ));
    }



    public void strategyRandomizer(League league){ // выставляем каждой команде случайную расстановку
        Random random = new Random();

        league.getTeamList().forEach(team -> {
            team.setPlacement(new Placement(placements.get(random.nextInt(5))));
            playerRandomizer(team);
        });
    }

    public static void playerRandomizer(Team team){

        System.out.println("player randomizer " + team.getName());
        List<Role> roleList = getFreePlacesInPlacement(team); // осатлись только не занятые позиции в расстановке
        List<Player> playerList = getHealtyPlayers(team); // только здоровые игроки не зdнятые в текущей расстановке

        roleList.forEach(role -> {
            List<Player> suitablePlayers = getSuitablePlayers(playerList, role); // подходящие игроки на конкретную позицию

            Player selected = (findBest(suitablePlayers));
            selected.setFirstEleven(true);
            selected.setStrategyPlace(role.getPosNumber());
            role.setPlayer(selected);
        });

        captainAppointment(team);
        team.setTeamPower(powerTeamCounter(team));

        System.out.println(team.getName() + " have power = " + team.getTeamPower());
    }

    private static void captainAppointment(Team team) {
        Player player = team.getPlayerList().stream().sorted(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.compare(o2.getCaptainAble(), o1.getCaptainAble());
            }
        }).limit(1).findFirst().get();

        player.setCapitan(true);
        System.out.println(player.getName());
    }

    private static List<Player> getSuitablePlayers(List<Player> playerList, Role role) {

        return playerList.stream()
                .filter(p -> p.getStrategyPlace() < 0 && p.getPosition().equals(role.getPosition()))
                .collect(Collectors.toList());

    }

    private static List<Player> getHealtyPlayers(Team team) {

        return team.getPlayerList()
                .stream().filter(p -> !(p.isPlayerInjury()))
                .collect(Collectors.toList());
    }

    private static List<Role> getFreePlacesInPlacement(Team team) {
        return team.getPlacement().getRoleList()
                .stream().filter(r -> r.getPlayer() == null).collect(Collectors.toList());
    }

    private static Player findBest(List<Player> suitablePlayers) { //найти лучшего по силе игрока из списка
        return suitablePlayers.stream().sorted((o1, o2) ->
                Integer.compare(o2.getPower(), o1.getPower()))
                .limit(1).findFirst().get();
    }

    public static int powerTeamCounter(Team team) {
        int power = 0;

        List<Player> playerList = team.getPlayerList().stream()
                .filter(p -> p.getStrategyPlace() > -1 && p.getStrategyPlace() < 11)
                .collect(Collectors.toList());

        for(Player p: playerList){
            power += p.getPower();
            if(p.isCapitan())
                power += p.getCaptainAble();
        }

        return power / 11;
    }
}
