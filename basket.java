package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class basket {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        int num_partits = ent.nextInt();
        int num_cestes = ent.nextInt();

        int punt_local = 0;
        int punt_visitant = 0;

        while (num_partits != 0) {
            num_partits -= 1;
            while (num_cestes != 0) {
                num_cestes -= 1;

                String equip = ent.next();
                int puntuacio = ent.nextInt();


                if (equip.equals("V")) {
                    punt_visitant += puntuacio;
                }
                else if (equip.equals("L")) punt_local += puntuacio;
            }

            if (punt_visitant < punt_local) {
                System.out.println("L" + punt_local + punt_visitant);
            } else if (punt_visitant > punt_local) {
                System.out.println("V " + punt_visitant + " " + punt_local);
            } else System.out.println("E " + punt_local+ " " + punt_visitant);
        }

    }
}