package org.sargassov.example.views;
import org.sargassov.example.views.View;

import static java.lang.System.out;

public class ScreenView extends View {
    public ScreenView(String string) {
        super(string);
    }

    @Override
    public void print() {
        viewList.forEach(out::println);
    }

}
