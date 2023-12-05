/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 */

/**
 * @author Jhair Zambrano
 */
public class CodeCrewCadena6 {

    public void mostrarCadena6(String frase){

        System.out.println("Su frase sera invertida y modificada con las consonantes en mayusculas: ");
        frase = invertir(frase);
        System.out.println(frase);
    }

    /**
     * @param frase ingresada por usuario
     * @return invertida y consonantes en mayusculas
     */
    public static String invertir(String frase) {
        StringBuilder builder = new StringBuilder(frase);
        builder.reverse();

        for (int i = 0; i < builder.length(); i++) {
            char c = builder.charAt(i);
            if (esConsonante(c)) {
                builder.setCharAt(i, Character.toUpperCase(c));
            }
        }

        return builder.toString();
    }

    public static boolean esConsonante(char c) {
        c = Character.toLowerCase(c);
        return c >= 'b' && c <= 'z' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
    }
}

