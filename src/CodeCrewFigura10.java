/* Copyright (C) 2023, Isaac_Proaño
 * (CodeCrew) blurryface0611@gmail.com 
 * Final Version
 */

 /**
  * Este clase realiza una secuencia que imprime una escalera descendente con patrones alternos
  * @author Isaac Proaño
  */
public class CodeCrewFigura10 {

/**
 * Este método imprime se encarga de realizar la secuencia mediante la utilización de ciclos while
 * @param tamañoFigura: limita la secuencia a un tamaño específico  
 * @author Isaac Proaño  
 */
    public void mostrarFigura10(int tamañoFigura){
        int contadorExterno = 1, contadorInterno = 1;
        
    
        while (tamañoFigura >= contadorExterno) {
            System.out.print("_+_\n");
    
            while (contadorExterno > contadorInterno) {
                contadorInterno++;
                System.out.print("    ");
            }
            contadorInterno = 1;
            System.out.print("   |");
            contadorExterno++;
    
            if (tamañoFigura >= contadorExterno) {
                System.out.print("_-_\n");
                while (contadorExterno > contadorInterno) {
                    contadorInterno++;
                    System.out.print("    ");
                }
                contadorInterno = 1;
                System.out.print("   |");
                contadorExterno++;
            }
        }
        System.out.print("\n");
    }
    
}
