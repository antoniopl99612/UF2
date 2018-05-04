package com.company.acertijo.view;

import com.company.acertijo.model.Score;

public class MostrarPuntuación {
    public void scoreActual(){
        Score score = new Score();
        System.out.println("Tu puntuación actual es: "+ score.puntaje);
        System.out.println("");
    }
}
