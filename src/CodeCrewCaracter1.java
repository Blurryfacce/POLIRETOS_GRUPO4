public class CodeCrewCaracter1 {

    public void mostrarSerieCaracter1(int numeroVeces) {
        for (int contador = 0; contador < numeroVeces; contador++) {
            if (contador % 2 == 0) {
                System.out.print(" + ");
            } else {
                System.out.print(" - ");
            }
        }
    }
}
