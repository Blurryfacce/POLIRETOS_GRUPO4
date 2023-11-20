/*
 * Copyright (C) 2023, Angel Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * Version 1.0
 */

// Clase que genera la serie de Fibonacci.
public class CodeCrewSerie1 {
    /**
     * Este método imprime la serie de Fibonacci utilizando un bucle for.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie1For(int numeroVeces) {
        int a = 0, b = 1;
        
        for (int i = 0; i < numeroVeces; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie de Fibonacci utilizando un bucle while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie1While(int numeroVeces) {
        int a = 0, b = 1;
        int i = 0;

        while (i < numeroVeces) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie de Fibonacci utilizando un bucle do-while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie1DoWhile(int numeroVeces) {
        int a = 0, b = 1;
        int i = 0;

        do {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < numeroVeces);

        System.out.println();
    }
}
