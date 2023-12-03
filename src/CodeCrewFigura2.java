/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la figura de un rectangulo con el signo de suma y resta en el contorno
 */
public class CodeCrewFigura2 {
    public void mostrarFigura02(int altura){
        for(int i=1; i<= altura;i++){
            for(int j=1;j<=altura;j++)
                if (i==1||j==1||i==altura||j==altura) {
                    System.out.print((i%2==0||j%2==0) ? "+ ":"- " );
                }
                else{
                    System.out.print("  ");
                }
            System.out.println();
        }
    }
}
