/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una suma de dos numeros mediante recursión
* @author Jhordy Parra
*/
public class CodeCrewRecursion6 {
    /**
     * Este método realiza un conteo regresivo mostrando el proceso
     * 
     * @param numConteo este parámetro permite limitar el conteo a un numero de
     *                  elementos
     */
    public void mostrarConteoRegresivo(int numConteo) {
        if (numConteo <= 0) {
            System.out.println(numConteo);
            System.out.println();
            System.out.println("Conteo Finalizado");
        } else {
            System.out.print(numConteo + " , ");
            mostrarConteoRegresivo(numConteo - 1);
        }
    }
}
