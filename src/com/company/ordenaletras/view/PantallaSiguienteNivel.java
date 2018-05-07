package com.company.ordenaletras.view;

public class PantallaSiguienteNivel {
    public void mostrar() {
        MenuContinuarNivel menuContinuarNivel = new MenuContinuarNivel();
        menuContinuarNivel.mostrarContinuar();
        String opcion2 = menuContinuarNivel.mostrarContinuar();

        if ("a".equals(opcion2)) {
            PantallaNivel2 pantallaNivel2 = new PantallaNivel2();
            pantallaNivel2.mostrar();

        } else if ("b".equals(opcion2)) {
            PantallaNivel1 pantallaNivel1 = new PantallaNivel1();
            pantallaNivel1.mostrar();
            pantallaNivel1.mostrarPalabra1();
            pantallaNivel1.mostrarPalabra1();
            pantallaNivel1.mostrarPalabra2();
        } else if ("c".equals(opcion2)) {
            System.out.println("ADIOS, HAS SALIDO DEL JUEGO");
        }
    }
}
