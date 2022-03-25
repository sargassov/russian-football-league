package org.sargassov.example.new_game_creator.unpackers;

import org.sargassov.example.finance.Sponsor;


public class SponsorsUnpack extends Unpacker{
    private static final String sponsorsFile = "src\\main\\resources\\sources\\sponsors.txt";

    public SponsorsUnpack() {
        super(sponsorsFile);
    }

    @Override
    public void readAndUnpack() {
        dataList.forEach(s -> league.getSponsorList().add(new Sponsor(s)));
        //============================================================//
        System.out.println("sponsorList size = " + league.getSponsorList().size());
        //============================================================//
    }
}
