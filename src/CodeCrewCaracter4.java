/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la serie de caracteres 4
 */
public class CodeCrewCaracter4 {
    private String serie;
    /**
     * Este método sirve para generar la serie usando un ciclo for 
     * y operaciones con string.
     * @param numeroVeces
     */
    public void mostrarSerieCaracter4(int numeroVeces) {
        this.serie= "+-*/";
        for (int contador = 0; contador < numeroVeces; contador++) {
            char caracter =serie.charAt(contador%serie.length());
            System.out.print(caracter+ " ");
        }
    }
}
