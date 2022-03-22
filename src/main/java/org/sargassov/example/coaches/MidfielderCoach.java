package org.sargassov.example.coaches;


import org.sargassov.example.models.Coach;
import org.sargassov.example.models.players.Position;

public class MidfielderCoach extends Coach {
    public MidfielderCoach(String name){
        coachPos = Position.MIDFIELDER;
        this.name = name;
    }
}
