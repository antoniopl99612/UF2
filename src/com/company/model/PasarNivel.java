package com.company.model;

public class PasarNivel {

    public void comprobar (){
        Acertijo acertijo = new Acertijo();

        if ( acertijo.correcto == false ){

            acertijo.puntaje = -1;
            }else {
            acertijo.puntaje = +1;

        }

        if (acertijo.puntaje == 0){
            System.out.println("GAME OVER");
        }
        System.out.println(acertijo.puntaje);
    }
}
