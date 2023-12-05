/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la figura de un rectangulo con el signo de suma y resta en el contorno
 */
public class CodeCrewFigura2 {
    public void mostrarFigura02(int altura){
        for (int i = 1; i <= altura; i++){
            for(int w = 1; w <= altura; w++)
            {
                if(w==1 || w==altura || i==1 ||i==altura){
                    if((i+w)%2==0 ){
                        System.out.print("- ");
                    }
                    else{
                        System.out.print("+ ");
                    }
                } 
                else {  
                    System.out.print("  ");
                }
            }
        System.out.println();
        }       
    }
}
