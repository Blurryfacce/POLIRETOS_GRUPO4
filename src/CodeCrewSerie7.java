/* Copyright (C) 2023, Isaac_Proaño, Jhair Zambrano
 * (CodeCrew) blurryface0611@gmail.com 
 * version 1.0
 */

 /**
  * Este clase realiza una secuencia de numeros que empieza desde el 1 y va aumentando de 3 en 3.
  * @author Isaac Proaño
  */
public class CodeCrewSerie7 {
/**
 * Este método imprime la serie usando un ciclo For.
 * @param numeroVeces: limita la serie a un número de elementos 
 * @author Isaac Proaño  
 */
    public void mostrarSerie7for(int numeroVeces){
        for (int numImprimir = 1; numImprimir < numeroVeces * 3; numImprimir += 3) {
                System.out.print( numImprimir + " " );
                
        }

        System.out.println();
    }

/**
 * Este método imprime la serie usando un ciclo For.
 * @param numeroVeces: limita la serie a un número de elementos 
 * @author Isaac Proaño 
 */
    public void mostrarSerie7Dowhile(int numeroVeces){
        int numImprimir = 1;
        do {
            System.out.print(numImprimir + " ");
            numImprimir += 3;
        } while (numImprimir <= numeroVeces * 3);
        
        System.out.println();
    }
    
/**
 * Este método imprime la serie usando un ciclo While.
 * @param numeroVeces: limita la serie a un número de elementos 
 * @author Isaac Proaño 
 */
    public void mostrarSerie7While(int numeroVeces){
        int numImprimir = 1;
        while (numImprimir <= numeroVeces * 3) {
            System.out.print(numImprimir + " ");
            numImprimir += 3;
        }
        System.out.println();

    }
}
