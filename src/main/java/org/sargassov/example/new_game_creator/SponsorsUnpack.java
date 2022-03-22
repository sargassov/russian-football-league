package org.sargassov.example.new_game_creator;

import org.sargassov.example.models.League;
import org.sargassov.example.models.Sponsor;


public class SponsorsUnpack extends Unpacker{
    private static final String sponsorsFile = "src\\main\\resources\\sources\\sponsors.txt";

    protected SponsorsUnpack() {
        super(sponsorsFile);
    }

    @Override
    public void readAndUnpack() {
        dataList.forEach(s -> league.getSponsorList().add(new Sponsor(s)));
    }
}
