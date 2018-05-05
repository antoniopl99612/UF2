package com.company.View;
import com.company.Manager.ManagerPalabras;

import java.util.Scanner;

public class PantallaNivel1 {
    public void mostrar() {
        System.out.println("\n**************");
        System.out.println("    NIVEL 1");
        System.out.println("**************\n");



    }
        public String mostrarPalabra1 () {
            ManagerPalabras managerPalabras = new ManagerPalabras();

            Scanner scanner = new Scanner(System.in);
            String palabra1 = managerPalabras.cogerPalabra();
            String respuesta1 = "";
            palabra1 = managerPalabras.desordenar(palabra1);
            System.out.println(palabra1);
            respuesta1 = scanner.nextLine();
            return respuesta1;
        }

        public String mostrarPalabra2 () {
            ManagerPalabras managerPalabras = new ManagerPalabras();
            Scanner scanner = new Scanner(System.in);
            String respuesta2 = "";
            String palabra2 = managerPalabras.cogerPalabra();
            palabra2 = managerPalabras.desordenar(palabra2);
            System.out.println(palabra2);
            respuesta2 = scanner.nextLine();
            return respuesta2;
        }


        public String mostrarPalabra3 () {
            ManagerPalabras managerPalabras = new ManagerPalabras();
            Scanner scanner = new Scanner(System.in);
            String respuesta3 = "";
            String palabra3 = managerPalabras.cogerPalabra();
            palabra3 = managerPalabras.desordenar(palabra3);
            System.out.println(palabra3);
            respuesta3 = scanner.nextLine();
            return respuesta3;

        }


    }
