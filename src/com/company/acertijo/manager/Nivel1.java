package com.company.acertijo.manager;

import com.company.acertijo.model.Acertijo1;
import com.company.acertijo.model.Score;
import com.company.acertijo.view.ErrorRespuesta;

public class Nivel1 {
    public void cierto(){
        Acertijo1 acertijo1 = new Acertijo1();
        Score score = new Score();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();

        if (acertijo1.respuesta.equals(acertijo1.incorrecto1)){
            System.out.println("\nIncorrecto");


        }else if (acertijo1.respuesta.equals(acertijo1.incorrecto2)) {
            System.out.println("\nIncorrecto");


        }else if (acertijo1.respuesta.equals(acertijo1.solución)) {
            System.out.println("\n¡Correcto!");
            score.puntaje += 1;

        }else {
            errorRespuesta.warning();
            ManagerAcertijo managerAcertijo = new ManagerAcertijo();
            managerAcertijo.escaner1();
            cierto();
        }
    }
}
