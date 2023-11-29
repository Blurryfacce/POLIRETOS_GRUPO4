/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una secuencia de Caracteres (+) que aumenta de manera Fibonaci + + ++ +++ +++++
* @author Jhordy Parra
*/
public class CodeCrewCaracter2 {

    String caracter  = "+";
    String temporal1 = "";
    String temporal2 = "";
    /**
     * Este método imprime la serie mediante un For
     * 
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarSerieCaracteres2(int numeroVeces){
        System.out.println();
        for (int i = 0; i < numeroVeces; i++) {
            System.out.print(caracter + " ");
            temporal2 = temporal1 + caracter;
            temporal1 = caracter;
            caracter  = temporal2;
        }
        System.out.println();
    }
}   
