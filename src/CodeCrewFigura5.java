/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */

/**
 * Esta clase sirve para generar la figura
 */
public class CodeCrewFigura5 {
     /**
     * Esta función permite imprimir la la figura requerida
     * 
     * @param altura la altura de la figura
     */
    public void mostrarFigura5 (int altura) {
        for(int i=altura; i>=1;i--){
            for(byte j=1; j<=altura -i; j++ ){
                System.out.print(" ");
        }
            for(byte j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        
    }
    
}
