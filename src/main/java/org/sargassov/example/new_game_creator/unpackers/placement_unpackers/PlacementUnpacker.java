package org.sargassov.example.new_game_creator.unpackers.placement_unpackers;

import org.sargassov.example.Corrector;
import org.sargassov.example.models.players.Position;
import org.sargassov.example.new_game_creator.unpackers.Unpacker;
import org.sargassov.example.strategies.Role;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class PlacementUnpacker extends Unpacker {
    protected List<Role> roleList;
    protected static final int roleValue = 18;
    protected String description;

    protected PlacementUnpacker(String string) {
        super(string);
        roleList = new ArrayList<>(roleValue);
    }

    @Override
    public void readAndUnpack() {
        int posNumber = 0;

        while (posNumber < roleValue){
            Position position = Corrector.stringInPos(dataList.get(posNumber));
            roleList.add(new Role(null, posNumber++, position));
        }
        //+++++++++++++++++++++++++++++++++++++++++++//
        System.out.println("created" + description);
        //+++++++++++++++++++++++++++++++++++++++++++//
    }

    public String getDescription() {
        return description;
    }

    public List<Role> getRoleList() {
        return roleList;
    }
}
