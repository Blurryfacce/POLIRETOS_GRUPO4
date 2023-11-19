/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Clase que genera una serie multiplicativa a partir de un número inicial.
 */
public class CodeCrewSerie9 {
public byte numeroInicio= 2;
    byte numeroSiguiente=this.numeroInicio;
    /**
     * Genera una serie multiplicativa utilizando un bucle for.
     * @param numeroVeces Número de veces que se generará la serie.
     */
    public void SerieFor(int numeroVeces){
        byte numeroSiguiente= this.numeroInicio;
        for (int i =0; i<numeroVeces; i++){
            System.out.println(numeroSiguiente);
            numeroSiguiente*=2;
        }
    }
     /**
     * Genera una serie multiplicativa utilizando un bucle do-while.
     * @param numeroVeces Número de veces que se generará la serie.
     */
    public void SeriDoWhile(int numeroVeces){
        byte i=1; 
        do {
            System.out.println(numeroSiguiente);
            numeroSiguiente*=2;
        } while (i++<numeroVeces);
    }
    /**
     * Genera una serie multiplicativa utilizando un bucle while.
     * @param numeroVeces Número de veces que se generará la serie.
     */
    public void SerieWhile (int numeroVeces){
        byte i=0;
        numeroSiguiente= this.numeroInicio;
        while (i++<numeroVeces) {
            System.out.println(numeroSiguiente);
             numeroSiguiente*=2;
        }
    }

}
