package com.company;

import java.util.Scanner;

public class Lotteri {

    /**
     * Skriver ut menyn och hanterar menyvalen.
     */
    public static void main(String[] args) {
        int menyVal;
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        VinstLotter vl = new VinstLotter();

        System.out.println("Hej och välkommen till Melissias com.company.Lotteri");

        /**
         * Meny
         * 1. Skapa en lott
         * 2. Sök efter en vinstlott
         * 3. Lägg till vinstlott
         * 4. Avsluta
         */
        while(running) {
            System.out.println("Meny");
            System.out.println("(1): Få en lott");
            System.out.println("(2). Sök efter en vinstlott");
            System.out.println("(3). Lägg till vinst");
            System.out.println("(4). Avsluta");
            System.out.print("Menyval: ");

            try {
                menyVal = Integer.parseInt(sc.nextLine());
            }   catch (Exception e) {
                System.out.println("Inte ett giltigt menyval!");
                continue;
            }


            switch (menyVal) {
                case 1:
                    // Skapa en lott
                    System.out.println("Här är den nya lotten");
                    System.out.println("Lottnummer: " + vl.fåLott());
                    break;
                case 2:
                    // Sök efter en vinstlott
                    System.out.print("Lottnummer: ");
                    try {
                        int söklott = Integer.parseInt(sc.nextLine());
                        String vinst = vl.hitta(söklott);
                        if(!vinst.equals("")) {
                            System.out.println("En vinstlott finns!");
                            System.out.println("Vinsten är: " + vinst);
                        } else {
                            System.out.println("Det finns ingen vinstlott med detta lottnummer");
                        }
                    } catch (Exception e) {
                        System.out.println("Detta är inte ett giltigt lottnummer!");
                    }
                    break;
                case 3:
                    // Lägg till vinstlott
                    try {
                        System.out.print("Lottnummer: ");
                        int lottNummer = Integer.parseInt(sc.nextLine());
                        System.out.print("Vinst: ");
                        String vinst = sc.nextLine();

                        if(vinst.equals("")) {
                            System.out.println("Går inte att ha tom vinst");
                            break;
                        }

                        vl.skapaVinstLott(lottNummer, vinst);
                        System.out.println("En ny vinstlott är tillagd med");
                        System.out.println("Lottnummer: " + lottNummer);
                        System.out.println("Vinst: " + vinst);
                    }   catch (Exception e) {
                        System.out.println("Inte giltigt inmatning!");
                    }
                    break;
                case 4:
                    // Avsluta
                    running = false;
                    break;
                default:
                    System.out.println("Inte ett giltigt menyval!");;
            }
        }
    }
}
