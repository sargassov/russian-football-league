package org.sargassov.example.views;

public class EnterView extends View{
    private static int startWriting;
    private static int stopWriting;
    private int counter;

    public EnterView(String string) {
        super(string);
        setInterval(3);
        counter = startWriting;
    }

    public static void setInterval(int stop){
        stopWriting = stop;
    }

    @Override
    public void print() {
        while(counter <= stopWriting){
            System.out.println(viewList.get(counter++));
            startWriting = counter;
        }
    }
}
