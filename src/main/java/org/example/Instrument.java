package org.example;

import static java.lang.System.out;

public abstract class Instrument {
    private Color color;
    private float price;
    private byte inCount = 100;

    public void getInCount() {
        out.println(inCount);
    }

    public abstract void sound();

    Instrument(float price) {
        setPrice(price);
    }

    void getPrice() {
         out.println(price);;
    }

    void getColor() {
        out.println(color);
    }

    void setPrice(float price) {
        this.price = price;
    }

    void setColor(Color color) {
        this.color = color;
    }

    void sell(String price) {
        try {
            out.println("You can sell this instrument for " + price);
            inCount--;
        } catch (Exception e) {
            e.printStackTrace();
            out.println("Sorry, customer is out of money!");
        }
    }

    public void play(boolean isBroken) throws InstrumentIsBrokenException {
        if (isBroken) {
            throw new InstrumentIsBrokenException("Your instrument is broken - you can't play on it");
        }
        out.println("Adagio");
    }

    static String reason = "To impress somebody";

    protected void forWhat() {
        out.println(reason);
    }

    static void changeReason(){ reason = "To endure or perish";}


}
