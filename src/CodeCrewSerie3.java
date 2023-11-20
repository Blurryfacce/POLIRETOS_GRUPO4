/*
 * Copyright (C) 2023, Angel Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * Version 1.0
 */

// Clase que genera una serie fraccional con numeradores Fibonacci y denominadores impares
public class CodeCrewSerie3 {
    /**
     * Este método imprime la serie fraccional con numeradores Fibonacci y denominadores impares utilizando un bucle for.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */ 
    public void mostrarSerie3For(int numeroVeces) {
        int a = 0, b = 1;
        
        for (int i = 1; i <= numeroVeces; i++) {
            System.out.print(a + "/" + (i * 2 - 1) + " ");
            int c = a + b;
            a = b;
            b = c;    
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie fraccional con numeradores Fibonacci y denominadores impares utilizando un bucle while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie3While(int numeroVeces) {
        int a = 0, b = 1;
        int i = 1;

        while (i <= numeroVeces) {
            System.out.print(a + "/" + (i * 2 - 1) + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie fraccional con numeradores Fibonacci y denominadores impares utilizando un bucle do-while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie3DoWhile(int numeroVeces) {
        int a = 0, b = 1;
        int i = 1;

        do {
            System.out.print(a + "/" + (i * 2 - 1) + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i <= numeroVeces);

        System.out.println();
    }
}
