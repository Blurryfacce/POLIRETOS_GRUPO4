/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Clase que genera una serie multiplicativa a partir de un número inicial.
 */
public class CodeCrewSerie9 {
    public int numeroInicio = 2;
    int numeroSiguiente = this.numeroInicio;

    /**
     * Genera una serie multiplicativa utilizando un bucle for.
     * 
     * @param numeroVeces Número de veces que se generará la serie.
     */
    public void SerieFor(int numeroVeces) {
        int numeroSiguiente = this.numeroInicio;
        for (int i = 0; i < numeroVeces; i++) {
            System.out.print(numeroSiguiente + " ");
            numeroSiguiente *= 2;
        }
        System.out.println();
    }

    /**
     * Genera una serie multiplicativa utilizando un bucle do-while.
     * 
     * @param numeroVeces Número de veces que se generará la serie.
     */
    public void SeriDoWhile(int numeroVeces) {
        int i = 1;
        do {
            System.out.print(numeroSiguiente + " ");
            numeroSiguiente *= 2;
        } while (i++ < numeroVeces);
        System.out.println();
    }

    /**
     * Genera una serie multiplicativa utilizando un bucle while.
     * 
     * @param numeroVeces Número de veces que se generará la serie.
     */
    public void SerieWhile(int numeroVeces) {
        int i = 0;
        numeroSiguiente = this.numeroInicio;
        while (i++ < numeroVeces) {
            System.out.print(numeroSiguiente + " ");
            numeroSiguiente *= 2;
        }
        System.out.println();
    }

}
