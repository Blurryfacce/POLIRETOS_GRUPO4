import java.util.Arrays;

/*
 * Copyright (C) 2k23, Sebastian Sarasti
 * (CodeCrew) sebastian.sarasti01@epn.edu.ec
 * Version 1.0
 */
public class CodeCrewLoading9 {
    /**
     * Este método permite mostrar el nombre completo, mostrando solo una letra en
     * la misma
     * linea 0% hasta 100%
     * 
     * @param nombre es el nombre ingresado por el usuario
     */
    public void mostrarLoading9(String nombre) {
        String[] arregloNombre = new String[nombre.length() + 1]; // Agrego el +1, para la columna de %
        double porcentaje = 100 / (double) (nombre.length() - 1); // El -1, funciona ya que posteriormente se inicia
                                                                  // el porcentaje en 0%
        for (int i = 0; i < nombre.length(); i++) {
            for (int j = 0; j < nombre.length(); j++) {
                arregloNombre[j] = " ";
            }
            arregloNombre[i] = nombre.charAt(i) + "";
            arregloNombre[nombre.length()] = i * porcentaje + "%";
            for (int k = 0; k <= nombre.length(); k++) {
                System.out.print(arregloNombre[k] + " ");
            }
            System.out.println();
        }

    }
}
