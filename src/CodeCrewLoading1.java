public class CodeCrewLoading1 {
    /**
     * Este método permite mostrar una barra de carga, la cual va cambiando el signo
     * y el porcentaje se va incrementando
     */
    public void mostrarLoading1() {
        String caracteresLoading[] = { "|", "/", "-", "\\" };
        String caracteresSimbolosLoading[] = { "°", "'°", "''°", "'''°" };

        for (int i = 0; i <= 100; i++) {
            System.out.print(
                    "\rLoading " + caracteresLoading[i % 4] + " " + i + "%" + caracteresSimbolosLoading[i % 4]);
            try {
                delay(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void delay(int milisegundos) throws InterruptedException {
        Thread.sleep(milisegundos);
    }
}
