/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 */

/**
 * @author Jhair Zambrano
 * @oaram tamañoFigura
 */
public class CodeCrewFigura6 {

    /**
     * @param tamañoFigura ingresado por el usuario
     * @return la figura deseada
     */
    public void mostrarFigura6(int tamañoFigura){
        int i = 2, j = 2, a = 2, b = 2;
        int k = tamañoFigura;

        k = k * 2;
        b = k;

        while (k >= a) {
            while (j < b) {
                System.out.print("  ");
                j = j + 2;
            }
            j = 2;
            b = b - 2;

            while (i <= a) {
                i++;
                System.out.print("* ");
            }
            i = 2;
            a = a + 2;
            System.out.print("\n");
        }
    }

}
