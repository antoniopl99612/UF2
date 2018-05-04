package com.company.acertijo.manager;

import com.company.acertijo.model.Acertijo1;
import com.company.acertijo.model.Acertijo2;
import com.company.acertijo.model.Acertijo3;
import com.company.acertijo.model.Acertijo4;

import java.util.Scanner;

public class ManagerAcertijo {

    public void escaner1() {

        Scanner scanner = new Scanner(System.in);
        Acertijo1 acertijo1 = new Acertijo1();
        acertijo1.respuesta = scanner.nextLine();


    }
    public void escaner2() {

        Scanner scanner = new Scanner(System.in);
        Acertijo2 acertijo2 = new Acertijo2();
        acertijo2.respuesta = scanner.nextLine();

    }
    public void escaner3() {

        Scanner scanner = new Scanner(System.in);
        Acertijo3 acertijo3 = new Acertijo3();
        acertijo3.respuesta = scanner.nextLine();

    }

    public void escaner4() {

        Scanner scanner = new Scanner(System.in);
        Acertijo4 acertijo4 = new Acertijo4();
        acertijo4.respuesta = scanner.nextLine();

    }
}
