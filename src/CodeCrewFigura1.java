/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 */
/**
 * Esta clase genera la figura de un rectangulo con asteriscos en el contorno
 */
public class CodeCrewFigura1 {
    public void mostrarFigura01(int altura){

        for(int i = 1;i<=altura;i++){
            for(int j = 1; j<=altura; j++){
                System.out.print((i==1||j==1||i==altura||j==altura) ? "* ":"  " );

            }
            System.out.println();
        }
}
}
