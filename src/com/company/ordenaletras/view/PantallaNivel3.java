package com.company.ordenaletras.view;

import com.company.ordenaletras.manager.ManagerPalabraN3;

import java.util.Scanner;

public class PantallaNivel3 {
    public String mostrar() {
        System.out.println("\n**************");
        System.out.println("    NIVEL 3");
        System.out.println("**************\n");

        ManagerPalabraN3 managerPalabrasN3 = new ManagerPalabraN3();
        Scanner scanner = new Scanner(System.in);
        String palabra1 = managerPalabrasN3.cogerPalabra();
        String respuesta1 = "";
        String respuesta2 = "";
        String respuesta3 = "";
        palabra1 = managerPalabrasN3.desordenar(palabra1);
        System.out.println(palabra1);
        respuesta1 = scanner.nextLine();


        String palabra2 = managerPalabrasN3.cogerPalabra();
        palabra2 = managerPalabrasN3.desordenar(palabra2);
        System.out.println(palabra2);
        respuesta2 = scanner.nextLine();



        String palabra3 = managerPalabrasN3.cogerPalabra();
        palabra3 = managerPalabrasN3.desordenar(palabra3);
        System.out.println(palabra3);
        respuesta3 = scanner.nextLine();
        return respuesta1;

    }
}
