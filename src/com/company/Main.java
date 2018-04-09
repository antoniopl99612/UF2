package com.company;

import com.company.manager.ManagerRelacionar;
import com.company.manager.ManagerUsuarios;
import com.company.view.PantallaAcceder;
import com.company.view.PantallaRegistro;
import com.company.view.PantallaRelacionarPalabras;

public class Main {

    public static void main(String[] args) {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();


//        PantallaRegistro pantallaRegistro = new PantallaRegistro();
//        pantallaRegistro.iniciar(managerUsuarios);
//
//        PantallaAcceder pantallaAcceder = new PantallaAcceder();
//        pantallaAcceder.iniciar(managerUsuarios);


        ManagerRelacionar managerRelacionar = new ManagerRelacionar();
        managerRelacionar.crearNiveles();


        PantallaRelacionarPalabras pantallaRelacionar = new PantallaRelacionarPalabras();
        pantallaRelacionar.iniciar(managerRelacionar);
    }
}
