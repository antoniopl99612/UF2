package com.company.view;


import com.company.manager.ManagerPalabra;
import com.company.model.Palabras;

import java.util.Scanner;

public class PantallaNivel1 {

    public void mostrar() {
        System.out.println("\n**************");
        System.out.println("    NIVEL 1");
        System.out.println("**************\n");

        ManagerPalabra managerPalabra = new ManagerPalabra();
        Scanner scanner = new Scanner(System.in);
        String palabra1 = managerPalabra.cogerPalabra();
        String respuesta1 = "";
        String respuesta2 = "";
        String respuesta3 = "";
        palabra1 = managerPalabra.desordenar(palabra1);
        System.out.println(palabra1);
        respuesta1 = scanner.nextLine();
        return respuesta1;

        String palabra2 = managerPalabra.cogerPalabra();
        palabra2 = managerPalabra.desordenar(palabra2);
        System.out.println(palabra2);
        respuesta2 = scanner.nextLine();
        return respuesta2;


        String palabra3 = managerPalabra.cogerPalabra();
        palabra3 = managerPalabra.desordenar(palabra3);
        System.out.println(palabra3);
        respuesta3 = scanner.nextLine();
        return respuesta3;
    }
}

