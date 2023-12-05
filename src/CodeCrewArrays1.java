/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase sirve para generar loadings en base a nuestros nombres"
 */
public class CodeCrewArrays1 {

    public void mostrarArray1() {
        String[] names = {"Angel", "Sebastian", "Pastaz", "Quishpe"};

        for (String name : nombres) {
            nameAnimated(nombre, nombre.length());
        }
    }
    /*
     * Anima el loading, porcentaje y el nombre
     * @param name el nombre o apellido que está en el array nombres
     * @param size tamaño del String name
     */
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
    
    /*
     * Imprime el contenido que está dentro de la barra en base a un parametro
     * @param size tamaño del String name que será usado como tamaño de la barra
     */
    public void barraCuerpo(int size) {
        String cuerpoBarra = "=";
    
        for (int i = 0; i < size; i++) {
            System.out.print(cuerpoBarra);
        }
    }
    
    /* Imprime el espacio vacío despues del contenido de la barra
     * @param size cantidad de los espacios a imprimir 
     */
    public void barraEspacio(int size) {
        for (int k = 1; k < size; k++) {
            System.out.print(" ");
        }
    }
    /* Simula el "delay" de otros lenguajes
     * @param milisegundos tiempo que dará una pausa
     */
    public void delay(int milisegundos) throws InterruptedException {
        Thread.sleep(milisegundos);
    }
}

