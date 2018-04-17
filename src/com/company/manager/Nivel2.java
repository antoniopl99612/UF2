package com.company.manager;

import com.company.model.Acertijo2;
import com.company.view.ErrorRespuesta;

public class Nivel2 {
    public void cierto(){
        Acertijo2 acertijo2 = new Acertijo2();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo2.respuesta.equals('a')){
            System.out.println("Incorrecto");
            acertijo2.correcto = false;

        }else if (acertijo2.respuesta.equals('c')) {
            System.out.println("¡Correcto!");
            acertijo2.correcto = true;

        }else if (acertijo2.respuesta.equals('b')) {
            System.out.println("Incorrecto");
            acertijo2.correcto = false;

        }else {
            errorRespuesta.warning();
            cierto();
        }
    }
}
