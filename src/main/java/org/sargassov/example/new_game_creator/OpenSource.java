package org.sargassov.example.new_game_creator;


import org.sargassov.example.models.League;
import org.sargassov.example.new_game_creator.unpackers.*;

import java.util.ArrayList;
import java.util.List;

public class OpenSource {

    private final static List<Unpacker> unpackers = new ArrayList<>(List.of(
            new SponsorsUnpack(),
            new TeamUnpack(),
            new PlayerUnpack(),
            new YoungerUnpack(),
            new BankUnpack()
    ));

    public OpenSource(League league) {
        Unpacker.setLeague(league);
    }

    public void unpack(){
        unpackers.forEach(Unpacker::readAndUnpack);
    }
}
