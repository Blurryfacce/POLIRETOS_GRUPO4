public class CodeCrewRecursion5 {

    public void mostrarConteoRegresivo(int numConteo){

        if (numConteo <= 0) {
            System.out.println("¡Conteo regresivo completo!");
        } else {
            System.out.println("Conteo regresivo: " + numConteo);
            mostrarConteoRegresivo(numConteo - 1);
        }
    }
}
