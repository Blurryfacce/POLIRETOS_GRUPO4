/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una secuencia de Caracteres (+) que aumenta según los numeros primos ++ +++ +++++ +++++++...
* @author Jhordy Parra
*/
public class CodeCrewCaracter3 {
    /**
     * Este método verifica si un número es primo.
     * 
     * @param numero el número a verificar
     * @return true si el número es primo, false si el numero no es primo
     */
    private boolean numEsPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    /**
     * Este método imprime la serie mediante un For, incluyendo solo Numeros Primos
     * 
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarSerieCaracteres3(int numeroVeces) {
        int contador = 0;
        System.out.println();
        for (int numero = 2; contador < numeroVeces; numero++) {
            if (numEsPrimo(numero)) {
                for (int i = 0; i < numero; i++) {
                    System.out.print("+");
                }
                System.out.print(" ");
                contador++;
            }
        }
        System.out.println();
    }
}