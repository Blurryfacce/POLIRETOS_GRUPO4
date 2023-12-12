/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */


public class CodeCrewArrays4 {
    private static final int DELAY = 15;
    private static final String espacio = "  ";
    private static final char[] nombre = {'R', 'U', 'T', 'H', ' '};
    private static final char[] apellido = {'A', 'D', 'E', 'U', 'R'};
        
    private static int fila = 0, columna = 0;
    
    public void mostrarArrays4() {
        System.out.println("");
        clearTerminal();
        matrizFX();
        System.out.println();
    }

    private void clearTerminal() {
        System.out.print("\033[H\033[2J\033[3J");
        System.out.flush();
    }

    public void matrizFX() {
        String[][] matrizFX = new String[13][5];

        /* Para rellenar la matriz */
        for (fila = 0; fila < 13; fila++) {
            for (columna = 0; columna < 5; columna++) {
                // Rellenar nombre
                if (fila == 10 - 3*columna)
                    matrizFX[fila][columna] = espacio + nombre[columna] + espacio;

                // Rellenar apellido
                else if (fila == 3*columna)
                    matrizFX[fila][columna] = espacio + apellido[columna] + espacio;

                // Rellenar espacios vacíos
                else
                    matrizFX[fila][columna] = espacio + espacio;
            }
        }

        for (fila = 12; fila >= 0; fila--) {
            for (columna = 0; columna < 5; columna++) {
                System.out.print(espacio + matrizFX[fila][columna] + espacio);
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
