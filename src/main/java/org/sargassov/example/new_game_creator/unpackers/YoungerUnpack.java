package org.sargassov.example.new_game_creator.unpackers;

import org.sargassov.example.models.League;
import org.sargassov.example.models.players.Player;

public class YoungerUnpack extends Unpacker{
    private static final String youngersFile = "src\\main\\resources\\sources\\youthacademy.txt";

    protected YoungerUnpack() {
        super(youngersFile);
    }

    @Override
    public void readAndUnpack() {
        dataList.forEach(s -> League.getYouthPool().add(new Player(s, 0)));
        System.out.println("youthPool = " + League.getYouthPool().size());
    }
}
