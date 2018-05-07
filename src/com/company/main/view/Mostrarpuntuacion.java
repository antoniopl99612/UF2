package com.company.main.view;

import com.company.RelacionaPalabras.model.Nivel;
import com.company.acertijo.model.Score;

public class Mostrarpuntuacion {
    public void mostrar(){
        Score score = new Score();
        Nivel nivel = new Nivel();
        PantallaRegistro pantallaRegistro = new PantallaRegistro();
        System.out.println("\n- - - PUNTUACIÓN - - -");
        System.out.println("Acertijos: " + score.puntaje);
        System.out.println("Ordenar letras: ");
        System.out.println("Relaciona: " + nivel.puntuacion);
    }
}
