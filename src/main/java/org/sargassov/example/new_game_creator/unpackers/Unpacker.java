package org.sargassov.example.new_game_creator.unpackers;

import lombok.SneakyThrows;
import org.sargassov.example.models.League;
import org.sargassov.example.new_game_creator.NewGameCreator;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public abstract class Unpacker{
    protected String unpackerFilePath;
    protected List<String> dataList;
    protected static League league;

    @SneakyThrows
    protected Unpacker(String string){
        this.unpackerFilePath = string;
        Path path = Paths.get(unpackerFilePath);


        if(!Files.exists(path))
            throw new NullPointerException("Can't find the file " + unpackerFilePath
                    + " in the class " + this.getClass().getName());

        dataList = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println("dataList size = " + dataList.size());
    }

    public abstract void read();

    public static void setLeague(League league) {
        Unpacker.league = league;
    }
}
