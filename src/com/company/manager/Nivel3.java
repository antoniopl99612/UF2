package com.company.manager;

import com.company.model.Acertijo2;
import com.company.model.Acertijo3;
import com.company.view.ErrorRespuesta;

public class Nivel3 {
    public void cierto(){
        Acertijo3 acertijo3 = new Acertijo3();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo3.respuesta.equals('a')){
            System.out.println("Incorrecto");
            acertijo3.correcto = false;

        }else if (acertijo3.respuesta.equals('c')) {
            System.out.println("¡Correcto!");
            acertijo3.correcto = true;

        }else if (acertijo3.respuesta.equals('b')) {
            System.out.println("Incorrecto");
            acertijo3.correcto = false;

        }else {
            errorRespuesta.warning();
            cierto();
        }
    }
}
