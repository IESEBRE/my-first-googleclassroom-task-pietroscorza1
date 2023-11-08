package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class th_man {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();
        int alumnes = 0;

        while (numCasos-->0){

            int sumaA = 0;
            int sumaB = 0;
            boolean the_man = false;


            alumnes = ent.nextInt();

            int[] forza = new int[alumnes];

            for (int i = 0; i < forza.length; i++) {
                forza[i] = ent.nextInt();
            }

            Arrays.sort(forza);

            for (int i = forza.length-1; (i != -1);i -= 1) {
               if (i == 0 && sumaA < sumaB + forza[0] || sumaA == sumaB + forza[0]){
                    the_man = true;
                }

                if(sumaA <= sumaB){
                    sumaA += forza[i];
                }else sumaB+= forza[i];

            }

            if(the_man) System.out.println("SI");
            else System.out.println("NO");

        }

    }
}
