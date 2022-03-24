package org.sargassov.example.models;


import org.sargassov.example.coaches.CoachProgram;
import org.sargassov.example.coaches.LevelOfCoach;
import org.sargassov.example.coaches.Manager;
import org.sargassov.example.models.players.Player;
import org.sargassov.example.models.players.Position;

public class Coach extends Manager {
    protected String name;
    protected CoachProgram currentCoachProgram;
    private League league;

    protected Player playerOnTrain;
    protected Position coachPosition;
    protected LevelOfCoach levelOfCoach;

    public Coach(Position position){
        super("");
        coachPosition = position;
        currentCoachProgram = CoachProgram.STANDART;
    }

    public CoachProgram getCurrentCoachProgram() {
        return currentCoachProgram;
    }

    public void setCurrentCoachProgram(CoachProgram currentCoachProgram) {
        this.currentCoachProgram = currentCoachProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayerOnTrain() {
        return playerOnTrain;
    }

    public void setPlayerOnTrain(Player playerOnTrain) {
        this.playerOnTrain = playerOnTrain;
    }

    public Position getCoachPos() {
        return coachPosition;
    }

    public void setCoachPos(Position coachPos) {
        this.coachPosition = coachPos;
    }

    public LevelOfCoach getLevelOfCoach() {
        return levelOfCoach;
    }

    public void setLevelOfCoach(LevelOfCoach levelOfCoach) {
        this.levelOfCoach = levelOfCoach;
    }
}
