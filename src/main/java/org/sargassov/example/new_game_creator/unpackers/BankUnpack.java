package org.sargassov.example.new_game_creator.unpackers;


import org.sargassov.example.finance.Bank;
import org.sargassov.example.models.League;

public class BankUnpack extends Unpacker{
    private static final String banksFile = "src\\main\\resources\\sources\\banks.txt";

    public BankUnpack() {
        super(banksFile);
    }

    @Override
    public void read() {
        dataList.forEach(s -> league.addToBankList(new Bank(s)));
        //============================================================//
        System.out.println("banks = " + league.getBanks().size());
        //============================================================//
    }
}
