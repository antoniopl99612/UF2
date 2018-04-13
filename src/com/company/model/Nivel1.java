package com.company.model;

import com.company.manager.ManagerAcertijo;

public class Nivel1 {

    public void cierto(){
        Acertijo acertijo = new Acertijo();
        if (acertijo.respuesta == "a" || acertijo.respuesta == "c"){
            System.out.println("Incorrecto");
            acertijo.correcto = false;
        }else if (acertijo.respuesta == "b"){
            System.out.println("Correcto");
            acertijo.correcto = true;
        }
    }
}
