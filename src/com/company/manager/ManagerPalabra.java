package com.company.manager;

import com.company.model.Palabras;

import java.util.Random;

public class ManagerPalabra {
    String valor;
    String[][] valorN1 = {{"fresa", "ordenador", "calle", "nombre", "movil", "coche"}, {"torre", "correo", "camino", "nivel", "musica", "almuerzo"}, {"caer", "sudor", "lunes", "cuero", "bar", "orden"}};
    String[][] valorN2 = {{"teclado", "reto", "juego", "perdedor", "mochila", "habitación"}, {"almacén", "mejor", "maratón", "balón", "deforme", "signos"}, {"podadora", "sidra", "pegar", "afeitadora", "calcetín", "oficina"}};

    public String cogerPalabra() {
        Random random = new Random();

        return valorN1[random.nextInt(3)][random.nextInt(6)];
    }

    public  String desordenar(String palabra) {
        Random random = new Random();

        boolean[] cogidas = new boolean[palabra.length()];

        String palabraDesordenada ="";

        for (int i = 0; i < palabra.length(); i++) {

            if (cogidas[i] != true) {

                palabraDesordenada += palabra.charAt(random.nextInt(5));
                cogidas[i] = true;

            } else if (cogidas[i] == true) {

            } else if (cogidas [i] != true) {
                palabraDesordenada += palabra.charAt(random.nextInt(5));
                cogidas[i] = true;
            }
        }

        return palabraDesordenada;
    }

    public comprobarOrden (){
        if (r)

    }
}
