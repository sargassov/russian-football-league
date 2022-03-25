package org.sargassov.example.strategies;

import lombok.SneakyThrows;
import org.sargassov.example.new_game_creator.unpackers.placement_unpackers.PlacementUnpacker;

import java.util.ArrayList;
import java.util.List;

public class Placement {
    private String description;
    private List<Role> roleList;
    private static final int size = 18;

    @SneakyThrows
    public Placement(PlacementUnpacker placementUnpacker) {
        placementUnpacker.readAndUnpack();
        description = placementUnpacker.getDescription();
        roleList = new ArrayList<>(18);

        for(int x = 0; x < size; x++){ // тут надо подумать
            roleList.add(placementUnpacker.getRoleList().get(x).clone());
        }
    }

    public String getDescription() {
        return description;
    }

    public List<Role> getRoleList() {
        return roleList;
    }
}
