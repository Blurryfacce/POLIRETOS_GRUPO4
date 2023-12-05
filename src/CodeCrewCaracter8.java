/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */

public class CodeCrewCaracter8 {
    /**
     * <b>showSerieCaracter </b> muestra la serie usando el ciclo For a  bbb  ccccc  ddddddd eeeeeeeee...
     * @param numeroVeces : Número de términos para la serie
     */
    public void showSerieCaracter8(int numeroVeces) {
        char letra = 'a';
        for (int i = 1; i <= numeroVeces; i++) {
            for (int j = 1; j <= 2*i-1; j++)
                System.out.print(letra);
            System.out.print(" ");
            letra = (letra != 'z') ? ++letra : 'a';
        }
    }
}