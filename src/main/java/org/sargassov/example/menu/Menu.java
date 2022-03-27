package org.sargassov.example.menu;

import org.sargassov.example.Corrector;
import org.sargassov.example.Game;
import org.sargassov.example.menu.main_menu.MenuInterface;
import org.sargassov.example.views.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Menu extends Game {

    protected List<MenuInterface> menu;

    protected String menuAddress;
    protected View view;
    protected Scanner scanner;
    protected int minimal;
    protected int maximal;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public int showViewAndSelect(){
        view.print();
        return Corrector.inputIntMethod(minimal, maximal);
    }
}
