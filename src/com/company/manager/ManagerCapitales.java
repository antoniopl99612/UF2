package com.company.manager;

import com.company.model.Capital;
import com.company.model.Nivel;

import java.util.Random;

public class ManagerCapitales {

    public Capital[] capitales = new Capital[50];

    public void añadirCapitales(){

        añadirCapital("Afganistan", "Kabul");
        añadirCapital("Alemania", "Berlin");
        añadirCapital("Argentina", "Buenos Aires");
        añadirCapital("Belgica", "Bruselas");
        añadirCapital("Brasil", "Brasilia");
        añadirCapital("Bolivia", "Sucre");
        añadirCapital("Catar", "Doha");
        añadirCapital("Cuba", "La Habana");
        añadirCapital("Mónaco", "Mónaco");
        añadirCapital("Noruega", "Oslo");
        añadirCapital("Portugal", "Lisboa");
        añadirCapital("Irlanda", "Dublín");



//
//        capitales[6] = new Capital();
//        capitales[6].pais = "Catar";
//        capitales[6].nombre = "Doha";
//
//        capitales[7] = new Capital();
//        capitales[7].pais = "Colombia";
//        capitales[7].nombre = "Bogota";
//
//        capitales[8] = new Capital();
//        capitales[8].pais = "Cuba";
//        capitales[8].nombre = "La Habana";
//
//        capitales[9] = new Capital();
//        capitales[9].pais = "Dinamarca";
//        capitales[9].nombre = "Copenhague";
//
//        capitales[10] = new Capital();
//        capitales[10].nombre = "Dominica";
//        capitales[10].nombre = "Roseau";
//
//        capitales[11] = new Capital();
//        capitales[11].pais = "Egipto";
//        capitales[11].nombre = "El Cairo";
//
//        capitales[12] = new Capital();
//        capitales[12].pais = "España";
//        capitales[12].nombre = "Madrid";
//
//        capitales[13] = new Capital();
//        capitales[13].pais = "Estados Unidos";
//        capitales[13].nombre = "Washington";
//
//        capitales[14] = new Capital();
//        capitales[14].pais = "Filipinas";
//        capitales[14].nombre = "Manila";
//
//        capitales[15] = new Capital();
//        capitales[15].pais = "Finlandia";
//        capitales[15].nombre = "Helsinki";
//
//        capitales[16] = new Capital();
//        capitales[16].pais = "Francia";
//        capitales[16].nombre = "Paris";
//
//        capitales[17] = new Capital();
//        capitales[17].pais = "Gambia";
//        capitales[17].nombre = "Banjul";
//
//        capitales[18] = new Capital();
//        capitales[18].pais = "Grecia";
//        capitales[18].nombre = "Atenas";
//
//        capitales[19] = new Capital();
//        capitales[19].pais = "Hungría";
//        capitales[19].nombre = "Budapest";
//
//        capitales[20] = new Capital();
//        capitales[20].nombre = "Irlanda";
//        capitales[20].nombre = "Dublín";
//
//        capitales[21] = new Capital();
//        capitales[21].pais = "Israel";
//        capitales[21].nombre = "Kabul";
//
//        capitales[22] = new Capital();
//        capitales[22].pais = "Afganistan";
//        capitales[22].nombre = "Jerusalén";
//
//        capitales[23] = new Capital();
//        capitales[23].pais = "Italia";
//        capitales[23].nombre = "Roma";
//
//        capitales[24] = new Capital();
//        capitales[24].pais = "Jamaica";
//        capitales[24].nombre = "Kingston";
//
//        capitales[25] = new Capital();
//        capitales[25].pais = "Japón";
//        capitales[25].nombre = "Tokio";
//
//        capitales[26] = new Capital();
//        capitales[26].pais = "Mauritania";
//        capitales[26].nombre = "Nuakchot";
//
//        capitales[27] = new Capital();
//        capitales[27].pais = "Mónaco";
//        capitales[27].nombre = "Mónaco";
//
//        capitales[28] = new Capital();
//        capitales[28].pais = "Noruega";
//        capitales[28].nombre = "Oslo";
//
//        capitales[29] = new Capital();
//        capitales[29].pais = "Panamá";
//        capitales[29].nombre = "Panamá";
//
//        capitales[30] = new Capital();
//        capitales[30].nombre = "Perú";
//        capitales[30].nombre = "Lima";
//
//        capitales[31] = new Capital();
//        capitales[31].pais = "Polonia";
//        capitales[31].nombre = "Varsovia";
//
//        capitales[32] = new Capital();
//        capitales[32].pais = "Portugal";
//        capitales[32].nombre = "Lisboa";
//
//        capitales[33] = new Capital();
//        capitales[33].pais = "República Checa";
//        capitales[33].nombre = "Praga";
//
//        capitales[34] = new Capital();
//        capitales[34].pais = "República Dominicana";
//        capitales[34].nombre = "Santo Domingo";
//
//        capitales[35] = new Capital();
//        capitales[35].pais = "Rusia";
//        capitales[35].nombre = "Moscú";
//
//        capitales[36] = new Capital();
//        capitales[36].pais = "Senegal";
//        capitales[36].nombre = "Dakar";
//
//        capitales[37] = new Capital();
//        capitales[37].pais = "Siria";
//        capitales[37].nombre = "Damasco";
//
//        capitales[38] = new Capital();
//        capitales[38].pais = "Ucrania";
//        capitales[38].nombre = "Kiev";
//
//        capitales[39] = new Capital();
//        capitales[39].pais = "Venezuela";
//        capitales[39].nombre = "Caracas";
//
//        capitales[40] = new Capital();
//        capitales[40].nombre = "Vietnam";
//        capitales[40].nombre = "Hanói";
//
//        capitales[41] = new Capital();
//        capitales[41].pais = "Yemen";
//        capitales[41].nombre = "Saná";
//
//        capitales[42] = new Capital();
//        capitales[42].pais = "Zambia";
//        capitales[42].nombre = "Lusaka";
//
//        capitales[43] = new Capital();
//        capitales[43].pais = "Zimbabue";
//        capitales[43].nombre = "Harare";
//
//        capitales[44] = new Capital();
//        capitales[44].pais = "China";
//        capitales[44].nombre = "Pekín";
//
//        capitales[45] = new Capital();
//        capitales[45].pais = "Kuwait";
//        capitales[45].nombre = "Kuwait";
//
//        capitales[46] = new Capital();
//        capitales[46].pais = "Luxemburgo";
//        capitales[46].nombre = "Luxemburgo";
//
//        capitales[47] = new Capital();
//        capitales[47].pais = "Malí";
//        capitales[47].nombre = "Rabat";
//
//        capitales[48] = new Capital();
//        capitales[48].pais = "Marruecos";
//        capitales[48].nombre = "Kabul";
//
//        capitales[49] = new Capital();
//        capitales[49].pais = "Túnez";
//        capitales[49].nombre = "Túnez";
//
//        capitales[50] = new Capital();
//        capitales[50].pais = "Países Bajos";
//        capitales[50].nombre = "Amsterdam";
    }

    public Capital[] obtenerPaises() {
        return capitales;
    }

    public String obtenerPaisAleatorio(){
        Random random = new Random();
        int aleatorio = random.nextInt(capitales.length);

        return capitales[aleatorio].pais;
    }

    public boolean comprobarCapital(String papa, String mama){
        return true;
    }


    public void añadirCapital(String pais, String nombre){
        Capital capital = new Capital();
        capital.nombre = nombre;
        capital.pais = pais;

        // añadir "capital" al array capitales

    }
}
