/*
 * Copyright (C) 2k23, Sebastian Sarasti
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
public class CodeCrewRecursion4 {
    /**
     * Este método permite calcular la potencia de un numero
     * 
     * @param base      es el numero base
     * @param exponente es el numero a lo que se eleva la base
     * @return
     */
    public int calcularPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, exponente - 1);
        }
    }
}
