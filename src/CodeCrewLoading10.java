/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */

public class CodeCrewLoading10 {
    public CodeCrewLoading10() {
        int desplazamiento = 10;
        // Desplazar hacia la derecha
        for (int i = 0; i <= desplazamiento; i++) {
            clearConsola();
            printFigura(i);
            delay(150);
        }

        // Regresar
        for (int j = desplazamiento; j >= 0; j--) {
            clearConsola();
            printFigura(j);
            delay(150);
        }
    }

    /**
     * <b>printFigura</b> Imprime la figura del muñequito
     * @param desplazamiento : Espacio para desplazar el muñequito en pantalla
     */
    private void printFigura(int desplazamiento) {
        String espacios = repeatString("  ", desplazamiento);
        System.out.println("----- Loading 10 -----");
        System.out.println(espacios + "   \\|||/");
        System.out.println(espacios + "   (> <)");
        System.out.println(espacios + "ooO-(_)-Ooo");
    }
    
    private void clearConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    /**
     * <b>delay</b> Tiempo de espera entre cada espacio  de desplazamiento
     * @param tiempo: milisegundos de espera
     */
    private void delay(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * <b>repeatString</b> Imprime una cadena varias veces
     * @param str: cadena a imprimir
     * @param nroVeces: cuantas veces se desea imprimir la cadena
     */

    private String repeatString(String str, int nroVeces) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nroVeces; i++) {
            result.append(str);
        }
        return result.toString();
    }
}
