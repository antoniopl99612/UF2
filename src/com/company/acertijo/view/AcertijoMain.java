package com.company.acertijo.view;

import com.company.acertijo.manager.*;

public class AcertijoMain {
    public void show(){
        ViewTitulo viewTitulo = new ViewTitulo();
        ViewNivel1 viewNivel1 = new ViewNivel1();
        ManagerAcertijo managerAcertijo = new ManagerAcertijo();
        Nivel1 nivel1 = new Nivel1();
        PasarNivel pasarNivel = new PasarNivel();
        ViewNivel2 viewNivel2 = new ViewNivel2();
        Nivel2 nivel2 = new Nivel2();
        MostrarPuntuación mostrarPuntuación = new MostrarPuntuación();

        ViewNivel3 viewNivel3 = new ViewNivel3();
        Nivel3 nivel3 = new Nivel3();
        Nivel4 nivel4 = new Nivel4();
        ViewNivel4 viewNivel4 = new ViewNivel4();

        mostrarPuntuación.scoreActual(); //muestra la score actual para el usuario registrado en el juego Acertijo

        viewTitulo.mostrar();

        viewNivel1.mostrar();
        managerAcertijo.escaner1();
        nivel1.cierto();
        pasarNivel.comprobar();

        viewNivel2.mostrar();
        managerAcertijo.escaner2();
        nivel2.cierto();
        pasarNivel.comprobar();

        viewNivel3.mostrar();
        managerAcertijo.escaner3();
        nivel3.cierto();
        pasarNivel.comprobar();

        viewNivel4.mostrar();
        managerAcertijo.escaner4();
        nivel4.cierto();
        pasarNivel.comprobar();
    }
}
