package com.company.View;

import com.company.Manager.ManagerPalabras;
import com.company.Manager.ManagerPalabrasN2;

import java.util.Scanner;

public class PantallaNivel2 {

    public String mostrar() {
        System.out.println("\n**************");
        System.out.println("    NIVEL 2");
        System.out.println("**************\n");

        ManagerPalabrasN2 managerPalabrasN2 = new ManagerPalabrasN2();
        Scanner scanner = new Scanner(System.in);
        String palabra1 = managerPalabrasN2.cogerPalabra();
        String respuesta1 = "";
        String respuesta2 = "";
        String respuesta3 = "";
        palabra1 = managerPalabrasN2.desordenar(palabra1);
        System.out.println(palabra1);
        respuesta1 = scanner.nextLine();


        String palabra2 = managerPalabrasN2.cogerPalabra();
        palabra2 = managerPalabrasN2.desordenar(palabra2);
        System.out.println(palabra2);
        respuesta2 = scanner.nextLine();



        String palabra3 = managerPalabrasN2.cogerPalabra();
        palabra3 = managerPalabrasN2.desordenar(palabra3);
        System.out.println(palabra3);
        respuesta3 = scanner.nextLine();
        return respuesta1;

    }
}
