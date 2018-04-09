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

        System.out.println("Email:");
        String email = scanner.nextLine();

        System.out.println("Eres mayor de edad ?");
        boolean mayoredad = scanner.nextBoolean();

        System.out.println("Poblacion:");
        String poblacion = scanner.nextLine();

        System.out.println("Nombre Usuario:");
        String nombreusuario = scanner.nextLine();

        System.out.println("Password:");
        String contraseña = scanner.nextLine();

        managerUsuarios.crearUsuario(nombre, contraseña);

        System.out.println("---------------------------------");
        System.out.println("REGISTRO COMPLETADO CORRECTAMENTE");
        System.out.println("---------------------------------");
    }
}
