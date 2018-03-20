package com.company.view;

import com.company.manager.ManagerUsuarios;
import com.company.model.Usuario;

import java.util.Scanner;

public class PantallaAcceder {

    public void iniciar(ManagerUsuarios managerUsuarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ACCESO");

        System.out.println("Nombre Usuario:");
        String nombreusuario = scanner.nextLine();

        System.out.println("Password:");
        String contraseña = scanner.nextLine();

        if (managerUsuarios.comprovarUsuario(nombreusuario, contraseña)) {

            System.out.println("--------------------------");
            System.out.println("BIENVENIDO" + nombreusuario);
            System.out.println("--------------------------");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("ERROR!!! NOMBREUSUARIO/CONTRASEÑA INVALIDOS");
            System.out.println("-------------------------------------------");
        }
    }
}

