/* Copyright (C) 2023, Isaac_Proaño
 * (CodeCrew) blurryface0611@gmail.com 
 * Final Version
 */

 /**
  * Este clase realiza una secuencia que imprime un triángulo de Pascal utilizando los números 1 y 2.
  * @author Isaac Proaño
  */
public class CodeCrewFigura18 {
/**
 * Este método imprime se encarga de realizar la secuencia mediante la utilización de ciclo for que se encarga de llenar * la matriz con los números correspondientes
 * El primer elemento de cada fila se establece como 1, y el último elemento de
 * cada fila se establece como 2.
 * @param tamañoFigura: limita la secuencia a un tamaño específico  
 * @author Isaac Proaño  
 */
    public void mostrarFigura18(int tamañoFigura){

        int[][] matrizResultados = new int[tamañoFigura][tamañoFigura];
    
        for (int i = 0; i < tamañoFigura; i++) {
            matrizResultados[i][0] = 1; 
            matrizResultados[i][i] = 2; 
    
            for (int j = 1; j < i; j++) {
                matrizResultados[i][j] = matrizResultados[i - 1][j - 1] + matrizResultados[i - 1][j]; 
            }
        }
        
        for (int i = 0; i < tamañoFigura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrizResultados[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}

