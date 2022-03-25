package org.sargassov.example.time.calendar_creators;

import org.sargassov.example.models.Team;
import org.sargassov.example.models.players.Player;

import java.util.List;

public class Draw {

    private Team nameOfTeam;
    private int placeOfLot;

    public Draw(Team team, int placeOfLot){
        this.nameOfTeam = team;
        this.placeOfLot = placeOfLot;
    }

    public Team getNameOfTeam() {
        return nameOfTeam;
    }

    public int getPlaceOfLot() {
        return placeOfLot;
    }
}
