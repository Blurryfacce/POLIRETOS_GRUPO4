/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

import java.util.Scanner;

// Clase que simula una carga carga
public class CodeCrewLoading2 {
    Scanner sc = new Scanner(System.in);

    /**
     * Este método pide un carácter y simula una barra de carga con este
     */
    public void mostrarLoading2() throws InterruptedException {
        System.out.print("Ingresa el carácter de carga\n(sólo se aceptará el primer carácter ingresado): ");
        char caracter = sc.next().charAt(0);

        int porcentaje = 0;

        System.out.println();
        while (porcentaje <= 100) {
            int longitudBarra = porcentaje / 5,
                espacios = 20 - longitudBarra;

            System.out.print("[");
            for (int i = 0; i < longitudBarra; i++)
                System.out.print(caracter);

            for (int i = 0; i < espacios; i++)
                System.out.print(" ");

            System.out.print("] " + porcentaje + "%\r");
            Thread.sleep(100);
            porcentaje += 5;
        }

        System.out.println("\n");
    }
}