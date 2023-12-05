import java.util.Arrays;

public class CodeCrewLoading9 {
    public void mostrarLoading9(String nombre) {
        String[] arregloNombre = new String[nombre.length() + 1]; // Agrego el +1, para la columna de %
        double porcentaje = 100 / (double) (nombre.length() - 1); // El -1, funciona ya que posteriormente se inicial
                                                                  // el
        // porcentaje
        // en 0%
        // 0, por lo que
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
