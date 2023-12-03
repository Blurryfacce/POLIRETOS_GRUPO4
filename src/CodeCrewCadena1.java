/*
 * Copyright (C) 2k23, Sebastian Sarasti Larrea
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
public class CodeCrewCadena1 {
    public void mostrarCadena1(String frase) {
        contarVocales(frase);
    }

    /**
     * Este método permite contar ls vocales de una frase
     * 
     * @param frase es la frase con la que trabajaremos
     */
    public void contarVocales(String frase) {
        int contadorVocales = 0;
        for (int contCiclo = 0; contCiclo < frase.length(); contCiclo++) {
            char caracter = frase.toLowerCase().charAt(contCiclo);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La frase: " + frase + " . Contiene " + contadorVocales + " vocales");
    }

}
