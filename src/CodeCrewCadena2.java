/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase sirve para contar las letras NO vocales de una palabra o frase
 */
public class CodeCrewCadena2 {
    public void mostrarCadena2(String frase){
        contarLetras(frase);
    }
    /**
     * Este metodo es el que cuenta, usando un ciclo for que "recorré" cada posición
     * @param frase Es la palabra o frase de cual se va a contar
     */
    private void contarLetras(String frase) {
        int contadorL=0;
        for (int contCiclo = 0; contCiclo < frase.length(); contCiclo++) {
            char caracter = frase.toLowerCase().charAt(contCiclo);
            if (caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u') {
                contadorL++;
            }
        }
        System.out.println("La frase: " + frase + " . Contiene " + contadorL + " letras");

    }

}
