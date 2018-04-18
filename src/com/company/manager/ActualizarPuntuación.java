package com.company.manager;

import com.company.model.Acertijo1;
import com.company.model.Score;

public class ActualizarPuntuación {
    Score score = new Score();

    public void actualizarNivel1(){ //Se deja una segunda oportunidad para que el juego no termine en solo una ronda
        Acertijo1 acertijo1 = new Acertijo1();
        if (acertijo1.correcto = false){
            score.puntaje = 0;
        }else if (acertijo1.correcto = true){
            score.puntaje += 1;
        }
    }
    public void actualizarNivel2(){
        Acertijo1 acertijo1 = new Acertijo1();
        if (acertijo1.correcto = false){
            score.puntaje -= 1;
        }else if (acertijo1.correcto = true){
            score.puntaje += 1;
        }
    }
}
