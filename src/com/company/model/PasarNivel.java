package com.company.model;

public class PasarNivel {
    int puntaje = 0;
    public int comprobar (){
        Nivel1 nivel1 = new Nivel1();
        boolean correcto = nivel1.correcto;
        if ( correcto == false ){

            puntaje = -1;
            }else {
            puntaje = +1;

        }

        return puntaje;
    }
}
