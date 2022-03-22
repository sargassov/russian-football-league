package org.sargassov.example.views;

import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class View {
    protected String filePath;
    protected List<String> viewList;

    @SneakyThrows
    protected View(String string){
        this.filePath = string;
        Path path = Paths.get(filePath);


        if(!Files.exists(path))
            throw new NullPointerException("Empty argument in construcnor " + this.getClass().getName());

        viewList = Files.readAllLines(path, StandardCharsets.UTF_8);
    }

    public abstract void print();
}
