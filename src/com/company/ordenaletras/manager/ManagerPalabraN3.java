package com.company.Manager;

import java.util.Random;

public class ManagerPalabrasN3 {
    String [][] valorN3 = {{"Dolor", "Rosado", "Medianoche", "Desgarrar", "Trofeo", "Lentes"},
            {"Alacrán", "Planear", "Alentar", "Gallo", "Gruñir", "Temblar"},
            {"Señuelo", "Cerebro", "Extranjero", "Relato", "Trofeo", "Obeso"},
            {"Patata", "Consulta", "Sandía", "Desgarrar", "Trofeo", "Obeso"},{"Patata", "Consulta", "Sandía", "Desgarrar", "Trofeo", "Obeso"},
            {"Cuadrado", "Fecha", "Cicatrizar", "Tranquilo", "Río", "Queso"}};
    public String cogerPalabra() {
        Random random = new Random();

        return valorN3[random.nextInt(5)][random.nextInt(6)];
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
