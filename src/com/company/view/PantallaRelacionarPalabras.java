package com.company.view;

import com.company.manager.ManagerRelacionar;
import com.company.manager.ManagerUsuarios;
import com.company.model.Nivel;

import java.util.Scanner;

public class PantallaRelacionarPalabras {

    public void iniciar(ManagerRelacionar managerRelacionar) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println("     RELACIONA        ");
        System.out.println("----------------------");


        Nivel[] elnivel = managerRelacionar.obtenerNiveles();

        System.out.println("Relaciona las sigüientes palabras con un concepto:");

        for (int i = 0; i < elnivel.length; i++) {
            System.out.println(elnivel[i].palabras);
            System.out.println("Respuesta:");
            String respuesta = scanner.nextLine().toUpperCase();
            if(respuesta.equals(elnivel[i].respuesta)){
                System.out.println("COOOOOOORRECTO!!");
                System.out.println("PASAS AL SIGUIENTE NIVEL!!");
            } else {
                System.out.println("ERROOOOOOOOOOOOOOR!!");
                System.out.println("INTENTALO DE NUEVO!!");

            }
        }

    }
}


