package com.company.ordenaletras.view;


import com.company.ordenaletras.manager.ManagerPalabra;

import java.util.Scanner;

import java.util.Scanner;

public class PantallaNivel1 {
    public void mostrar() {
        System.out.println("\n**************");
        System.out.println("    NIVEL 1");
        System.out.println("**************\n");



    }
    public String mostrarPalabra1 () {
        ManagerPalabra managerPalabras = new ManagerPalabra();

        Scanner scanner = new Scanner(System.in);
        String ccopiapalabra1= "";
        String palabra1 = managerPalabras.cogerPalabra();
        ccopiapalabra1 = palabra1;
        String respuesta1 = "";
        palabra1 = managerPalabras.desordenar(palabra1);
        System.out.println(palabra1);
        respuesta1 = scanner.nextLine();
        return respuesta1;
    }


    public String mostrarPalabra2 () {
        ManagerPalabra managerPalabras = new ManagerPalabra();
        Scanner scanner = new Scanner(System.in);
        String respuesta2 = "";
        String copiapalabra2 = "";
        String palabra2 = managerPalabras.cogerPalabra();
        copiapalabra2 = palabra2;
        palabra2 = managerPalabras.desordenar(palabra2);
        System.out.println(palabra2);
        respuesta2 = scanner.nextLine();
        return respuesta2;
    }


    public String mostrarPalabra3 () {
        ManagerPalabra managerPalabras = new ManagerPalabra();
        Scanner scanner = new Scanner(System.in);
        String respuesta3 = "";
        String copiapalabra3= "";
        String palabra3 = managerPalabras.cogerPalabra();
        copiapalabra3 = palabra3;
        palabra3 = managerPalabras.desordenar(palabra3);
        System.out.println(palabra3);
        respuesta3 = scanner.nextLine();
        return respuesta3;

    }


}
