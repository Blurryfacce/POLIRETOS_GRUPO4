/* Copyright (C) 2023, Isaac_Proa�o, Jhair Zambrano
 * (CodeCrew) blurryface0611@gmail.com / jhairzp27@hotmail.com
 * version 2.0
 */

 /**
  * Esta clase realiza una secuencia de n�meros naturales elevados al cuadrado utilizando bucles.
  * @authors Isaac Proa�o, Jhair Zambrano
  */

public class CodeCrewSerie6 {
    
    /**
     * Este m�todo imprime la serie utilizado un ciclo for
     * @param numVeces: limita la serie un n�mero de elementos
     * @author Isaac Proa�o, Jhair Zambrano
     */
    public void mostrarSerie6for(int numeroVeces){
        for (int i = 1; i < numeroVeces + 1; i++) {
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
        }
        System.out.println();
    }

    /**
     * Este m�todo imprime la serie utilizado un ciclo doWhile
     * @param numVeces: limita la serie un n�mero de elementos
     * @author Isaac Proa�o, Jhair Zambrano
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
     * Este m�todo imprime la serie utilizado un ciclo While
     * @param numVeces: limita la serie un n�mero de elementos
     * @author Isaac Proa�o, Jhair Zambrano
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
