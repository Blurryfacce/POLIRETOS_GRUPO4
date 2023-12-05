/* Copyright (C) 2023, Isaac_Proaño
 * (CodeCrew) blurryface0611@gmail.com 
 * Final Version
 */

  /**
  * Este clase realiza almacena un método recursivo para obtener un conteo ProgresivoHasta(n)
  * @author Isaac Proaño
  */
public class CodeCrewRecursion5 {

 /**
     * Muestra un conteo regresivo desde un número dado hasta 1 utilizando recursión.
     *
     * @param numConteo El número a partir del cual se realizará el conteo regresivo.
     *                  Debe ser un entero positivo mayor que cero.
     * @author: Isaac Proaño
     */
    public void mostrarConteoRegresivo(int numConteo){

        if (numConteo <= 0) {
            System.out.println("¡Conteo regresivo completo!");
        } else {
            System.out.println("Conteo regresivo: " + numConteo);
            mostrarConteoRegresivo(numConteo - 1);
        }
    }
}
