package org.example;

import java.util.Scanner;

public class entrada_dades {

    public static void main(String[] args) {

        //Declaracions de variables
        int valor;
        Scanner ent = new Scanner(System.in);

        System.out.println("Introdueix un valor enter");
        valor = ent.nextInt();


        System.out.println(valor);
    }
}
