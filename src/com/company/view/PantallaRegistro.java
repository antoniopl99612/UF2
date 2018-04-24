package com.company.view;

import com.company.manager.ManagerUsuarios;
import com.company.model.Usuario;

import java.util.Scanner;

import static com.company.manager.ManagerUsuarios.*;

public class PantallaRegistro {

    public void iniciar(ManagerUsuarios managerUsuarios) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("      REGISTRO        ");
        System.out.println("----------------------");


        System.out.println("Nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Apellido:");
        String  apellido = scanner.nextLine();

        System.out.println("Edad:");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Eres mayor de edad ?");
        boolean mayoredad = scanner.nextBoolean();

        scanner.nextLine();

        System.out.println("Poblacion:");
        String poblacion = scanner.nextLine();

        System.out.println("Nombre Usuario:");
        String nombreusuario = scanner.nextLine();

        System.out.println("Password:");
        String contraseña = scanner.nextLine();

        managerUsuarios.crearUsuario(nombre, contraseña);

        System.out.println("|---------------------------------|");
        System.out.println("|---------------------------------|");
        System.out.println("|REGISTRO COMPLETADO CORRECTAMENTE|");
        System.out.println("|---------------------------------|");
        System.out.println("|---------------------------------|");


        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad:" + edad);
        System.out.println("Email:" + email);
        System.out.println("Mayor de edad:" + mayoredad);
        System.out.println("Poblacion:" + poblacion);
        System.out.println("Nombre de usuario:" + nombreusuario);
        System.out.println("Password:" + contraseña);


    }
}
