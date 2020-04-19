package org.example;

public class Accordion extends Instrument implements Keyboard {


    Accordion(float price) {
        super(price);
    }

    public final boolean isTorn = true;

    public void tear_apart() {System.out.println(isTorn);}

    public void sound() {
        System.out.println("Mikhuil Mavashi");
    }

    public boolean keyboard() {
        return true;
    }
}
