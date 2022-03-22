package org.sargassov.example.models;

import org.sargassov.example.Corrector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Player {

//    private static Tournament rfpl;

    private String name;
    private String natio;
    private Team team;
    private String teamName;
    private Position position;
    private Integer number;
    private Integer gkAble;
    private Integer defAble;
    private Integer midAble;
    private Integer forwAble;
    private Integer power;
    private Integer captainAble;
    private Integer tire = 0;
    private Integer timeBeforeTreat;
    private Integer yearBirth;
    private Integer trainingAble;
    private Integer trainingBalance;
    private boolean isInjury = false;
    private boolean is11Th = false;
    private boolean isCapitan = false;
    private int price;
    private Integer strategyPlace = -100;
    private final static Integer youngPlayerBirthYear = 2004;

    private final double[] priceCoeff = {0.01, 1.0, 2.5, 7.0, 34.0};
    private final double[] mltpyCoeff = {0.01, 0.15, 0.45, 2.7, 6.5};
    private final double[] captainCoeff = {1.1, 1.15, 1.2, 1.25, 1.3};

    List<Position> positions;
    List<Integer> ables;

    public Player(){}

    public Player(String info) {
        toComposite(info);

        positionsAndAblesInit();
        trainingBalance = 0;
        timeBeforeTreat = 0;
        trainingAble = (int) (Math.random() * 10 + 10);
        price = priceToSell();

        power = findPower();

    }

//    public static void setRfpl(Tournament rfpl) {
//        Player.rfpl = rfpl;
//    }

    private int findPower(){
        for(int x = 0; x < positions.size(); x++) {
            if (this.position.equals(positions.get(x))) {
                return ables.get(x);
            }
        }
        return 0;
    }

    private void positionsAndAblesInit(){
        positions = Arrays.asList(Position.GOALKEEPER, Position.DEFENDER,
                Position.MIDFIELDER, Position.FORWARD);
        ables = Arrays.asList(gkAble, defAble, midAble, forwAble);
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(String name, int zero) {

        positionsAndAblesInit();
        this.name = name;
        natio = "Rus";
        position = randomPosition();
        trainingBalance = 0;
        timeBeforeTreat = 0;
        number = zero;

        youthabilities();
        price = priceToSell();
    }

    private void youthabilities() {
        captainAble = 1;

        for(int x = 0; x < positions.size(); x++){
            int temporary;
            if(x == 0){
                temporary = (int)(Math.random() * 9);
            }
            else{
                temporary = (int)(Math.random() * 15);
            }
            ables.set(x, temporary);
        }

        for(int x = 0; x < positions.size(); x++){
            if(this.position.equals(positions.get(x))){
                int currentAble = 60;
                double temp = Math.random() * 5;
                currentAble += (int) temp;
                ables.set(x, currentAble);
                power = ables.get(x);
                break;
            }
        }
        tire = 0;
        timeBeforeTreat = 0;
        yearBirth = youngPlayerBirthYear;
        trainingAble = 10 + (int)(Math.random() * 10) ;
        setNewAbles();
    }

    private void setNewAbles() {
        gkAble = ables.get(0);
        defAble = ables.get(1);
        midAble = ables.get(2);
        forwAble = ables.get(3);
    }

    private Position randomPosition() {
        int random = (int)(Math.random() * 4);
        return positions.get(random);
    }


    private void toComposite(String info) {

        String[] mass = info.split("/");

        name = mass[0];
        yearBirth = Integer.parseInt(mass[1]);
        natio = mass[2];
        teamName = mass[3];
        position = Corrector.stringInPos(mass[4]);;
        gkAble = Integer.parseInt(mass[5]);
        defAble = Integer.parseInt(mass[6]);
        midAble = Integer.parseInt(mass[7]);
        forwAble = Integer.parseInt(mass[8]);
        captainAble = Integer.parseInt(mass[10]);
        number = Integer.parseInt(mass[11]);
    }

//    private Team selectTeam(String teamName) {
//        for(Team t : rfpl.teams)
//            if(t.name.equals(teamName)){
//                return t;
//            }
//        return null;
//    }


    public Team getTeam() {
        return team;
    }

    public String getTeamName() {
        return teamName;
    }

    private int priceToSell() {
       int able;
       double techPrice = 0;

       for (int currentAble : ables) {
           able = currentAble;

           for (int i = 60, y = 0; i <= 100; i += 10, y++) {
               if(able < i && y == 0){ techPrice += (priceCoeff[y] + able * mltpyCoeff[y]); break;}
               else if (able < i) {techPrice += (priceCoeff[y] + (able - (i - 10)) * mltpyCoeff[y]); break;}
           }

       }

       for (int i = 20, y = 0; i < 70; i += 10, y++) {
           if (captainAble > i && captainAble < i + 11) techPrice *= captainCoeff[y];
       }

       if (captainAble > 70) techPrice *= 1.35;
       if (isInjury) techPrice *= 0.8;
       if (yearBirth < 1988) techPrice *= 0.8;

       return (int) (techPrice * 1_000_000);
    }

    public static Integer YouthNumberCorrector(ArrayList<Player>list){
        ArrayList<Integer> numbers = new ArrayList<>();
        int x = 1;
        while(x < 100){
            boolean marker = false;
            for(Player player : list){
                if(player.number == x){
                    marker = true;
                    break;
                }
            }
            if(!marker){
                numbers.add(x);
            }
             x++;
        }
        int num = (int) (Math.random() * numbers.size() - 1);
        num++;
        return numbers.get(num);
    }

//    public String strategyPlaceInPosition(){
//        if(strategyPlace > -1 && strategyPlace < 12)
//            return Corrector.wordToCenter(Corrector.posInString(position), 4);
//        else if(strategyPlace < 19)
//            return Corrector.wordToCenter("Sub", 4);
//        else
//            return Corrector.wordToCenter("", 4);
//    }


    public String getName() {
        return name;
    }

    public void setNewPower() {
        trainingBalance -= 100;
        power++;

        if(position.equals(Position.GOALKEEPER)) gkAble++;
        if(position.equals(Position.DEFENDER)) defAble++;
        if(position.equals(Position.MIDFIELDER)) midAble++;
        if(position.equals(Position.FORWARD)) forwAble++;

        ables = Arrays.asList(gkAble, defAble, midAble, forwAble);
        price = priceToSell();
    }
}











