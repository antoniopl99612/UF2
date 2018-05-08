package com.company.main.view;

import com.company.main.manager.ManagerUsuarios;

import java.util.Scanner;

public class PantallaAcceder {

    public void iniciar(ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("");
        System.out.println("");

        System.out.println("\033[0;1m" +"\033[35m--------------------------------------------");
        System.out.println("\033[0;1m" +"\033[35m|                    ACCESO                |");
        System.out.println("\033[0;1m" +"\033[35m--------------------------------------------");

        System.out.println("\b\033[35mNombre Usuario:");
        String nombreusuario = scanner.nextLine();

        System.out.println("\033[35mPassword:");
        String contraseña = scanner.nextLine();
        while (!managerUsuarios.comprovarUsuario(nombreusuario, contraseña)) {
            if (managerUsuarios.comprovarUsuario(nombreusuario, contraseña)) {

                System.out.println("");
                System.out.println("");

                System.out.println("\033[35m--------------------------");
                System.out.println("\033[35mBIENVENIDO   " + nombreusuario);
                System.out.println("\033[35m--------------------------");
            } else {
                System.out.println("\033[35m-------------------------------------------");
                System.out.println("\033[35mERROR!!! NOMBREUSUARIO/CONTRASEÑA INVALIDOS");
                System.out.println("\033[35m-------------------------------------------");
                System.out.println("\033[35mNombre Usuario:");
                System.out.println("\033[35mPassword:");
            }
        }
    }
}
