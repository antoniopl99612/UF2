package com.company.model;

import com.company.manager.ManagerAcertijo;

public class Nivel1 {

    public void cierto(){
        Acertijo acertijo = new Acertijo();

        if (acertijo.respuesta.equals('a')){
            System.out.println("Incorrecto");
            acertijo.correcto = false;

        }else if (acertijo.respuesta.equals('c')) {
            System.out.println("Incorrecto");
            acertijo.correcto = false;

        }else if (acertijo.respuesta.equals('b')) {
            System.out.println("¡Correcto!");
            acertijo.correcto = true;

        }else {
            System.out.println("---- No has escrito correctamente tu respuesta ----");

        }
    }
}
