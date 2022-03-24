package org.sargassov.example.strategies;

import org.sargassov.example.models.players.Player;
import org.sargassov.example.models.players.Position;

public class Role implements Cloneable{
    private Player player;
    private int posNumber;
    private Position position;


    public Role(Player player, int posNumber, Position position) {
        this.player = player;
        this.posNumber = posNumber;
        this.position = position;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getPosNumber() {
        return posNumber;
    }

    public void setPosNumber(int posNumber) {
        this.posNumber = posNumber;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    protected Role clone() throws CloneNotSupportedException {
        Role role = (Role)super.clone();
        try{
            role.player = player.clone();
        } catch (NullPointerException e){}

        role.position = position;
        role.posNumber = posNumber;

        return role;
    }
}

