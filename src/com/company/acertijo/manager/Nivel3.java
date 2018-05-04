package com.company.acertijo.manager;

import com.company.acertijo.model.Acertijo3;
import com.company.acertijo.view.ErrorRespuesta;

public class Nivel3 {
    public void cierto(){
        Acertijo3 acertijo3 = new Acertijo3();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo3.respuesta.equals(acertijo3.incorrecto1)){
            System.out.println("\nIncorrecto");
            acertijo3.correcto = false;

        }else if (acertijo3.respuesta.equals(acertijo3.solución)) {
            System.out.println("\n¡Correcto!");
            acertijo3.correcto = true;

        }else if (acertijo3.respuesta.equals(acertijo3.incorrecto2)) {
            System.out.println("\nIncorrecto");
            acertijo3.correcto = false;

        }else {
            errorRespuesta.warning();
            ManagerAcertijo managerAcertijo = new ManagerAcertijo();
            managerAcertijo.escaner3();
            cierto();
        }
    }
}
