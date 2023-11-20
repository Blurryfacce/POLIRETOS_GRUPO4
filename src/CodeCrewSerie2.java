/*
 * Copyright (C) 2023, Angel Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * Version 1.0
 */

// Clase que genera la serie 1 0 3 0 5 0 7...
public class CodeCrewSerie2 {
    /**
     * Este método imprime la serie 1 0 3 0 5 0 7... utilizando un bucle for.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie2For(int numeroVeces) {

        for (int i = 0; i < numeroVeces; i++) {
            int num = i;
            if (num%2==0) {
                System.out.print(" 0 ");
            }
            else{
                System.out.print(num);
            }
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie 1 0 3 0 5 0 7... utilizando un bucle while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie2While(int numeroVeces) {
        int i = 0;

        while (i < numeroVeces) {
            int num = i;
            if (num%2==0) {
                System.out.print(" 0 ");
            }
            else{
                System.out.print(num);
            }
            i++;
        }

        System.out.println();
    }

    /**
     * Este método imprime la serie 1 0 3 0 5 0 7... utilizando un bucle do-while.
     * 
     * @param numeroVeces parámetro que limita la serie a un número específico de
     *                    elementos.
     */
    public void mostrarSerie2DoWhile(int numeroVeces) {
        int i = 0;

        do {
            int num = i;
            if (num%2==0) {
                System.out.print(" 0 ");
            }
            else{
                System.out.print(num);
            }
            i++;
        } while (i < numeroVeces);

        System.out.println();
    }
}
