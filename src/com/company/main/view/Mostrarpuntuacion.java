package com.company.main.view;

import com.company.acertijo.model.Score;

public class Mostrarpuntuacion {
    public void mostrar(){
        System.out.println("- - - PUNTUACIÓN - - -");
        Score score = new Score();
        System.out.println("Acertijos: " + score.puntaje);
        System.out.println("Ordenar letras:");
        System.out.println("Capitales: ");
    }
}
