/*
 * Copyright (C) 2023, Jhordy Parra
 * (CodeCrew) jhordy.parra@epn.edu.ec/jhordyp2004@gmail.com
 * Version 1.0
 */

/**
* Este clase realiza una secuencia de numeros que empieza desde el 2 y se incrementa sucesivamente sumando numeros pares(2,4,6),utilizando bucles.
* 2, 6, 12, 20, 30, 42...
* @author Jhordy Parra
*/
public class CodeCrewSerie12 
{
    // Variables de inicio de la Serie y el aumento de dicha serie
    private int numeroInicio = 2, aumento=4; 
    /**
     * Este método imprime la serie mediante un For
     * 
     * @param numeroVeces este parámetro permite limitar la serie a un numero de
     *                    elementos
     */
    public void mostrarSerie12For(int numeroVeces) 
    {
        for(int i = 0; numeroVeces > i; i++) 
        {
            System.out.print(numeroInicio + " ");
            numeroInicio += aumento; // El numero aumenta segun los numeros pares
            aumento      += 2;       // El aumento suma 2
        }
        // Retorna las variables a sus valores iniciales
        numeroInicio = 2;
        aumento = 4;
        System.out.println(); // Imprime un salto de linea
    }
    public void mostrarSerie12DoWhile(int numeroVeces)
    {
        //Variable de Inicio
        int i=0;
        do 
        {
            System.out.print(numeroInicio + " ");
            numeroInicio += aumento; // El numero aumenta segun los numeros pares
            aumento      += 2;       // El aumento suma 2
            i++;
        } while (i<numeroVeces);
        // Retorna las variables a sus valores iniciales
        numeroInicio = 2;
        aumento = 4;
        System.out.println(); // Imprime un salto de linea
    }
}