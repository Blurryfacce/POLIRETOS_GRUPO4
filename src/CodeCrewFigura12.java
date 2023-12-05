/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */

public class CodeCrewFigura12 {
    /**
     * <b>showFigura12 </b> muestra la Figura 12
     * @param nivelFigura : Número de niveles para generar la figura
     */

    public void showFigura12(byte nivelFigura){
        for (byte i = nivelFigura; i >= 1; i--) {
            for(byte j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
