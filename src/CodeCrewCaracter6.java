/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la serie de caracteres 6
 */
public class CodeCrewCaracter6 {
    public void mostrarSerieCaracter06(int altura){
        int asccii= 97;
        for(int i=1; i<=altura; i++){
            if (asccii == 147) {
                asccii = 97;
            }
            char letra = (char) asccii;
            System.out.print(letra+ " ");
            asccii ++;
        }
    }
}
