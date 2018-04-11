package com.company.view;


import com.company.model.Palabras;

import java.util.Scanner;

public class PantallaNivel1 {

    Scanner scanner = new Scanner(System.in);
    String respuesta;
    public void mostrarN1() {

        System.out.println("_-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__-_-_-__ \n");
        System.out.println("¡¡BIENVENIDO!! AL JUEGO ORDENA LAS LETRAS  \n");
        System.out.println("Descripción: Este juego es distinto a todos los anteriores.\nDispones de diversas letras por las que tendrás que \ndescubrir su orden para formar palabras coherentes. \n\n");
        System.out.println("a) Nivel1 \n");
        System.out.println("b) Exit \n");

        Palabras palabras = new Palabras();

        String palabra1 = palabras.cogerPalabra();

        palabra1 = palabras.desordenar(palabra1);
        System.out.println(palabra1);

        String palabra2 = palabras.cogerPalabra();
        System.out.println(palabra2);

        String palabra3 = palabras.cogerPalabra();
        System.out.println(palabra3);


        String respuesta = scanner.nextLine();
           // if ("a".equals(respuesta)){
               // PantallaNivel1.

            }
    }

