package org.sargassov.example.new_game_creator;

import org.sargassov.example.models.Player;
import org.sargassov.example.models.Team;

import java.util.Comparator;

public class PlayerUnpack extends Unpacker{
    private static final String playersFile = "src\\main\\resources\\sources\\players.txt";

    protected PlayerUnpack() {
        super(playersFile);
    }

    @Override
    public void readAndUnpack() {
        Player player = null;
        for (String s : dataList) { player = new Player(s);}

        String s = player.getTeamName();

        player.setTeam(league.getTeamList().stream()
                .filter(t -> t.getName().equals(s)).findFirst().get());

        playerLastnameSorting();
        for (Team t : league.getTeamList()) {  for (Player p : t.getPlayerList()) System.out.println(p.getName() + " " + p.getTeam());
        }

        System.out.println(player.getName() + " " + player.getTeam());
    }

    private void playerLastnameSorting() {
        league.getTeamList().forEach(team -> {
            team.getPlayerList().sort(Comparator.comparing(Player::getName));
        });
    }


//                        Player player = new Player(line);
//                        for(Team t : rfpl.teams){
//                            if(t.name.equals(player.team.name)){
//                                t.playerList.add(player);
//                                break;
//                            }
//                        }
//                    }
//
//                    for(Team t : rfpl.teams){
//                        t.playerList.sort(Comparator.comparing(o -> o.name));
//                    }
}

