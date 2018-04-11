package com.company;

import com.company.manager.ManagerAcertijo;
import com.company.model.Acertijo;
import com.company.model.Nivel1;
import com.company.model.PasarNivel;
import com.company.view.ViewNivel1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pregunta;
        String respuesta;
        boolean correcto;
        int puntaje;
        ViewNivel1 viewNivel1 = new ViewNivel1();
        ManagerAcertijo managerAcertijo = new ManagerAcertijo();
        Nivel1 nivel1 = new Nivel1();
        PasarNivel pasarNivel = new PasarNivel();
        Acertijo acertijo = new Acertijo();

        viewNivel1.mostrar();
        managerAcertijo.escaner();
        nivel1.cierto();
        pasarNivel.comprobar();

    }
}
