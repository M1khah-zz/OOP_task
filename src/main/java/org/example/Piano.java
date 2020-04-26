package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Piano extends Instrument implements Keyboard, Strings {

    public String manufacturer;
    public ArrayList <String> repertoire = new ArrayList<>();

    Piano(float price, String manufacturer) {
        super(price);
        this.manufacturer = manufacturer;
    }

    @Override
    public void sound() {
        System.out.println(repertoire.get(0));
    }

    public void addSong (){
        String title;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favourite song");
        title = scan.nextLine();
        repertoire.add(title);
    }

    public boolean keyboard() {
        return true;
    }

    public short strings() {
        return 230;
    }
}
