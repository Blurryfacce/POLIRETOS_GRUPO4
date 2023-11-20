/* Copyright (C) 2023, Isaac_Proaño, Jhair Zambrano
 * (CodeCrew) blurryface0611@gmail.com / jhairzp27@hotmail.com
 * version 1.0
 */
public class CodeCrewSerie6 {
    
    /**
     * Este método imprime la serie utilizado un ciclo for
     * @param numVeces: limita la serie un número de elementos
     * @author Isaac Proaño, Jhair Zambrano
     */
    public void mostrarSerie6for(int numeroVeces){
        for (int i = 1; i < numeroVeces; i++) {
            int cuadrado = i * i;
            System.out.print(cuadrado + " ");
        }
        System.out.println();
    }

    public void mostrarSeries6While(int numVeces){
        int i = 0;
        while (i < numVeces -1 ) {
              i++;
            int cuadrado = i*i;
            System.out.print(cuadrado + " ");
        }
        System.out.println();
    }
    
    
    
}