/* Copyright (C) 2023, Isaac_Proaño, Jhair Zambrano
 * (CodeCrew) blurryface0611@gmail.com / jhairzp27@hotmail.com
 * version 2.0
 */

 /**
  * Esta clase realiza una secuencia de números naturales elevados al cuadrado utilizando bucles.
  * @authors Isaac Proaño, Jhair Zambrano
  */

public class CodeCrewSerie6 {
    
    /**
     * Este método imprime la serie utilizado un ciclo for
     * @param numVeces: limita la serie un número de elementos
     * @author Isaac Proaño, Jhair Zambrano
     */
    public void mostrarSerie6for(int numeroVeces){
        for (int i = 1; i < numeroVeces + 1; i++) {
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
        }
        System.out.println();
    }

    /**
     * Este método imprime la serie utilizado un ciclo doWhile
     * @param numVeces: limita la serie un número de elementos
     * @author Isaac Proaño, Jhair Zambrano
     */
    public void mostrarSerie6DoWhile(int numeroVeces){
        int i = 0;
        do {
            i++;
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
        } while (i < numeroVeces );
        System.out.println();
    }

    /**
     * Este método imprime la serie utilizado un ciclo While
     * @param numVeces: limita la serie un número de elementos
     * @author Isaac Proaño, Jhair Zambrano
     */
    public void mostrarSeries6While(int numVeces){
        int i = 0;
        while (i < numVeces ) {
            i++;
            int cuadrado = i*i;
            System.out.print(cuadrado + " ");
        }
        System.out.println();
    }
    
    
    
}
