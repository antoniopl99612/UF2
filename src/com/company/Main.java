package com.company;

import com.company.manager.ManagerUsuarios;
import com.company.view.PantallaAcceder;
import com.company.view.PantallaRegistro;

public class Main {

    public static void main(String[] args) {

        ManagerUsuarios managerUsuarios = new ManagerUsuarios();


        PantallaRegistro pantallaRegistro = new PantallaRegistro();
        pantallaRegistro.iniciar(managerUsuarios);

        PantallaAcceder pantallaAcceder = new PantallaAcceder();
        pantallaAcceder.iniciar(managerUsuarios);
    }
}
