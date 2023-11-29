/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una figura de una escalera hacia la derecha
* @author Jhordy Parra
*/
public class CodeCrewFigura7 {
    /**
     * Este método imprime una figura Escalonada hacia la derecha
     * 
     * @param tamanoFigura este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarFigura7(int tamanoFigura) {
        System.out.println("__");
        for (int i = 1; i <= tamanoFigura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                if (j == i) {
                    System.out.print("|");
                }
                if (i == j) {
                    System.out.print("__");
                }
                else {   
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
