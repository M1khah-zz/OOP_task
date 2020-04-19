package org.example;

public class Accordion extends Instrument implements Keyboard {

    Accordion(float price) {
        super(price);
    }

    public void sound() {
        System.out.println("Bayan");
    }

    public boolean keyboard() {
        return true;
    }
}
