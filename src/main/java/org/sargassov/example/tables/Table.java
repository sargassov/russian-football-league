package org.sargassov.example.tables;

import org.sargassov.example.new_game_creator.unpackers.Unpacker;

public abstract class Table extends Unpacker {
    protected Table(String string) {
        super(string);
    }


    public abstract void read();
}
