/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la figura que es un triangulo rectangulo
 */
public class CodeCrewFigura3{
byte altura; 
    /**
     * Este metodo genera la figura
     * @param altura es la altura que tendrá la figura
     */
    public void mostrarFigura3(int altura) {
        for(byte i=1; i<=altura; i++){
            for(byte j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
