/*
 * Copyright (C) 2k23, Sebastian Sarasti Larrea
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
/**
 * Esta clase permite generar un triángulo de pascal
 */
public class CodeCrewFigura15 {
    public void mostrarFigura15(byte tamanoFigura) {
        byte[][] matrizFigura = new byte[tamanoFigura][tamanoFigura];
        matrizFigura = llenarMatrizN(matrizFigura);
        imprimirFigura(matrizFigura);
    }

    /**
     * Esta funcion permite imprimir el triángulo de Pascal de forma triangular
     * rectangular
     * 
     * @param matrizFigura esta matriz almacena el triángulo
     */
    public void imprimirFigura(byte[][] matrizFigura) {
        for (byte contFila = 0; contFila < matrizFigura.length; contFila++) {
            for (byte contColumna = 0; contColumna < matrizFigura[0].length; contColumna++) {
                if (matrizFigura[contFila][contColumna] > 0) {
                    System.out.print(matrizFigura[contFila][contColumna] + "  ");
                }
            }
            System.out.println("    ");
        }
    }

    /**
     * Esta funcion permite llenar la matriz con los números que cumplen el
     * triángulo de Pascal
     * 
     * @param matrizFigura es la matriz inicialmente vacía
     * @return retorna la matriz llena
     */
    public byte[][] llenarMatrizN(byte[][] matrizFigura) {
        for (byte contColumna = 1, i = 0; contColumna < matrizFigura.length; contColumna++, i++) {
            matrizFigura[i][0] = 1;
            for (byte contFila = 1; contFila < matrizFigura.length; contFila++) {
                matrizFigura[contColumna][contFila] = (byte) (matrizFigura[contColumna - 1][contFila - 1]
                        + matrizFigura[contColumna - 1][contFila]);
            }
        }
        matrizFigura[matrizFigura.length - 1][0] = 1;
        return matrizFigura;
    }

}