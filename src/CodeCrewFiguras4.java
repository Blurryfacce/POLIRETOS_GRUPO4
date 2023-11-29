/*
 * Copyright (C) 2k23, Sebastian Sarasti
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
public class CodeCrewFiguras4 {
    public void mostrarFigura4(byte tamanoFigura) {
        char[][] matrizFigura = new char[tamanoFigura][tamanoFigura];
        matrizFigura = llenarMatriz(matrizFigura);
        imprimirMatrizFor(matrizFigura);
    }

    /**
     * Esta función permite imprimir la la figura requerida
     * 
     * @param matrizFigura Es la matriz en donde se almacena la figura
     */
    public void imprimirMatrizFor(char[][] matrizFigura) {
        for (byte contColumna = 0; contColumna < matrizFigura[0].length; contColumna++) {
            for (byte contFila = 0; contFila < matrizFigura.length; contFila++) {
                System.out.print(matrizFigura[contFila][contColumna]);
            }
            System.out.println(" ");
        }

    }

    /**
     * Esta función llena la matriz con la figura (triángulo rectángulo invertido)
     * 
     * @param matriz es la matriz creada a partir de el tamaño que ingresó el
     *               usuario
     * @return se retorna la matriz llena con la figura requerida
     */
    public char[][] llenarMatriz(char[][] matriz) {
        byte contEspaciosBlancos = 0;
        for (byte contColumna = (byte) (matriz[0].length - 1); contColumna >= 0; contColumna--) {
            for (byte contFila = (byte) (matriz.length - 1); contFila >= 0; contFila--) {
                if (contFila >= contEspaciosBlancos) {
                    matriz[contFila][contColumna] = '*';
                } else {
                    matriz[contFila][contColumna] = ' ';
                }
            }
            contEspaciosBlancos++;
        }
        return matriz;
    }
}
