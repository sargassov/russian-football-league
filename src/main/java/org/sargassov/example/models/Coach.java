package org.sargassov.example.models;


import org.sargassov.example.coaches.CoachProgram;
import org.sargassov.example.coaches.LevelOfCoach;

public class Coach {
    protected String name;
    protected CoachProgram currentCoachProgram;

//    protected Player playerOnTrain;
    protected Position coachPos;
    protected LevelOfCoach levelOfCoach;

    public Coach(){
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

//    public Player getPlayerOnTrain() {
//        return playerOnTrain;
//    }
//
//    public void setPlayerOnTrain(Player playerOnTrain) {
//        this.playerOnTrain = playerOnTrain;
//    }
//
//    public Position getCoachPos() {
//        return coachPos;
//    }
//
//    public void setCoachPos(Position coachPos) {
//        this.coachPos = coachPos;
//    }

    public LevelOfCoach getLevelOfCoach() {
        return levelOfCoach;
    }

    public void setLevelOfCoach(LevelOfCoach levelOfCoach) {
        this.levelOfCoach = levelOfCoach;
    }
}
