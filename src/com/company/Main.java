package com.company;

import com.company.manager.ManagerCapitales;
import com.company.manager.ManagerRelacionar;
import com.company.manager.ManagerUsuarios;
import com.company.view.PantallaAcceder;
import com.company.view.PantallaRegistro;
import com.company.view.PantallaRelacionarPalabras;

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
////    char opcion;
////
////        do {
////        System.out.println("Que desea hacer ?");
////        System.out.println("a Registrarse\n b Acceder \n c JUGAR\n\n s Salir");
////
////        opcion = scanner.nextLine().charAt(0);
////        switch (opcion) {
////            case 'a':
////                new PantallaRegistro();
////                break;
////            case 'b':
////                new PantallaAcceder();
////                break;
////            case 'c':
////                new PantallaRelacionarPalabras();
////                break;
//            default:
//                System.out.println("OPCION INCORRECTA!");
//                break;
//        }
//    } while (opcion != 's');
//}



    public static void main(String[] args) {

        ManagerCapitales managerCapitales = new ManagerCapitales();
        managerCapitales.añadirCapital("España", "Madrid");



        ManagerUsuarios managerUsuarios = new ManagerUsuarios();

        PantallaRegistro pantallaRegistro = new PantallaRegistro();
        pantallaRegistro.iniciar(managerUsuarios);

        PantallaAcceder pantallaAcceder = new PantallaAcceder();
        pantallaAcceder.iniciar(managerUsuarios);




        //   ManagerRelacionar managerRelacionar = new ManagerRelacionar();
        // managerRelacionar.crearNiveles();


        //PantallaRelacionarPalabras pantallaRelacionar = new PantallaRelacionarPalabras();
        //pantallaRelacionar.iniciar(managerRelacionar);

    }
    }

