package com.company.manager;

import com.company.model.Acertijo1;
import com.company.model.Acertijo2;
import com.company.model.Acertijo3;
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
        Acertijo2 acertijo2 = new Acertijo2();
        if (acertijo2.correcto = false){
            score.puntaje -= 1;
        }else if (acertijo2.correcto = true){
            score.puntaje += 1;
        }
    }
    public void actualizarNivel3(){
        Acertijo3 acertijo3 = new Acertijo3();
        if (acertijo3.correcto = false){
            score.puntaje -= 1;
        }else if (acertijo3.correcto = true){
            score.puntaje += 1;
        }
    }
}
