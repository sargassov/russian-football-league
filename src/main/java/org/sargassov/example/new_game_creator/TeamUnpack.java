package org.sargassov.example.new_game_creator;

import org.sargassov.example.models.Sponsor;
import org.sargassov.example.models.Team;

import javax.swing.text.TabExpander;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TeamUnpack extends Unpacker{
    private static final String clubsFile = "src\\main\\resources\\sources\\clubs.txt";

    protected TeamUnpack() {
        super(clubsFile);
        Team.setLeague(league);
    }

    @Override
    public void readAndUnpack() {
        dataList.forEach(s -> league.getTeamList().add(new Team(s)));
        league.setTeamList(league.getTeamList().stream()
                .sorted(Comparator.comparing(Team::getName))
                .collect(Collectors.toList()));
    }
}
