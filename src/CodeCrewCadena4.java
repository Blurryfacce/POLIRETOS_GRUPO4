/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

import java.util.Scanner;

// Clase que elimina la letra ingresada de la frase recibida
public class CodeCrewCadena4 {

    Scanner sc = new Scanner(System.in);

    /**
     * Este método imprime la frase recibida sin la vocal ingresada
     * 
     * @param frase representa la entrada que se trabajará
     */
    public void mostrarCadena4(String frase) {
        System.out.println("Frase: " + frase);
        System.out.println("Ingrese una letra para eliminar: ");
        String letra = sc.nextLine().toLowerCase();
        frase = frase.toLowerCase();

        System.out.println("Frase sin la letra: ");
        for (char c : frase.toCharArray()) {
            System.out.print((c != letra.charAt(0)) ? c : " ");
        }
        System.out.println("\n");
    }
}
