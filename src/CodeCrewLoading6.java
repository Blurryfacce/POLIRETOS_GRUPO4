/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la barra de loading 6
 */
public class CodeCrewLoading6 {
    public void mostrarLoading6() {
        String flecha = "<=>";
        int size= 19;
        final int  SLEEP = 80;
        String [] bordes = {"[","]"};
        //Movimiento hacia la izquierda
        for(int i=1; i<size; i++){
            System.out.print(bordes[0]);
            espacioCrece(i);
            System.out.print(flecha);
            espacioDecrece(size-i);
            System.out.print(bordes[1]+"\r");
            //Delay
            try {
                delay(SLEEP);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        //Movimiento hacia la derecha
        for(int i=1; i<size; i++){
            System.out.print(bordes[0]);
            espacioCrece(size-i);
            System.out.print(flecha);
            espacioDecrece(i);
            System.out.print(bordes[1]+"\r"); 
            //Delay
            try {
                delay(SLEEP);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
/**
 * Espacio antes de la flecha
 */
    public void espacioCrece(int j){
        for(int i=1; i<j;i++)
            System.out.print(" ");
    }
/**
 * Espacio despues de la flecha
 */
    public void espacioDecrece(int size){
        for(int i=1; i<size;i++){
            System.out.print(" ");
        }

    }
/**
 * Simular el delay
 */
    public void delay(int delay) throws InterruptedException {
        Thread.sleep(delay);
        
    }
}
