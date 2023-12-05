/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 */

/**
 * @author Jhair Zambrano
 */
public class CodeCrewLoading8 {
    public void mostrarLoading8(String nombreUser){
        for (int i = 0; i <= nombreUser.length(); i++) {
            System.out.print("\rCargando: [" + getBarraProgreso(nombreUser, i) + "] " + i * 100 / nombreUser.length() + "%");

            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
            }
        }
    }


    /**
     * @param nombre ingresado por teclado
     * @param ite iterador
     * @return Barra carga con el nombre
     */
    public static String getBarraProgreso(String nombre, int ite) {
        int barLength = ite; // Longitud total de la barra de carga
        int progress = ite * barLength / nombre.length();

        StringBuilder BarraProgreso = new StringBuilder();

        for (int i = 0; i < barLength; i++) {
            if (i < progress) {
                if (i < ite) {
                    BarraProgreso.append(nombre.charAt(i));
                } else {
                    BarraProgreso.append(" ");
                }
            } else {
                BarraProgreso.append(" ");
            }
        }
        return BarraProgreso.toString();
    }
}