package com.company.ordenaletras.view;
import com.company.main.view.Widgets;

import java.util.Scanner;
public class Menu {
    public void mostrarTitulo(){
//        System.out.println("\n\033[32m++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++");
//        System.out.println("\b                          ¡¡BIENVENIDO!! AL JUEGO ORDENA LAS LETRAS\b");
//        System.out.println("++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++++++++++++++_+++++++++++\n");

        Widgets widgets = new Widgets();
        widgets.printTitle();
    }

    public void mostrarDescripcion() {
        System.out.println("Descripción: Este juego es distinto a todos los anteriores.Dispones de diversas letras por las que\ntendrás que descubrir su orden para formar palabras coherentes. \n\n");
    }

    public String mostrarMenu(){

        System.out.println("a) Nivel 1");
        System.out.println("b) Nivel 2");
        System.out.println("c) Nivel 3");
        System.out.println("d) Exit\n");
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        return opcion;
    }

}
