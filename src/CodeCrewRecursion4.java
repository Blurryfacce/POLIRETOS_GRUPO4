/*
 * Copyright (C) 2023, Sebastian Sarasti
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.2
 */
public class CodeCrewRecursion4 {

    /**
     * Este método permite calcular la potencia de un número.
     * 
     * @param base      es el número base
     * @param exponente es el número a lo que se eleva la base
     * @return la potencia calculada
     */
    public double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * calcularPotencia(base, exponente - 1);
        } else {
            return 1 / (base * calcularPotencia(base, Math.abs(exponente) - 1));
        }
    }
}
