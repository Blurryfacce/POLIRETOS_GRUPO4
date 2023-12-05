/* Copyright (C) 2023, Isaac_Proaño
 * (CodeCrew) blurryface0611@gmail.com 
 * Final Version
 */

  /**
  * Este clase realiza una secuencia que imprime una escalera doble
  * @author Isaac Proaño
  */
public class CodeCrewFigura9 {
/**
 * Este método imprime se encarga de realizar la secuencia mediante la utilización de ciclos while
 * @param tamañoFigura: limita la secuencia a un tamaño específico  
 * @author Isaac Proaño  
 */
    public void mostrarFigura9(int tamañoFigura){
        int conteoExterno = 1, espaciosExterno = 1, conteoInterno = 1, j = 1, conteoInferior = 0, espaciosInferior = 0, totalExterno = 0, totalInferior = 1;
        conteoInferior = tamañoFigura;
        espaciosInferior = tamañoFigura;
    
        while (tamañoFigura >= conteoExterno) {
            conteoExterno++;
            j++;
            totalExterno = totalExterno + 2;
            totalInferior = totalInferior + 2;
            while (tamañoFigura > conteoInterno) {
                conteoInterno++;
                System.out.print("    ");
            }
            conteoInterno = j;
            System.out.print(" ___");
    
            while (tamañoFigura > conteoInferior) {
                conteoInferior++;
                System.out.print("    ");
            }
            conteoInferior = conteoInferior - totalExterno;
            System.out.print("___\n");
    
            while (tamañoFigura > espaciosExterno) {
                espaciosExterno++;
                System.out.print("    ");
            }
            espaciosExterno = conteoExterno;
            System.out.print(" |");
            System.out.print(" ");
    
            while (tamañoFigura >= espaciosInferior) {
                espaciosInferior++;
                System.out.print("    ");
            }
            espaciosInferior = espaciosInferior - totalInferior;
            System.out.print(" |\n");
            System.out.print(" ");
        }
    }
    

}
    