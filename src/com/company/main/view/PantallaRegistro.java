package com.company.main.view;

import com.company.main.manager.ManagerUsuarios;

import java.util.Scanner;


public class PantallaRegistro {

    public void iniciar(ManagerUsuarios managerUsuarios) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("\033[32m--------------------------------------------");
        System.out.println("\033[32m|                 \uD83C\uDD81\uD83C\uDD74\uD83C\uDD76\uD83C\uDD78\uD83C\uDD82\uD83C\uDD83\uD83C\uDD81\uD83C\uDD7E            |");
        System.out.println("\033[32m--------------------------------------------");
        System.out.println("                                                    ");
        System.out.println("                                                    ");



        System.out.println("\033[32mNombre:");
        String nombre = scanner.nextLine();

        System.out.println("\033[32mApellido:");
        String  apellido = scanner.nextLine();

        System.out.println("\033[32mEdad:");
        int edad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("\uD83D\uDCE7 Email:");
        String email = scanner.nextLine();


        System.out.println("\033[32mPoblación:");
        String poblacion = scanner.nextLine();

        System.out.println("\033[32mNombre Usuario:");
        String nombreusuario = scanner.nextLine();

        System.out.println("\033[32mPassword:");
        String contraseña = scanner.nextLine();

        managerUsuarios.crearUsuario(nombre, contraseña);

        System.out.println("\n\033[32m|-----------------------------------------------|");
        System.out.println(" ");
        System.out.println("\033[32m         REGISTRO COMPLETADO CORRECTAMENTE");
        System.out.println(" ");
        System.out.println("\033[32m|-----------------------------------------------|\n");


        System.out.println("|\033[32m    Nombre: " + nombre);
        System.out.println("|\033[32m    Apellido: " + apellido);
        System.out.println("|\033[32m    Email: " + email);
        System.out.println("|\033[32m    Nombre de usuario: " + nombreusuario);
        System.out.println("\n\033[32m|-----------------------------------------------|\n");


    }
}