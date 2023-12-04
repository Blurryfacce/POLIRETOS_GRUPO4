/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

import java.util.Random;
import java.util.Scanner;

// Clase que crea una matriz cuadrada del tamaño de un nombre y coloca cada una
// de sus letra de forma aleatoria
public class CodeCrewArrays5 {
    Scanner sc = new Scanner(System.in);

    /**
     * Este método imprime la matriz
     */
    public void mostrarArray5() throws InterruptedException {
        String nombre;
        int longitudNombre;

        do {
            System.out.println("Ingrese su nombre completo (nombres y apellidos):");
            nombre = sc.nextLine();
            longitudNombre = nombre.indexOf(' ');

            if (longitudNombre == -1)
                System.out.println("No ingrese solamente un nombre");
        } while (longitudNombre == -1);

        char[][] matriz = new char[longitudNombre][longitudNombre];

        // Inicialización de la matriz con espacios en blanco
        for (int i = 0; i < longitudNombre; i++) {
            for (int j = 0; j < longitudNombre; j++) {
                matriz[i][j] = ' ';
            }
        }

        matriz = insercionMatriz(nombre, longitudNombre, matriz);

        System.out.println("\nMatriz con cada letra de su nombre de forma aleatoria:\n");

        for (int i = 0; i < longitudNombre; i++) {
            for (int j = 0; j < longitudNombre; j++) {
                System.out.print(matriz[i][j] + "  ");
                Thread.sleep(500);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Este método genera dos números aleatorios en un rango de la longitud del
     * nombre
     * 
     * @param max maximo numero que puede ser generado
     */
    private static int[] posAleatorias(int max) {
        Random random = new Random();
        int[] numeros = new int[2];

        numeros[0] = random.nextInt(max + 1);
        numeros[1] = random.nextInt(max + 1);

        return numeros;
    }

    /**
     * Este método inserta las letras del nombre ingresado aleatoriamente en la
     * matriz y coloca un asterisco (*) si la posición de dos letras coincide
     * 
     * @param nombre         nombre ingresado
     * @param longitudNombre número de caracteres del primer nombre
     * @param matriz[][]     matriz a rellenar
     */
    private static char[][] insercionMatriz(String nombre, int longitudNombre, char matriz[][]) {
        int arrayAleatorio[];

        for (int i = 0; i < nombre.length(); i++) {
            arrayAleatorio = posAleatorias(longitudNombre - 1);
            int fila = arrayAleatorio[0],
                    columna = arrayAleatorio[1];

            matriz[fila][columna] = matriz[fila][columna] == ' ' ? nombre.charAt(i) : '*';
        }

        return matriz;
    }
}