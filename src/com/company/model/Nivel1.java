package com.company.model;

import java.util.Scanner;

public class Nivel1 {


    void cierto(){
        if (respuesta){
            System.out.println("Incorrecto");
            correcto = false;
        }else {
            System.out.println("Correcto");
            correcto = true;
        }
    }
}
