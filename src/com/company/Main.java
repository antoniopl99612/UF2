package com.company;

import com.company.manager.ManagerAcertijo;
import com.company.manager.Nivel1;
import com.company.manager.Nivel2;
import com.company.manager.PasarNivel;
import com.company.view.MostrarPuntuación;
import com.company.view.ViewNivel1;
import com.company.view.ViewNivel2;
import com.company.view.ViewTitulo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ViewTitulo viewTitulo = new ViewTitulo();
        ViewNivel1 viewNivel1 = new ViewNivel1();
        ManagerAcertijo managerAcertijo = new ManagerAcertijo();
        Nivel1 nivel1 = new Nivel1();
        PasarNivel pasarNivel = new PasarNivel();
        ViewNivel2 viewNivel2 = new ViewNivel2();
        Nivel2 nivel2 = new Nivel2();
        MostrarPuntuación mostrarPuntuación = new MostrarPuntuación();


        mostrarPuntuación.scoreActual();

        viewTitulo.mostrar();
        viewNivel1.mostrar();
        managerAcertijo.escaner1();
        nivel1.cierto();
        pasarNivel.comprobar();

        viewTitulo.mostrar();
        viewNivel2.mostrar();
        managerAcertijo.escaner2();
        nivel2.cierto();
        pasarNivel.comprobar();


    }
}
