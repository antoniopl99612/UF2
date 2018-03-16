package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Registrar {

    String nombre;
    String apellido;
    double edad;
    String email;
    String poblacion;
    String nombreusuario;
    String contraseña;
    boolean mayoredad;



    void datosregistro() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("------REGISTRO------");

        System.out.println("Nombre:");
        nombre = scanner.nextLine();

        System.out.println("Apellido:");
        apellido = scanner.nextLine();

        System.out.println("Edad:");
        edad = scanner.nextInt();

        System.out.println("Email:");
        email = scanner.nextLine();

        System.out.println("Eres mayor de edad ?");
        mayoredad = scanner.nextBoolean();

        System.out.println("Poblacion:");
        poblacion = scanner.nextLine();

        System.out.println("Nombre Usuario:");
        nombreusuario = scanner.nextLine();

        System.out.println("Password:");
        contraseña = scanner.nextLine();


        scanner.nextLine();


        if (mayoredad == true) {
            System.out.println("Eres mayor de edad ?");
            esmayoredad = scanner.nextLine();
        }

    }
}






