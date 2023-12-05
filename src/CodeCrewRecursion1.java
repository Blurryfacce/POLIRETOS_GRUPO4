/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 */

/**
 * @author Jhair Zambrano
 */
public class CodeCrewRecursion1 {
    public void mostrarRecursion1(int pedirNumero){
        
        long numFactorial = calcularFactorial(pedirNumero);
        System.out.println("EL factorial de " + pedirNumero + " es: "+ numFactorial);
    }

    /**
     * @param pedirNumero numero pedido por consola
     * @return el numero factorial
     */
    private long calcularFactorial(int pedirNumero) {
        if (pedirNumero == 0 || pedirNumero == 1) {
            return 1;
        } else {
            return pedirNumero *calcularFactorial(pedirNumero -1 );
        }
        
    }
}
