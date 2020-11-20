package com.company;

public class VinstLott {
    int nr;
    String vinst;

    /**
     * Skapar en ny com.company.VinstLott objekt
     * @param lottnummer Lottnummret av vinstlotten
     * @param vinst Vinsten av vinstlotten
     */
    public VinstLott(int lottnummer, String vinst) {
        nr = lottnummer;
        this.vinst = vinst;
    }
}
