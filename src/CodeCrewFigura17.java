/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una figura de una X, que va intercambiando entre numeros 1 y 0
* @author Jhordy Parra
*/
public class CodeCrewFigura17 {
    /**
     * Este método imprime una figura de una letra X, intercambiando entre numeros 1 y 0
     * 
     * @param tamanoFigura este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarFigura17(int tamanoFigura) {
        int a = 1;

        for (int i = 1; i <= tamanoFigura; i++) {
            char signo;

            if (a % 2 == 0) {
                signo = '0';
            } 
            else {
                signo = '1';
            }
            for (int j = 1; j <= tamanoFigura; j++) {
                if (j == i || j == (tamanoFigura - i + 1)) {
                    System.out.print(signo + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            a++;
        }
        System.out.println();
    }
}
