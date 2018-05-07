package com.company.acertijo.manager;

import com.company.acertijo.model.Acertijo2;
import com.company.acertijo.model.Score;
import com.company.acertijo.view.ErrorRespuesta;

public class Nivel2 {

    public void cierto(){
        Acertijo2 acertijo2 = new Acertijo2();
        ErrorRespuesta errorRespuesta = new ErrorRespuesta();
        Score score = new Score();
        if (acertijo2.respuesta.equals(acertijo2.incorrecto1)){
            System.out.println("\nIncorrecto");


        }else if (acertijo2.respuesta.equals(acertijo2.solución)) {
            System.out.println("\n¡Correcto!");
            score.puntaje += 1;

        }else if (acertijo2.respuesta.equals(acertijo2.incorrecto2)) {
            System.out.println("\nIncorrecto");


        }else {
            errorRespuesta.warning();
            ManagerAcertijo managerAcertijo = new ManagerAcertijo();
            managerAcertijo.escaner2();
            cierto();
        }
    }
}
