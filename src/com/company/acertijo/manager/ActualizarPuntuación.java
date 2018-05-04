package com.company.acertijo.manager;

import com.company.acertijo.model.*;

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
    public void actualizarNivel4(){
        Acertijo4 acertijo4 = new Acertijo4();
        if (acertijo4.correcto = false){
            score.puntaje -= 1;
        }else if (acertijo4.correcto = true){
            score.puntaje += 1;
        }
    }
}
