package com.company.model;

public class PasarNivel {

    public void comprobar (){
        Acertijo acertijo = new Acertijo();

        if ( acertijo.correcto == false ){

            acertijo.puntaje = -1;
            }else {
            acertijo.puntaje = +1;

        }
        System.out.println(acertijo.puntaje);
    }
}
