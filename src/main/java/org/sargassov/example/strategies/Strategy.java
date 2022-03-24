package org.sargassov.example.strategies;


import org.sargassov.example.Corrector;
import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.placements.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Strategy {
    private static List<Placement> placements;
//    private static final League league;
//    private final static String[] posParams = {"Gk", "Def", "Mid", "Forw"};


    public Strategy(){
        placements = new ArrayList<>(List.of(
                new Placement(new FourFourTwoPlacementUnpacker()),
                new Placement(new FiveFourOnePlacementUnpacker()),
                new Placement(new FourFiveOnePlacementUnpacker()),
                new Placement(new ThreeFourThreePlacementUnpacker()),
                new Placement(new ThreeFiveTwoPlacementUnpacker())
        ));

        System.out.println("Strategy constructor");
        System.out.println("Placement size = " + placements.size());
    }



    public void strategyRandomizer(League league){ // выставляем каждой команде случайную расстановку
        Random random = new Random();

        league.getTeamList().forEach(team -> {
            team.setPlacement(placements.get(random.nextInt(5)));
            System.out.println("team placement = " + team.getPlacement().getDescription());
            playerRandomizer(team);
        });





//        Team[] teams = rfpl.teams;
//        for (int i = 0; i < teams.length; i++) { //для каждой из 16 команд
//            short ran = (short) (Math.random() * 5);//выбирается случайная из 5 стартегий
//            teams[i].strategy = rfpl.strategies.get(ran);//и устаналвливается как базовая
//            autoStrategyCreatorMethod(teams, i);
//
//        }
    }

    public static void playerRandomizer(Team team){

        System.out.println("Strategy constructor");
        System.out.println("Placement size = " + placements.size());

        List<Role> roleList = getFreePlacesInPlacement(team); // осатлись только не занятые позиции в расстановке
        List<Player> playerList = getFreeAndHealtyPlayers(team); // только здоровые игроки не зdнятые в текущей расстановке

        roleList.forEach(r -> {
            List<Player> suitablePlayers = playerList.stream()// подходящие игроки на конкретную позицию
                       .filter(p -> p.getPosition().equals(r.getPosition())).collect(Collectors.toList());

            Player selected = (findBest(suitablePlayers));
            selected.setFirstEleven(true);
            selected.setStrategyPlace(r.getPosNumber());

            System.out.println("num = " + r.getPosNumber() + ", pos = " + r.getPosition() + ", player = " + r.getPlayer().getName());

            team.setTeamPower(powerTeamCounter(team));
        });



//        Player selectionPlayer;
//        int y = 0;
//        for (FootballManager.strategies.ConcretStrategy concretStrategy : teams[i].strategy.concretStrategyList) {//перебирается каждая из позиций стратегии
//
//            int maxVal = 0, currentVal = 0;
//            if(findEqualStrategyPlace(y, teams[i].playerList)) continue; // если позиция занята, то пропускаем
//
//            selectionPlayer = null;
//            for (Player player : teams[i].playerList) {//перебираются все игроки команды
//
//                int[] ableParams = {player.getGkAble(), player.getDefAble(),
//                        player.getMidAble(), player.getForwAble()}; // создали массив параметров игрока
//
//                if (concretStrategy.position.equals(player.getPositions()) // если у игрока и расстановки совпадают позиции
//                        && !player.getIsInjury() && !player.isIs11Th() && player.getStrategyPlace(r.getPosNumber()) < 0) { // и игрок не травмирован
//                    for(int f = 0; f < posParams.length; f++){
//                        if(concretStrategy.position.equals(Corrector.stringInPos(posParams[f]))) {
//                            currentVal = ableParams[f];
//                            break;
//                        }
//                    }
//
//                    if (currentVal > maxVal) {
//                        selectionPlayer = player;
//                        maxVal = currentVal;
//                    }
//                }
//            }
//            if (selectionPlayer != null && !findEqualStrategyPlace(y, teams[i].playerList)) {
//                selectionPlayer.setIs11Th(true);
//                selectionPlayer.setStrategyPlace(y);
////                selectionPlayer.club.
//
//            }
//
//            y++;
//        }
    }

    private static List<Player> getFreeAndHealtyPlayers(Team team) {
        return team.getPlayerList()
                .stream().filter(p -> p.getStrategyPlace() < 0 && !p.isPlayerInjury())
                .collect(Collectors.toList());
    }

    private static List<Role> getFreePlacesInPlacement(Team team) {
        return team.getPlacement().getRoleList()
                .stream().filter(r -> r.getPlayer() == null).collect(Collectors.toList());
    }

    private static Player findBest(List<Player> suitablePlayers) { //найти лучшего по силе игрока из списка
        return (Player) suitablePlayers.stream().sorted(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.getPower() - o1.getPower();
            }
        });
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

//    private static boolean findEqualStrategyPlace(int y, ArrayList<Player> list){
//
//
//
//        for(Player player : list){
//            if(player.getStrategyPlace(r.getPosNumber()) == y)
//                return true;
//        }
//        return false;
//    }

//    public static void capitanDeterminer() {
//        int captainVal = -1;
//        for(Team team : rfpl.teams){
//            System.out.println("playerList = " + team.playerList.size());
//            Player capitan = team.playerList.get(0);
//            for (Player player : team.playerList) {
//                if(player.getCaptainAble() > captainVal){
//                    captainVal = player.getCaptainAble();
//                    capitan = player;
//                }
//            }
//            capitan.setCapitan(true);
//            captainVal = -1;
//        }
//    }
//


}
