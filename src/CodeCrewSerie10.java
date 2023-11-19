/*
 * Copyright (C) 2k23, Sebastian Sarasti y Sebastian Ramos
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec, sebastian.ramos01@epn.edu.ec
 * Version 1.0
 */
//S10: 3, 9, 27, 81, 243, 729, 2187, ...
//Esta clase realiza una secuencia que empieza en el 3 y va multiplicando por 3.
public class CodeCrewSerie10 {
    /**
     * Este método imprime la serie mediante el ciclo For
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     * elementos
     */
    public void mostrarSerie10For(int numeroVeces) {
        
        // Inicialización del bucle----Condición---- Razón de aumento
        for (int numImprimir = 3; numeroVeces > 0; numeroVeces--, numImprimir *= 3) {
            System.out.print(numImprimir + " ");
        }
        System.out.println();
    }
    /**
     * Este método imprime la serie mediante el ciclo DoWhile
     * @param numeroVeces este parámetro permite limitar la serie a un numero de elementos
     */
    public void mostrarSerie10DoWhile(int numeroVeces) {
        short numImprimir = 3;// Numero a imprimir se inicia en 3 por la naturaleza de la secuencia
        do {
            System.out.print(numImprimir + " ");
            numImprimir *= 3;
        } while (--numeroVeces > 0);
        System.out.println();
    }
     /**
     * Este método imprime la serie mediante el ciclo While
     * @param numeroVeces este parámetro permite limitar la serie a un numero de elementos
     */
    public void mostrarSerie10While(int numeroVeces) {
        short numImprimir = 3;// Numero a imprimir se inicia en 3 por la naturaleza de la secuencia
        while (--numeroVeces >= 0) {
            System.out.print(numImprimir + " ");
            numImprimir *= 3;
        }
        System.out.println();
    }
}
