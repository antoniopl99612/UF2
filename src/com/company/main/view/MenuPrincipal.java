package com.company.main.view;

import com.company.RelacionaPalabras.view.MainRelaciona;
import com.company.acertijo.view.AcertijoMain;
import com.company.ordenaletras.view.OrdenarLetraMain;

import java.util.Scanner;

public class MenuPrincipal {
    public void show(){
        System.out.println("------------------------------------------------------\n" +
                "           BIENVENIDO AL JUEGO: BRAINTRAINING              \n"+
                "------------------------------------------------------\n");
        System.out.println("¿Que juego quieres jugar?\n" +
                "a) Acertijos\n" +
                "b) Ordenar letras\n" +
                "c) Relaciona\n" +
                "d) Capitales");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta.equals("a")){
            new AcertijoMain().show();
        }else if (respuesta.equals("b")){
            new OrdenarLetraMain().show();
        }else if (respuesta.equals("c")){
            new MainRelaciona().show();
        }else if (respuesta.equals("d")){
            ;
        }else {
            System.out.println("Letra incorrecta");
        }
    }
}
