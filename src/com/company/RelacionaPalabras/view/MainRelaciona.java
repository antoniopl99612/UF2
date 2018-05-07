package com.company.RelacionaPalabras.view;



import com.company.RelacionaPalabras.manager.ManagerRelacionar;
import com.company.RelacionaPalabras.view.PantallaRelacionarPalabras;

import java.util.Scanner;

public class MainRelaciona {
    public void show() {
        Scanner scanner = new Scanner(System.in);


        ManagerRelacionar managerRelacionar = new ManagerRelacionar();
        managerRelacionar.crearNiveles();


        PantallaRelacionarPalabras pantallaRelacionar = new PantallaRelacionarPalabras();
        pantallaRelacionar.iniciar(managerRelacionar);

    }

}