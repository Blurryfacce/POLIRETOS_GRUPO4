/*
 * Copyright (C) 2k23, Sebastian Sarasti Larrea
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
public class CodeCrewCadena8 {
    String green = "\033[32m", reset = "\u001B[0m", red = "\033[31m";
    private String[] conjuntoPalabras = { "delira", "Ballena", "Alondra", "España", "Enrique" };
    private String[] conjuntoAnagramas = { "lidera", "llenaba", "Ladrona", "apañes", "quieren" };
    boolean ValorVerdadAnagrama = false;

    public void mostrarPalabraAleatoria() {
        System.out.println("Tu palabra es: " + green + conjuntoPalabras[(int) (Math.random() * 5)] + reset);
    }

    /**
     * Este método permite determinar si el anagrama ingresado de la palabra
     * obtenida es correcto o no
     * 
     * @param anagrama es la palabra que ingresa el usuario
     * @return se retorna el valor de verdad, verdadero si sí es anagrama, y falso
     *         si no
     */
    public boolean mostrarCadena8(String anagrama) {
        for (int i = 0; i < conjuntoAnagramas.length; i++) {
            if (anagrama.toLowerCase().equals(conjuntoAnagramas[i].toLowerCase())) {
                System.out.println(green + "Correcto" + reset);
                return true;
            }
        }
        System.out.println(red + "Incorrecto" + reset);
        return ValorVerdadAnagrama;
    }
}
