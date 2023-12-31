/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 */

/**
 * @author Jhair Zambrano
 */

public class CodeCrewCadena5 {

    public void mostrarCadena5(String frase){
        frase = invertirYModificar(frase);
        System.out.println(frase);
    }

    /**
     * @param frase ingresada por teclado
     * @return frase invertida y modificada
     */
    public static String invertirYModificar(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();

        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (c == 'a') {
                builder.setCharAt(i, 'A');
            } else if (c == 'e') {
                builder.setCharAt(i, 'E');
            } else if (c == 'i') {
                builder.setCharAt(i, 'I');
            } else if (c == 'o') {
                builder.setCharAt(i, 'O');
            } else if (c == 'u') {
                builder.setCharAt(i, 'U');
            }
        }
        return builder.toString();
    }

}
