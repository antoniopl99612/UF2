package com.company.manager;

import com.company.model.Acertijo3;
import com.company.model.Acertijo4;
import com.company.view.ErrorRespuesta;

public class Nivel4 {
    public void cierto(){
        Acertijo4 acertijo4 = new Acertijo4();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo4.respuesta.equals(acertijo4.incorrecto1)){
            System.out.println("Incorrecto");
            acertijo4.correcto = false;

        }else if (acertijo4.respuesta.equals(acertijo4.solución)) {
            System.out.println("¡Correcto!");
            acertijo4.correcto = true;

        }else if (acertijo4.respuesta.equals(acertijo4.incorrecto2)) {
            System.out.println("Incorrecto");
            acertijo4.correcto = false;

        }else {
            errorRespuesta.warning();
            cierto();
        }
    }
}
