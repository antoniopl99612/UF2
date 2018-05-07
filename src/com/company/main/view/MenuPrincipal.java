package com.company.main.view;

import com.company.RelacionaPalabras.view.MainRelaciona;
import com.company.acertijo.view.AcertijoMain;
import com.company.ordenaletras.view.OrdenaLetrasMain;

import java.util.Scanner;

public class MenuPrincipal {
    public void show(){
        System.out.println("------------------------------------------------------\n" +
                "           BIENVENIDO AL JUEGO: BRAINTRAINING              \n"+
                "------------------------------------------------------\n");
        System.out.println("¿Que juego quieres jugar?\n" +
                "a) Acertijos\n" +
                "b) Ordenar letras\n" +
                "c) Capitales\n" +
                "d) Relaciona");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equals("a")){
            new AcertijoMain().show();
        }else if (respuesta.equals("b")){
            new OrdenaLetrasMain().show();
        }else if (respuesta.equals("c")){
            new MainRelaciona().show();
        }else if (respuesta.equals("d")){
            ;
        }else {
            System.out.println("Letra incorrecta");
        }
    }
}
