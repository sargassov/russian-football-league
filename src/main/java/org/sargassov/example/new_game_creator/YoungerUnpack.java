package org.sargassov.example.new_game_creator;

import org.sargassov.example.models.League;
import org.sargassov.example.models.players.Player;

public class YoungerUnpack extends Unpacker{
    private static final String youngersFile = "src\\main\\resources\\sources\\youthacademy.txt";

    protected YoungerUnpack() {
        super(youngersFile);
    }

    @Override
    public void readAndUnpack() {
        dataList.forEach(s -> League.getYouthPool().add(new Player(s, 0)));
        System.out.println("youthPool = " + League.getYouthPool().size());


//        if(Files.exists(path)){
//                try{
//                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    System.out.println("LINE============="+lines.size());
//                    for(String line : lines){
//                        rfpl.youthPool.add(new Player(line, 0));
//                    }
//                    phaser.arriveAndAwaitAdvance();
//                    System.out.println("LINE============="+lines.size());
//                } catch (IOException e) {
//                    System.out.println(YOUNGERS_FILE_NOT_FOUND);
//                    e.printStackTrace();
//                } finally {
//
//                }
//            }
    }
}
