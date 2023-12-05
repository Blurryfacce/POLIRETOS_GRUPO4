/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */

public class CodeCrewFigura13 {
    /**
     * <b>showFigura13 </b> muestra la Figura 13
     * @param nivelFigura : Número de niveles para generar la figura
     */

    public void showFigura13(byte nivelFigura){
        for (byte i = 1; i <= nivelFigura; i++) {
            for(byte j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}