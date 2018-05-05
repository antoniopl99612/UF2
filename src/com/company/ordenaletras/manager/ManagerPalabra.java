package com.company.ordenaletras.manager;
import java.util.Random;

public class ManagerPalabras {
    String valor;
    String[][] valorN1 = {{"fresa", "ordenador", "calle", "nombre", "movil", "coche"},
            {"torre", "correo", "camino", "nivel", "musica", "almuerzo"},
            {"caer", "sudor", "lunes", "cuero", "bar", "orden"},
            {"teclado", "reto", "juego", "perdedor", "mochila", "habitación"},
            {"almacén", "mejor", "maratón", "balón", "deforme", "signos"},
            {"podadora", "sidra", "pegar", "afeitadora", "calcetín", "oficina"}};

    public String cogerPalabra() {
        Random random = new Random();

        return valorN1[random.nextInt(5)][random.nextInt(6)];
    }

    public  String desordenar(String palabra) {
        Random random = new Random();

        boolean[] cogidas = new boolean[palabra.length()];

        String palabraDesordenada ="";

        for (int i = 0; i < palabra.length(); i++) {

            if (cogidas[i] != true) {

                palabraDesordenada += palabra.charAt(random.nextInt(4));
                cogidas[i] = true;

            } else if (cogidas[i] == true) {

            } else if (cogidas [i] != true) {
                palabraDesordenada += palabra.charAt(random.nextInt(5));
                cogidas[i] = true;
            }
        }

        return palabraDesordenada;
    }
}

