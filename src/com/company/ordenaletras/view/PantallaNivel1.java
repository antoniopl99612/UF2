package com.company.ordenaletras.view;


import com.company.ordenaletras.model.Palabras;

public class PantallaNivel1 {


    public void mostrarN1() {

       Menu menu = new Menu();
       Palabras palabras = new Palabras();
       menu.mostrarTitulo();
       menu.mostrarDescripcion();
       menu.mostrarMenu();
       palabras.mostrarPalabras();

    }
}
