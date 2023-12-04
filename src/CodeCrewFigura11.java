/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

// Clase que genera una escalera de barras bajas con incremento horizontal hacia
// la derecha
public class CodeCrewFigura11 {
    /**
     * Este método imprime la serie utilizando un bucle for.
     * 
     * @param numeroVeces limita la serie a un número específico de
     *                    elementos
     */
    public void mostrarFigura11(int numeroVeces) {
        for (int nivel = 1; nivel <= numeroVeces; nivel++) {
            for (int espacios = 0; espacios < nivel * nivel - 1; espacios++)
                System.out.print(" ");
            System.out.print("|");
            for (int base = 0; base < nivel; base++)
                System.out.print(" _");
            System.out.println();
        }
        System.out.println();
    }
}
