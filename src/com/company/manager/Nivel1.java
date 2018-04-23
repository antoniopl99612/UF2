package com.company.manager;

import com.company.model.Acertijo1;
import com.company.view.ErrorRespuesta;

public class Nivel1 {

    public void cierto(){
        Acertijo1 acertijo1 = new Acertijo1();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo1.respuesta.equals(acertijo1.incorrecto1)){
            System.out.println("Incorrecto");
            acertijo1.correcto = false;

        }else if (acertijo1.respuesta.equals(acertijo1.incorrecto2)) {
            System.out.println("Incorrecto");
            acertijo1.correcto = false;

        }else if (acertijo1.respuesta.equals(acertijo1.solución)) {
            System.out.println("¡Correcto!");
            acertijo1.correcto = true;

        }else {
            errorRespuesta.warning();
            cierto();
        }
    }
}
