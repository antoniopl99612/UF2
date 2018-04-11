package com.company.model;

import com.company.manager.ManagerAcertijo;

public class Nivel1 {

    ManagerAcertijo managerAcertijo = new ManagerAcertijo();
    String respuesta = managerAcertijo.escaner();
    boolean correcto = true;
    public boolean cierto(){
        if (respuesta == "a" || respuesta == "c"){
            System.out.println("Incorrecto");
            correcto = false;
        }else if (respuesta == "b"){
            System.out.println("Correcto");
            correcto = true;
        }
    return correcto;
    }
}
