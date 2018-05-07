package com.company.ordenaletras.view;

import java.util.Scanner;

public class MenuContinuarNivel {
    public String mostrarContinuar(){
        String opcion;
        System.out.println("Tu puntuación es: ");
        System.out.println("¿Deseas pasar al siguiente nivel o repetir el nivel actual? ");
        System.out.println("siguiente[a] repetir [b] salir[c]");
        Scanner scanner = new Scanner(System.in);
        String opcion2 = scanner.nextLine();
        return opcion2;
    }
}
