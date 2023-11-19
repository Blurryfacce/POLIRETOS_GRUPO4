/*
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

// Clase que genera una serie fraccional con numeradores Fibonacci y denominadores que aumentan en 2.
public class CodeCrewSerie4 {
    /**
     * Este método imprime la serie utilizando un bucle for.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie4For(int numeroVeces) {
        int anterior = 0, actual = 1, siguiente,    // Variables referentes al numerador
            denominador = 2;

        for (int i = 0; i < numeroVeces; i++) {
            System.out.print(anterior + "/" + denominador + " ");
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
            denominador += 2;
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie utilizando un bucle do-while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie4DoWhile(int numeroVeces) {
        int anterior = 0, actual = 1, siguiente,    // Variables referentes al numerador
            denominador = 2, i = 0;

        do {
            System.out.print(anterior + "/" + denominador + " ");
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
            denominador += 2;
            i++;
        } while(i < numeroVeces);

        System.out.println();
    }

    /**
     * Este método imprime la serie utilizando un bucle while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie4While(int numeroVeces) {
        int anterior = 0, actual = 1, siguiente,    // Variables referentes al numerador
            denominador = 2, i = 0;

         while(i < numeroVeces) {
            System.out.print(anterior + "/" + denominador + " ");
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
            denominador += 2;
            i++;
        }

        System.out.println();
    }
}
