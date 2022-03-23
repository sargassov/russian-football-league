package org.sargassov.example.new_game_creator.unpackers;

import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;

import java.util.Comparator;
import java.util.stream.Collectors;

public class TeamUnpack extends Unpacker{
    private static final String clubsFile = "src\\main\\resources\\sources\\clubs.txt";

    protected TeamUnpack() {
        super(clubsFile);
//        Team.setLeague(league);
    }

    @Override
    public void readAndUnpack() {
        dataList.forEach(s -> League.getTeamList().add(new Team(s)));
        League.setTeamList(League.getTeamList().stream()
                .sorted(Comparator.comparing(Team::getName))
                .collect(Collectors.toList()));
        System.out.println("teamList = " + League.getTeamList().size());
    }
}
