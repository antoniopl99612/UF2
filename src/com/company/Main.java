package com.company;

import com.company.main.manager.ManagerUsuarios;
import com.company.main.view.MenuPrincipal;
import com.company.main.view.Mostrarpuntuacion;
import com.company.main.view.PantallaAcceder;
import com.company.main.view.PantallaRegistro;

public class Main {

    public static void main(String[] args) {
        ManagerUsuarios managerUsuarios = new ManagerUsuarios();

        PantallaRegistro pantallaRegistro = new PantallaRegistro();
        pantallaRegistro.iniciar(managerUsuarios);

        PantallaAcceder pantallaAcceder = new PantallaAcceder();
        pantallaAcceder.iniciar(managerUsuarios);

        new MenuPrincipal().show();

        Mostrarpuntuacion mostrarpuntuacion = new Mostrarpuntuacion();
        mostrarpuntuacion.mostrar();
    }
}