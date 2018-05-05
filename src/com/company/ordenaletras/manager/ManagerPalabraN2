package com.company.Manager;

import java.util.Random;

public class ManagerPalabrasN2 {
    String [][] valorN2 = {{"Patata", "Consulta", "Sandía", "Desgarrar", "Trofeo", "Obeso"},
            {"Huevo", "Planear", "Sonrisa", "Piel", "Gruñir", "Duro"},
            {"Domador", "Volver", "Extranjero", "Relato", "Trofeo", "Obeso"},
            {"Patata", "Consulta", "Sandía", "Desgarrar", "Trofeo", "Obeso"},{"Patata", "Consulta", "Sandía", "Desgarrar", "Trofeo", "Obeso"},
            {"Cuadrado", "Fecha", "Cicatrizar", "Tranquilo", "Río", "Queso"}};
    public String cogerPalabra() {
        Random random = new Random();

        return valorN2[random.nextInt(5)][random.nextInt(6)];
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
