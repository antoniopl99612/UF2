package com.company.model;

public class Nivel1 {


    String respuesta;
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
