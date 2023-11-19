/*
 * Copyright (C) 2k23, Sebastian Sarasti
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
//Esta clase genera una serie la cual se incrementa de 5 en 5 y empieza en 3
public class CodeCrewSerie8 {
    /**
     * Este método imprime la serie mediante un For
     * 
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarSerie8For(int numeroVeces) {
        // Inicialización del bucle----Condición---- Razón de aumento
        for (short numImprimir = 3; numeroVeces > 0; numeroVeces--, numImprimir += 5) {
            System.out.print(numImprimir + " ");
        }
        System.out.println();
    }

    /**
     * Este método imprime la serie mediante un DO While
     * 
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarSerie8DoWhile(int numeroVeces) {
        short numImprimir = 3;// Numero a imprimir se inicia en 3 por la naturaleza de la secuencia
        do {
            System.out.print(numImprimir + " ");
            numImprimir += 5;
        } while (--numeroVeces > 0);
        System.out.println();
    }

    /**
     * Este método imprime la serie mediante un While
     * 
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarSerie8While(int numeroVeces) {
        short numImprimir = 3;// Numero a imprimir se inicia en 3 por la naturaleza de la secuencia
        while (--numeroVeces >= 0) {
            System.out.print(numImprimir + " ");
            numImprimir += 5;
        }
        System.out.println();
    }
}