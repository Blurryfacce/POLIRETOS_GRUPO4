/**
 * Copyright (C) 2023, Christian Pisco
 * (CodeCrew) christian.pisco@epn.edu.ec
 * Version 1.0
 */

// Clase que presenta una frase en mayúsculas y sin la J
public class CodeCrewCadena7 {
    /**
     * Este método imprime la frase recibida en mayúsculas y sin la J
     * 
     * @param frase representa la entrada que se trabajará
     */
    public void mostrarCadena7(String frase) {
        System.out.println("Frase: " + frase);
        frase = frase.toUpperCase();

        System.out.println("Frase en mayusculas y sin la J: ");
        for (char c : frase.toCharArray()) {
            System.out.print((c != 'J') ? c : "");
        }
        System.out.println("\n");
    }
}
