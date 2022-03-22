package org.sargassov.example.menu;

import org.sargassov.example.views.View;
import org.sargassov.example.views.WelcomeView;

import java.util.Scanner;

public abstract class Menu {
    protected static String menuAddress;
    protected static View view;
    public abstract void start();
    protected Scanner scanner;
    protected int minimal;
    protected int maximal;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }
}
