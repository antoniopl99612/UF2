package com.company.acertijo.manager;

import com.company.acertijo.model.Score;
import com.company.acertijo.view.FinDelJuego;
import com.company.acertijo.view.MostrarPuntuación;

public class PasarNivel {

    public void comprobar (){
        Score score = new Score();
        FinDelJuego finDelJuego = new FinDelJuego();
        MostrarPuntuación mostrarPuntuación = new MostrarPuntuación();

        if (score.puntaje < 0){
            finDelJuego.gameOver();
        } else {
            mostrarPuntuación.scoreActual();
        }
    }
}
