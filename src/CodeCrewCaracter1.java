/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Clase que genera la serie 1 de caracteres
 */
public class CodeCrewCaracter1 {
/**
 * Genera la serie 1, con el ciclo for.
 * @param numeroVeces es la cantidad de caracteres que tendrá la serie 
 */
    public void mostrarSerieCaracter1(int numeroVeces) {
        for (int contador = 0; contador < numeroVeces; contador++) {
            System.out.print((contador%2==0) ? "+ ":"- " );
        }
    }
}
