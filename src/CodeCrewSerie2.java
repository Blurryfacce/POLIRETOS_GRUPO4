/* Copyright (C) 2023, Ángel Pastaz y Ruth Rueda
 * (CodeCrew), angel.pastaz@epn.edu.ec, ruth.rueda@epn.edu.ec
 * Versión 1.0
 */

public class CodeCrewSerie2 {
    /**
     * <b>showSerie </b> muestra la serie usando el ciclo For  1 0 3 0 5 0 7 0 9 ...
     * @param numeroVeces : Número de términos para la serie
     */
    public void showSerie2For(int numeroVeces){ 
        for (int i = 1; i <= numeroVeces; i++) {
            // if(i % 2 == 0)
                // System.out.print(0 + " ");
            // else
                // System.out.print(i + " ");
            System.out.print((i % 2 == 0) ? 0 + " " : i + " " );
        }
        System.out.println();
    }

}