package org.sargassov.example.coaches;


import org.sargassov.example.models.Coach;
import org.sargassov.example.models.players.Position;

public class GoalkeeperCoach extends Coach {
    public  GoalkeeperCoach(String name){
        coachPos = Position.GOALKEEPER;
        this.name = name;
    }
}
