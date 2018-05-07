package com.company.View;

public class PantallaElegirNivel {
    public void mostrar() {
        Menu menu = new Menu();

        menu.mostrarTitulo();
        menu.mostrarDescripcion();

        String opcion = menu.mostrarMenu();
        if ("a".equals(opcion)) {
            PantallaNivel1 pantallaNivel1 = new PantallaNivel1();
            pantallaNivel1.mostrar();
            pantallaNivel1.mostrarPalabra1();
            pantallaNivel1.mostrarPalabra2();
            pantallaNivel1.mostrarPalabra3();

        }else if ("b".equals(opcion)) {
                PantallaNivel2 pantallaNivel2 = new PantallaNivel2();
                pantallaNivel2.mostrar();

        }else if ("c".equals(opcion)) {
            PantallaNivel3 pantallaNivel3 = new PantallaNivel3();
            pantallaNivel3.mostrar();

        } else if ("d".equals(opcion)) {
            System.out.println("ADIOS, HAS SALIDO DEL JUEGO");
        }
    }
}
