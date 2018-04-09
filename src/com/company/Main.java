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
        ViewNivel1 v1 = new ViewNivel1();
        ManagerAcertijo man = new ManagerAcertijo();
        Nivel1 n1 = new Nivel1();
        PasarNivel pnv = new PasarNivel();
        Acertijo ac = new Acertijo();

        v1.mostrar();
        man.escaner();
        n1.cierto();
        pnv.comprobar();

    }
}
