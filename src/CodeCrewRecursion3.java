/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase que utiliza un metodo recursivo para obtener la multiplicación de dos
// números
public class CodeCrewRecursion3 {
    Scanner sc = new Scanner(System.in);

    /**
     * Este método toma dos números enteros y evita el ingreso de carácteres no
     * deseados
     */
    public void mostrarRecursion3() {
        try {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            int resultado = multiplicarRecursivo(num1, num2);

            System.out.println("\nEl resultado de la multiplicación es: " + resultado + "\n");
        } catch (InputMismatchException  e) {
            System.out.println("Error: Ingrese números válidos.");
            sc.next();
            mostrarRecursion3();
        }
    }

    /**
     * Este método realiza la recursión y maneja casos con números negativos
     * 
     * @param a representa el primer número ingresado
     * @param b representa el segundo número ingresado
     */
    private int multiplicarRecursivo(int a, int b) {
        if (a == 0 || b == 0)
            return 0;

        if (a < 0 && b < 0) {
            a = -a;
            b = -b;
        } else if (a < 0 || b < 0)
            return -(multiplicarRecursivo(Math.abs(a), Math.abs(b)));

        return multiplicarRecursivo(a - 1, b) + b;
    }
}