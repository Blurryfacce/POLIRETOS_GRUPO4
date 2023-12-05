/*
 * Copyright (C) 2k23, Sebastian Sarasti Larrea
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
public class CodeCrewArrays3 {
    /**
     * Este método permite mostrar un nombre, en función f(x)=2x
     */
    public void mostrarArray3() {
        String nombre = "sebas";
        String[][] matrizPlanoStrings = new String[(nombre.length() * 2 + 1)][(nombre.length() * 2)];
        int cont = 0, contFilas2 = matrizPlanoStrings.length - 3, contColumnas2 = 1;
        for (int contColumnas = matrizPlanoStrings[0].length - 1; contColumnas >= 0; contColumnas--) {
            for (int contFilas = matrizPlanoStrings.length - 1; contFilas >= 0; contFilas--) {
                if (contColumnas == 0) {
                    matrizPlanoStrings[contFilas][contColumnas] = cont + "" + "|";
                    cont++;
                } else if (contFilas == matrizPlanoStrings.length - 1) {
                    matrizPlanoStrings[contFilas][contColumnas] = "_";
                } else {
                    matrizPlanoStrings[contFilas][contColumnas] = " ";
                }

            }

        }
        for (int i = 0; i < nombre.length(); i++) {
            matrizPlanoStrings[contFilas2][contColumnas2] = " " + nombre.charAt(i);
            contColumnas2++;
            contFilas2 -= 2;
        }

        for (int i = 0; i < matrizPlanoStrings.length; i++) {
            for (String fila : matrizPlanoStrings[i])
                System.out.print(fila);
            System.out.println();
        }
    }
}