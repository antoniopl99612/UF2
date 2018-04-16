package com.company.manager;

import com.company.model.Acertijo;

import java.util.Scanner;

public class ManagerAcertijo {

    public void escaner() {

        Scanner scanner = new Scanner(System.in);
        Acertijo acertijo = new Acertijo();
        acertijo.respuesta = scanner.nextLine();

    }
}
