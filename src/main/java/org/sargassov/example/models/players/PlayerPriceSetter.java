package org.sargassov.example.models.players;

import java.util.Arrays;
import java.util.List;

public class PlayerPriceSetter {

    static class TechPrice{

        double priceInDounble;

        public TechPrice(double priceInDounble) {
            this.priceInDounble = priceInDounble;
        }
    }

    private static final double[] priceCoeff = {0.01, 1.0, 2.5, 7.0, 34.0};
    private static final double[] mltpyCoeff = {0.01, 0.15, 0.45, 2.7, 6.5};
    private static final double[] captainCoeff = {1.1, 1.15, 1.2, 1.25, 1.3};
    private static List<Position> positions;
    private List<Integer> ables;
    private static PlayerPriceSetter instance;

    private PlayerPriceSetter() {}

    public static PlayerPriceSetter getInstance() {
        if(instance == null){
            instance = new PlayerPriceSetter();
            positions = Player.getPositions();
        }
        return instance;
    }

    public int createPrice(Player player){

        TechPrice techPrice = new TechPrice(0.0);

        init(player);
        priceDetermination(techPrice);
        captainValue(player, techPrice);
        yearBirthValue(player, techPrice);

        return (int) (techPrice.priceInDounble * 1_000_000);
    }

    private void yearBirthValue(Player player, TechPrice techPrice) {
        if (player.getYearBirth() < 1988) techPrice.priceInDounble *= 0.8;
    }

    private void captainValue(Player player, TechPrice techPrice) {

        for (int i = 20, y = 0; i < 70; i += 10, y++) {
            if (player.getCaptainAble() > i && player.getCaptainAble() < i + 11)
                techPrice.priceInDounble *= captainCoeff[y];
        }
        if (player.getCaptainAble() > 70) techPrice.priceInDounble *= 1.35;
    }

    private void priceDetermination(TechPrice techPrice) {

        for (int currentAble : ables) {

            for (int i = 60, y = 0; i <= 100; i += 10, y++) {
                if(currentAble < i && y == 0){
                    techPrice.priceInDounble += (priceCoeff[y] + currentAble * mltpyCoeff[y]);
                    break;
                }
                else if (currentAble < i) {
                    techPrice.priceInDounble += (priceCoeff[y] + (currentAble - (i - 10)) * mltpyCoeff[y]);
                    break;}
            }
        }
    }

    private void init(Player player){
        ables = Arrays.asList(player.getGkAble(),
                player.getDefAble(),
                player.getMidAble(),
                player.getForwAble());
    }
}
