package org.example;

public class Violin extends Instrument implements Strings {

    Violin(float price) {
        super(price);
    }

    @Override
    public void sound() {
        System.out.println("Vivaldi, Summer");
    }

    @Override
    public short strings() {
        return 4;
    }
}
