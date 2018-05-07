package com.company;

import com.company.main.manager.ManagerUsuarios;
import com.company.main.view.MenuPrincipal;
import com.company.main.view.Mostrarpuntuacion;
import com.company.main.view.PantallaAcceder;
import com.company.main.view.PantallaRegistro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();
        PantallaRegistro pantallaRegistro = new PantallaRegistro();
        PantallaAcceder pantallaAcceder = new PantallaAcceder();
        Mostrarpuntuacion mostrarpuntuacion = new Mostrarpuntuacion();
        Scanner scanner = new Scanner(System.in);
        String respuesta = "";
while (!respuesta.equals("e")) {
    System.out.println("\na) Registrarse\n" + "b) Iniciar sesión\n" + "c) Jugar\n" + "e) Salir\n" + "p) Mostrar puntuación\n");
    respuesta = scanner.nextLine();

    if (respuesta.equals("a")) {
        pantallaRegistro.iniciar(managerUsuarios);
    } else if (respuesta.equals("b")) {
        pantallaAcceder.iniciar(managerUsuarios);
    } else if (respuesta.equals("c")) {
        new MenuPrincipal().show();
    } else if (respuesta.equals("p")) {
            mostrarpuntuacion.mostrar();
        }
}
    }
}