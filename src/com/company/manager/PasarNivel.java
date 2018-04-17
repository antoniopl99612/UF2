package com.company.manager;

import com.company.model.Acertijo1;
import com.company.model.Score;
import com.company.view.FinDelJuego;
import com.company.view.MostrarPuntuación;

public class PasarNivel {

    public void comprobar (){
        Score score = new Score();
        FinDelJuego finDelJuego = new FinDelJuego();
        MostrarPuntuación mostrarPuntuación = new MostrarPuntuación();

        if (score.puntaje <= 0){
            finDelJuego.gameOver();
        } else {
            mostrarPuntuación.scoreActual();
        }
    }
}
