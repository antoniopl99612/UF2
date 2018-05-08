package com.company;

import com.company.main.manager.ManagerUsuarios;
import com.company.main.view.*;

import java.awt.*;
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
    Font negrita = new Font ("Arial",Font.BOLD,24);
    System.out.println("\033[0;1m" +"--------------------------------------------");
    System.out.println("\033[0;1m" + "|               MENU PRINCIPAL             |");
    System.out.println("--------------------------------------------");
    System.out.println("\n\033[32ma) \uD83D\uDCDD Registrarse\n\b" +
            "\033[35mb) \uD83D\uDCBB Iniciar sesión\n\b" +
            "\033[33mc) \uD83D\uDD79 Jugar\n\b" +
            "\033[31me) \uD83D\uDD1C\uD83D\uDEAA Salir\n\b" +
            "\033[36mp) \uD83D\uDCAF Mostrar puntuación\n\b");
    respuesta = scanner.nextLine();

    if (respuesta.equals("a")) {
        pantallaRegistro.iniciar(managerUsuarios);
    } else if (respuesta.equals("b")) {
        pantallaAcceder.iniciar(managerUsuarios);
    } else if (respuesta.equals("c")) {
        new Widgets().printTitle();
        new MenuPrincipal().show();
    } else if (respuesta.equals("p")) {
            mostrarpuntuacion.mostrar();
        }
}
    }
}