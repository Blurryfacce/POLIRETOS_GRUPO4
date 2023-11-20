/* Copyright (C) 2023, Ruth Rueda
 * (CodeCrew), ruth.rueda@epn.edu.ec
 * Versión 1.0
 */

public class CodeCrewSerie1 {
    /**
     * <b>showSerie </b> muestra la serie usando el ciclo For  0 1 1 2 3 5 8 13 ...
     * @param numeroVeces : Número de términos para la serie
     */
    public void showSerie1For(int numeroVeces){ 
        int anterior = 0, actual = 1, siguiente; 
        for (int i = 0; i < numeroVeces; i++) {
            System.out.print(anterior + " ");
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
        System.out.println();
    }

    /**
     * <b>showSerie </b> muestra la serie usando el ciclo DoWhile  0 1 1 2 3 5 8 13 ...
     * @param numeroVeces : Número de términos para la serie
     */
    public void showSerie1DoWhile(int numeroVeces){ 
        int i = 0, anterior = 0, actual = 1, siguiente; 
        do {
            System.out.print(anterior + " ");
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        } while (++i < numeroVeces);
        System.out.println();
    }

    /**
     * <b>showSerie </b> muestra la serie usando el ciclo While  0 1 1 2 3 5 8 13 ...
     * @param numeroVeces : Número de términos para la serie
     */
    public void showSerie1While(int numeroVeces){ 
        int i = 0, anterior = 0, actual = 1, siguiente; 
        while (i < numeroVeces) {
            System.out.print(anterior + " ");
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
            i++;
        }
        System.out.println();
    }
}
