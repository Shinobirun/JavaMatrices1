package matricesJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Una matriz de 5 filas x 3 columnas almacena el total de goles de 5 jugadores de futbol en los últimos
        // 3 partidos que jugaron, donde cada fila representa a un jugador y cada columna a la cantidad de goles
        // que hizo. Se necesita un programa que sea capaz de permitir la carga de los goles, calcular el
        // promedio de goles realizado por cada jugador y almacenar el resultado en un vector de 5 posiciones,
        // donde cada posición representará a un jugador. Tener en cuenta el siguiente diagrama para llevar a
        // cabo el planteo

        PromedioGoles goles3 = new PromedioGoles();

        goles3.ingrGoles(goles3.jugGo);
        goles3.promGol(goles3.jugGo);
        goles3.imprimirPromedios(goles3.prom);






    }

}