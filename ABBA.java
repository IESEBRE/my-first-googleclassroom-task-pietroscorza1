package org.example;

import java.util.Scanner;

public class ABBA {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numCasos = ent.nextInt();

        while(numCasos-->0){

            String[] nombres = ent.skip("[\r\n]*").nextLine().split(", ");
            String[] nombresFinal = nombres[nombres.length-1].split(" i ");


        for (int i = 0; i < nombres.length-1; i++) {
                System.out.print(nombres[i].charAt(0));
            }
            System.out.print(nombresFinal[0].charAt(0));
            System.out.println(nombresFinal[1].charAt(0));
        }
    }
}
