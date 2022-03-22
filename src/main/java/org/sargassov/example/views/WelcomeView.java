package org.sargassov.example.views;
import org.sargassov.example.views.View;

import static java.lang.System.out;

public class WelcomeView extends View {
    public WelcomeView(String string) {
        super(string);
    }

    @Override
    public void print() {
        viewList.forEach(out::println);
    }

}
