/* Copyright (C) 2023, Isaac_Proaño
 * (CodeCrew) blurryface0611@gmail.com 
 * Final Version
 */

  /**
  * Este clase realiza una secuencia que imprime un triangulo de pascal 
  * @author Isaac Proaño
  */
public class CodeCrewFigura14 {

/**
 * Este método imprime se encarga de realizar la secuencia mediante la utilización de ciclos for.
 * @param tamañoFigura: limita la secuencia a un tamaño específico  
 * @author Isaac Proaño  
 */
    public void mostrarFigura14(int tamañoFigura){

        int espacioInicial = 0, espacioFinal = tamañoFigura;
        int[][] matrix = new int[tamañoFigura][tamañoFigura];
    
        for (int i = 0; i < tamañoFigura; i++) {
            matrix[i][0] = 1; 
            matrix[i][i] = 1; 
    
            for (int j = 1; j < i; j++) {
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]; 
            }
        }

        for (int i = 0; i < tamañoFigura; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    while (espacioInicial < espacioFinal) {
                        System.out.print(" ");
                        espacioInicial++;
                    }
                    espacioFinal--;
                    espacioInicial = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
