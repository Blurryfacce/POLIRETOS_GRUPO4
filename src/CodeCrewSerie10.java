/*
 * Copyright (C) 2k23, Sebastian Sarasti y Sebastian Ramos
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec, sebastian.ramos@epn.edu.ec
 * Version 1.0
 */
//S10: 3, 9, 27, 81, 243, 729, 2187, ...

public class CodeCrewSerie10 {
    public void mostrarSerie10For(int numeroVeces) {
        // Inicialización del bucle----Condición---- Razón de aumento
        for (int numImprimir = 3; numeroVeces > 0; numeroVeces--, numImprimir *= 3) {
            System.out.print(numImprimir + " ");
        }
        System.out.println();
    }

    public void mostrarSerie10DoWhile(int numeroVeces) {
        short numImprimir = 3;// Numero a imprimir se inicia en 3 por la naturaleza de la secuencia
        do {
            System.out.print(numImprimir + " ");
            numImprimir *= 3;
        } while (--numeroVeces > 0);
        System.out.println();
    }

    public void mostrarSerie10While(int numeroVeces) {
        short numImprimir = 3;// Numero a imprimir se inicia en 3 por la naturaleza de la secuencia
        while (--numeroVeces >= 0) {
            System.out.print(numImprimir + " ");
            numImprimir *= 3;
        }
        System.out.println();
    }
}