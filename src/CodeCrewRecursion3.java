/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

import java.util.Scanner;

// Clase que utiliza un metodo recursivo para obtener la multiplicación de dos
// números
public class CodeCrewRecursion3 {
    Scanner sc = new Scanner(System.in);

    /**
     * Este método pide dos números y los multiplica recursivamente
     */
    public void mostrarRecursion3() {
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = multiplicarRecursivo(num1, num2);

        System.out.println("\nEl resultado de la multiplicación es: " + resultado + "\n");
    }

    /**
     * Método recursivo para multiplicar dos números
     * 
     * @param a primer número a multiplicar
     * @param b segundo número a multiplicar
     */
    private int multiplicarRecursivo(int a, int b) {
        // Caso base: si alguno de los números es 0, el resultado es 0
        if (a == 0 || b == 0)
            return 0;

        return multiplicarRecursivo(a - 1, b) + b;
    }
}