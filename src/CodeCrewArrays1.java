public class CodeCrewArrays1 {

    public void mostrarArray1() {
        String[] nombres = {"Angel", "Sebastian", "Pastaz", "Quishpe"};

        for (String nombre : nombres) {
            nameAnimated(nombre, nombre.length());
        }
    }

    public void nameAnimated(String name, int size) {
        String[] Barra = {"[", " ", "]"};
        float sizeFloat = (float) size;
    
        for (int j = 0; j < size; j++) {
            System.out.print(Barra[0]);
            barraCuerpo(j + 1); // Usar j + 1 para imprimir la misma cantidad de caracteres "=" en cada paso
            System.out.print(">");
            barraEspacio(size - j);
            System.out.print(Barra[2]);
    
            float division = ((j + 1) * 100.0f) / sizeFloat; // Calcular el porcentaje en esta iteración
            int porcentaje = (int) division;
            System.out.print(porcentaje + "%  ");
    
            try {
                delay(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    
            for (int i = 0; i <= j; i++) {
                System.out.print(name.charAt(i));
            }
            System.out.print("\r");
        }
        System.out.println();
    }
    

    public void barraCuerpo(int size) {
        String cuerpoBarra = "=";
    
        for (int i = 0; i < size; i++) {
            System.out.print(cuerpoBarra);
        }
    }

    public void barraEspacio(int size) {
        for (int k = 1; k < size; k++) {
            System.out.print(" ");
        }
    }

    public void delay(int milisegundos) throws InterruptedException {
        Thread.sleep(milisegundos);
    }
}

