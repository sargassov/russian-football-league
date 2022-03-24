package org.sargassov.example.strategies;

import org.sargassov.example.placements.PlacementUnpacker;

import java.util.List;

public class Placement {
    private String description;
    private List<Role> roleList;

    public Placement(PlacementUnpacker placementUnpacker) {
        description = placementUnpacker.getDescription();
        roleList = placementUnpacker.getRoleList();
    }

    public String getDescription() {
        return description;
    }

    public List<Role> getRoleList() {
        return roleList;
    }
}
