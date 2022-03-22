package org.sargassov.example.coaches;


import org.sargassov.example.models.Coach;
import org.sargassov.example.models.players.Position;

public class ForwardCoach extends Coach {
    public ForwardCoach(String name){
        coachPos = Position.FORWARD;
        this.name = name;
    }
}
