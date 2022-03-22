package org.sargassov.example.coaches;


import org.sargassov.example.models.Coach;
import org.sargassov.example.models.Position;

public class DefenderCoach extends Coach {
    public DefenderCoach(String name){
        coachPos = Position.DEFENDER;
        this.name = name;
    }
}
