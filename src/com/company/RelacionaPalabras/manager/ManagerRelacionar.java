package com.company.RelacionaPalabras.manager;


import com.company.RelacionaPalabras.model.Nivel;

public class ManagerRelacionar {

    public Nivel[] niveles = new Nivel[11];

    public void crearNiveles(){

        niveles[0] = new Nivel();
        niveles[0].palabras = "RATON - TECLADO - USB";
        niveles[0].respuesta = "ORDENADOR";

        niveles[1] = new Nivel();
        niveles[1].palabras = "TORRE EIFFEL - POGBA - LA MARSSELLESA";
        niveles[1].respuesta = "FRANCIA";

        niveles[2] = new Nivel();
        niveles[2].palabras = "ESTUDIAR - APROBAR - NOTAS";
        niveles[2].respuesta = "COLEGIO";

        niveles[3] = new Nivel();
        niveles[3].palabras = "COMIDA - BEBIDA - PAGAR";
        niveles[3].respuesta = "RESTAURANTE";

        niveles[4] = new Nivel();
        niveles[4].palabras = "PELOTA - CHUTAR - MARCAR";
        niveles[4].respuesta = "FUTBOL";

        niveles[5] = new Nivel();
        niveles[5].palabras = "TIRAR - ENCESTAR - TRIPLE";
        niveles[5].respuesta = "BASQUET";

        niveles[6] = new Nivel();
        niveles[6].palabras = "PANTALLA - IMAGEN - ANUNCIOS";
        niveles[6].respuesta = "TV";

        niveles[7] = new Nivel();
        niveles[7].palabras = "PUERTA - VOLANTE - EMBRAGUE";
        niveles[7].respuesta = "COCHE";

        niveles[8] = new Nivel();
        niveles[8].palabras = "COMIDA - BEBIDA - PAGAR";
        niveles[8].respuesta = "RESTAURANTE";

        niveles[9] = new Nivel();
        niveles[9].palabras = "PEDAL - CASCO - RUEDAS";
        niveles[9].respuesta = "MOTO";

        niveles[10] = new Nivel();
        niveles[10].palabras = "DIVERSION - ALCHOL - GENTE";
        niveles[10].respuesta = "FIESTA";


    }

    public Nivel[] obtenerNiveles() {

        return niveles;
    }
}