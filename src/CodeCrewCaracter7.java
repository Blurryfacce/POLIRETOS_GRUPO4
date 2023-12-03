/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

// Clase que genera una serie de letras repetidas con longitudes de múltiplos de 2
public class CodeCrewCaracter7 {
    /**
     * Este método imprime la serie utilizando un bucle for.
     * @param numeroVeces limita la serie a un número específico de
     *                    elementos
     */
    public void mostrarSerieCaracter7(int numeroVeces) {
        char letra = 'a';
        for (int i = 0, numeroPar = 2; i < numeroVeces; i++, numeroPar += 2) {
            for (int j = 0; j < numeroPar; j++)
                System.out.print(letra);
            System.out.print(" ");
            letra = (letra != 'z') ? ++letra : 'a';
        }
    }
}
