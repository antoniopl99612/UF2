package com.company.view;

public class PantallaElegirNivel {
    public void mostrar() {
        Menu menu = new Menu();

        menu.mostrarTitulo();
        menu.mostrarDescripcion();

        String opcion = menu.mostrarMenu();
        if ("a".equals(opcion)) {
            PantallaNivel1 pantallaNivel1 = new PantallaNivel1();
            pantallaNivel1.mostrar();
        } else if ("b".equals(opcion)) {
            System.out.println("ADIOS, HAS SALIDO DEL JUEGO");
        }
    }
}
