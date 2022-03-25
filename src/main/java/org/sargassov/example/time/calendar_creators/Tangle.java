package org.sargassov.example.time.calendar_creators;

import org.sargassov.example.models.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tangle {
    private final int randomSize;
    private List<Integer> randomNumbers;
    private List<Draw> drawList;
    private List<Team> teamList;

    public Tangle(List<Team> teamList) {
        this.teamList = teamList;
        randomNumbers = new ArrayList<>();
        randomSize = teamList.size();
        drawList = new ArrayList<>();

        prepare();
    }

    private void prepare(){
        List<Integer> dropNums = new ArrayList<>();
        for(int x = 0; x < randomSize; x++)
            dropNums.add(x);

        event(dropNums);
    }

    private void event(List<Integer> dropNums) {
        Random random = new Random();
        int x = 0;
        while (dropNums.size() != 0){
            int randomize = random.nextInt(dropNums.size());
            Draw draw = new Draw(teamList.get(x++), dropNums.get(randomize) + 1);
            drawList.add(draw);
            dropNums.remove(randomize);
        }
    }

    public List<Draw> getDrawList() {
        return drawList;
    }
}
