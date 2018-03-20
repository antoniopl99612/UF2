package com.company.view;

import com.company.manager.ManagerUsuarios;
import com.company.model.Usuario;

import java.util.Scanner;

import static com.company.manager.ManagerUsuarios.*;

public class PantallaRegistro {

    public void iniciar(ManagerUsuarios managerUsuarios) {

        Usuario usuario = managerUsuarios.crearUsuario();

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("      REGISTRO        ");
        System.out.println("----------------------");


        System.out.println("Nombre:");
        usuario.nombre = scanner.nextLine();

        System.out.println("Apellido:");
        usuario.apellido = scanner.nextLine();

        System.out.println("Edad:");
        usuario.edad = scanner.nextInt();

        System.out.println("Email:");
        usuario.email = scanner.nextLine();

        System.out.println("Eres mayor de edad ?");
        usuario.mayoredad = scanner.nextBoolean();

        System.out.println("Poblacion:");
        usuario.poblacion = scanner.nextLine();

        System.out.println("Nombre Usuario:");
        usuario.nombreusuario = scanner.nextLine();

        System.out.println("Password:");
        usuario.contraseña = scanner.nextLine();

        ManagerUsuarios.crearUsuario(usuario.nombreusuario, usuario.contraseña);

        System.out.println("---------------------------------");
        System.out.println("REGISTRO COMPLETADO CORRECTAMENTE");
        System.out.println("---------------------------------");
    }
}
