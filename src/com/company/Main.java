package com.company;

import com.company.manager.ManagerAcertijo;
import com.company.model.Acertijo;
import com.company.model.Nivel1;
import com.company.model.PasarNivel;
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
        Acertijo acertijo = new Acertijo();
        ViewNivel2 v = new ViewNivel2();

        viewTitulo.mostrar();
        viewNivel1.mostrar();
        managerAcertijo.escaner();
        nivel1.cierto();
        pasarNivel.comprobar();
        System.out.println(acertijo.respuesta);
        if (acertijo.puntaje <= 0){
            System.out.println("GAME OVER");
        } else {
            v.mostrar();
        }
        System.out.println(acertijo.puntaje);
    }
}
