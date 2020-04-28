package org.example;

public class Accordion extends Instrument implements Keyboard {

    Accordion(float price) {
        super(price);
    }

    private final boolean IS_TORN = true;

    void murka(String words) throws NoVodkaException {
        if (!words.toLowerCase().contains("vodk")) throw new NoVodkaException("Murka can't exist without vodka");
        System.out.println("Marusya milaya " + words);
    }

    void tear_apart() {System.out.println(IS_TORN);}

    public void sound() {
        System.out.println("Mikhuil Mavashi");
    }

    private String secret = "There is no spoon... neither vodka";

    public boolean keyboard() {
        return true;
    }

    public void getSecret() {
        System.out.println(secret);
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
