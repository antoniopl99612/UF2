package com.company.ordenaletras.view;

import java.util.Scanner;

public class Menu {
    public void mostrarTitulo(){
        System.out.println("\n++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++");
        System.out.println("\n                           ¡¡BIENVENIDO!! AL JUEGO ORDENA LAS LETRAS\n");
        System.out.println("++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++\n");
    }
    public void mostrarDescripcion() {
        System.out.println("Descripción: Este juego es distinto a todos los anteriores.Dispones de diversas letras por las que\ntendrás que descubrir su orden para formar palabras coherentes. \n\n");
    }
        public void mostrarMenu(){

        System.out.println("a) Nivel1");
        System.out.println("b) Exit\n");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        if ("a".equals(opcion)) {
            PantallaNivel1 pantallaNivel1 = new PantallaNivel1();
            pantallaNivel1.mostrarN1();
        } else if ("b".equals(opcion)) {
            System.out.println("ADIOS, HAS SALIDO DEL JUEGO");
        }
    }
    }



