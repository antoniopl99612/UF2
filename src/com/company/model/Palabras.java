package com.company.model;

import java.util.Random;

public class Palabras {
    String valor;
    String [][] valorN1= { {"fresa", "ordenador", "calle", "nombre", "movil", "coche"}, {"torre", "correo", "camino", "nivel", "musica", "almuerzo"}, {"caer", "sudor", "lunes", "cuero", "bar", "orden"}};
    String [][] valorN2= { {"teclado", "reto", "juego", "perdedor", "mochila", "habitación"}, {"almacén", "mejor", "maratón", "balón", "deforme", "signos"}, {"podadora", "sidra", "pegar", "afeitadora", "calcetín", "oficina"}};

    public String cogerPalabra(){
        Random random = new Random();

        return valorN1[random.nextInt(3)][random.nextInt(6)];
    }

    public String desordenar(String palabra){
        Random random = new Random();
        Palabras palabras = new Palabras();

        String palabra1 = palabras.cogerPalabra();

        boolean[] cogidas = new boolean[palabra.length()];

        String palabraDesordenada = "";

        for (int i = 0; i <palabra1.length(); i++) {
           palabraDesordenada += palabra1.charAt(i);

        }

        return palabra;
    }
}


