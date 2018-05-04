package com.company;

import java.util.Scanner;

import com.company.manager.*;
import com.company.view.*;

import com.company.model.Palabras;
import com.company.view.PantallaNivel1;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------\n" +
                "           BIENVENIDO AL JUEGO: BRAINTRAINING              \n"+
                "------------------------------------------------------\n");
        System.out.println("¿Que juego quieres jugar?\n" +
                "a) Acertijos");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.nextLine();
        if (respuesta == "a"){
            ;
        }
	// write your code here

        ViewTitulo viewTitulo = new ViewTitulo();
        ViewNivel1 viewNivel1 = new ViewNivel1();
        ManagerAcertijo managerAcertijo = new ManagerAcertijo();
        Nivel1 nivel1 = new Nivel1();
        PasarNivel pasarNivel = new PasarNivel();
        ViewNivel2 viewNivel2 = new ViewNivel2();
        Nivel2 nivel2 = new Nivel2();
        MostrarPuntuación mostrarPuntuación = new MostrarPuntuación();
        ActualizarPuntuación actualizarPuntuación = new ActualizarPuntuación();
        ViewNivel3 viewNivel3 = new ViewNivel3();
        Nivel3 nivel3 = new Nivel3();
        Nivel4 nivel4 = new Nivel4();
        ViewNivel4 viewNivel4 = new ViewNivel4();

        mostrarPuntuación.scoreActual(); //muestra la score actual para el usuario registrado en el juego Acertijo

        viewTitulo.mostrar();

        viewNivel1.mostrar();
        managerAcertijo.escaner1();
        nivel1.cierto();
        actualizarPuntuación.actualizarNivel1();
        pasarNivel.comprobar();

        viewNivel2.mostrar();
        managerAcertijo.escaner2();
        nivel2.cierto();
        actualizarPuntuación.actualizarNivel2();
        pasarNivel.comprobar();

        viewNivel3.mostrar();
        managerAcertijo.escaner3();
        nivel3.cierto();
        actualizarPuntuación.actualizarNivel3();
        pasarNivel.comprobar();

        viewNivel4.mostrar();
        managerAcertijo.escaner4();
        nivel4.cierto();
        actualizarPuntuación.actualizarNivel4();
        pasarNivel.comprobar();

        PantallaNivel1 n1 = new PantallaNivel1();
        Palabras cogerPalabras = new Palabras();
        n1.mostrarN1();
    }
}
