package com.company.ordenaletras.model;

import java.util.Random;
import java.util.Scanner;

public class Palabras {
    String valor;
    String[][] valorN1 = {{"fresa", "ordenador", "calle", "nombre", "movil", "coche"}, {"torre", "correo", "camino", "nivel", "musica", "almuerzo"}, {"caer", "sudor", "lunes", "cuero", "bar", "orden"}};
    String[][] valorN2 = {{"teclado", "reto", "juego", "perdedor", "mochila", "habitación"}, {"almacén", "mejor", "maratón", "balón", "deforme", "signos"}, {"podadora", "sidra", "pegar", "afeitadora", "calcetín", "oficina"}};

    public String cogerPalabra() {
        Random random = new Random();

        return valorN1[random.nextInt(3)][random.nextInt(6)];
    }

    public String desordenar(String palabra) {
        Random random = new Random();
        Palabras palabras = new Palabras();

        String palabra2 = palabras.cogerPalabra();

        boolean[] cogidas = new boolean[palabra.length()];

        String palabraDesordenada ="";

        for (int i = 0; i < palabra.length(); i++) {

            if (cogidas[i] != true) {

                palabraDesordenada += palabra.charAt(random.nextInt(5));
                cogidas[i] = true;

            } else if (cogidas[i] = true)
            {

            } else if (cogidas [i] != true)
            palabraDesordenada += palabra.charAt(random.nextInt(5));
            cogidas[i] = true;

        }

            return palabraDesordenada;


    }

    public String mostrarPalabras(){

        Palabras palabras = new Palabras();
        Scanner scanner = new Scanner(System.in);
        String palabra1 = palabras.cogerPalabra();
        String respuesta1 = "";
        String respuesta2 = "";
        String respuesta3 = "";
        palabra1 = palabras.desordenar(palabra1);
        System.out.println(palabra1);
        respuesta1 = scanner.nextLine();


        String palabra2 = palabras.cogerPalabra();
        palabra2 = palabras.desordenar(palabra2);
        System.out.println(palabra2);
        respuesta2 = scanner.nextLine();


        String palabra3 = palabras.cogerPalabra();
        palabra3 = palabras.desordenar(palabra3);
        System.out.println(palabra3);
        respuesta3 = scanner.nextLine();

        return palabra1;

    }
}



