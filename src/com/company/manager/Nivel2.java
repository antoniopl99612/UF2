package com.company.manager;

import com.company.model.Acertijo2;
import com.company.view.ErrorRespuesta;

public class Nivel2 {

    public void cierto(){
        Acertijo2 acertijo2 = new Acertijo2();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo2.respuesta.equals(acertijo2.incorrecto1)){
            System.out.println("\nIncorrecto");
            acertijo2.correcto = false;

        }else if (acertijo2.respuesta.equals(acertijo2.solución)) {
            System.out.println("\n¡Correcto!");
            acertijo2.correcto = true;

        }else if (acertijo2.respuesta.equals(acertijo2.incorrecto2)) {
            System.out.println("\nIncorrecto");
            acertijo2.correcto = false;

        }else {
            errorRespuesta.warning();
            ManagerAcertijo managerAcertijo = new ManagerAcertijo();
            managerAcertijo.escaner2();
            cierto();
        }
    }
}
