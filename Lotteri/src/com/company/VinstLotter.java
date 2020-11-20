package com.company;

import java.util.ArrayList;
import java.util.Random;

public class VinstLotter {
    ArrayList<VinstLott> vinstLotter;
    Random rand;

    /**
     * Initialiserar com.company.VinstLotter
     */
    public VinstLotter() {
        vinstLotter = new ArrayList<>();
        rand = new Random();
    }

    /**
     * Skapar en ny slumpad lott.
     * @return Det nya lottnummret.
     */
    public int fåLott() {
        return Math.abs(rand.nextInt());
    }

    /**
     * Söker efter en vinstlott.
     * @param söklott Lottnummret att söka efter.
     * @return Vinsten som är kopplad med lottnummret, annars tom sträng.
     */
    public String hitta(int söklott) {
        for (VinstLott v : vinstLotter) {
            if(v.nr == söklott) {
                return v.vinst;
            }
        }
        return "";
    }

    /**
     * Skapar en ny vinstlott
     * @param lottNummer Lottnummret som ska associeras med vinsten
     * @param vinst Vinsten som ska associeras med lottnummret
     */
    public void skapaVinstLott(int lottNummer, String vinst) {
        VinstLott vinstLott = new VinstLott(lottNummer, vinst);
        vinstLotter.add(vinstLott);
    }
}
