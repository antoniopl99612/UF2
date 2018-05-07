package com.company.acertijo.manager;

import com.company.acertijo.model.Acertijo4;
import com.company.acertijo.model.Score;
import com.company.acertijo.view.ErrorRespuesta;

public class Nivel4 {
    public void cierto(){
        Acertijo4 acertijo4 = new Acertijo4();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();
        Score score = new Score();
        if (acertijo4.respuesta.equals(acertijo4.incorrecto1)){
            System.out.println("\nIncorrecto");


        }else if (acertijo4.respuesta.equals(acertijo4.solución)) {
            System.out.println("\n¡Correcto!");
            score.puntaje += 1;

        }else if (acertijo4.respuesta.equals(acertijo4.incorrecto2)) {
            System.out.println("\nIncorrecto");


        }else {
            errorRespuesta.warning();
            ManagerAcertijo managerAcertijo = new ManagerAcertijo();
            managerAcertijo.escaner4();
            cierto();
        }
    }
}
