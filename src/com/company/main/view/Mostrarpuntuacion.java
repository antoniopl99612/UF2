package com.company.main.view;

import com.company.RelacionaPalabras.model.Nivel;
import com.company.acertijo.model.Score;

public class Mostrarpuntuacion {
    public void mostrar(){
        System.out.println("\n- - - PUNTUACIÓN - - -");
        Score score = new Score();
        Nivel nivel = new Nivel();
        System.out.println("Acertijos: " + score.puntaje);
        System.out.println("Ordenar letras: ");
        System.out.println("Relaciona: " + nivel.puntuacion);
    }
}
