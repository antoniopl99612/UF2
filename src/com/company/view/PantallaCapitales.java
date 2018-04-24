package com.company.view;

import com.company.manager.ManagerCapitales;
import com.company.model.Capital;

import java.util.Scanner;

public class PantallaCapitales {
    void mostrar(){
        System.out.println("JUEGO CAPITALES");

        ManagerCapitales managerCapitales = new ManagerCapitales();

        String pais = managerCapitales.obtenerPaisAleatorio();

        System.out.println("Cual es la capital de :" + pais);
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();

        boolean correcto = managerCapitales.comprobarCapital(pais, respuesta);

        if(!correcto){
            System.out.println("FALLO");
        }else{
            System.out.println("MOLT BE");
        }
    }
}
