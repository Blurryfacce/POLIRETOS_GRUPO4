/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una suma de dos numeros mediante recursión
* @author Jhordy Parra
*/
public class CodeCrewRecursion2 {
    /**
     * Este método crear una suma de dos numeros mediante recursion
     * 
     * @param a Primer número a sumar
     * @param b Segundo número a sumar
     * @return La suma de a y b
     */
    public int sumaRecursion(int a, int b){
        if (b == 0) {
            System.out.println();
            System.out.println("Suma a + b = " + a);
            System.out.println();
            return a;
        } 
        else {
            return sumaRecursion(a + 1, b - 1);
        }
    }
}
