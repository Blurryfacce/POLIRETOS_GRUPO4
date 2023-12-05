/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */

public class CodeCrewCaracter9 {
    /**
     * <b>showSerieCaracter </b> muestra la serie usando el ciclo For a  b  c  dd  eee  fffff  ...
     * @param numeroVeces : Número de términos para la serie
     */
    public void showSerieCaracter9(int numeroVeces) {
        int anterior = 1, actual = 1, siguiente;
        char letra = 'a';
        System.out.print(letra + " ");
        letra++;
        for (int i = 0; i < numeroVeces; i++) {
            for (int j = 0; j < anterior; j++)
                System.out.print(letra);
            System.out.print(" ");
            letra = (letra != 'z') ? ++letra : 'a';
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }
    }
}
