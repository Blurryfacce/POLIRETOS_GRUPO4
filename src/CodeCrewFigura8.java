/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una figura de una escalera hacia la izquierda
* @author Jhordy Parra
*/
public class CodeCrewFigura8 {
/**
     * Este método imprime una figura Escalonada hacia la Izquierda
     * 
     * @param tamanoFigura este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarFigura8(int tamanoFigura) {
        System.out.println();
        for (int i = 0; i < tamanoFigura; i++) {
            for (int j = i; j < tamanoFigura; j++) {
                if(j==tamanoFigura-1)
                    System.out.print("__|");
                else
                    System.err.print("   ");
            }
            System.out.println();
        }
    }
}
