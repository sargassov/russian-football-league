package org.sargassov.example.new_game_creator.unpackers;

import org.sargassov.example.models.League;
import org.sargassov.example.models.Team;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TeamUnpack extends Unpacker{
    private static final String clubsFile = "src\\main\\resources\\sources\\clubs.txt";

    public TeamUnpack() {
        super(clubsFile);
    }

    @Override
    public void read() {

        dataList.forEach(s -> league.addToTeamList(new Team(s)));
        league.getTeamList().forEach(Team::selectSponsor);
        teamListSortByAlphabet();

        //============================================================//
        System.out.println("teamList size = " + league.getTeamList().size());
        //============================================================//
    }

    private void teamListSortByAlphabet() {
        league.setTeamList(league.getTeamList().stream()
                .sorted(Comparator.comparing(Team::getName))
                .collect(Collectors.toList()));
    }
}
