/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la barra de loading 6
 */
public class CodeCrewLoading5 {

    public static void mostrarLoading5() {
        String[] puntaBarra = {"-", ">"};
        String[] Barra = {"[", " ", "]"};
        int size = 20;            
        float division = 0f;

        for (int j = 0; j < size; j++) {
            
            System.out.print(Barra[0]);
            barraCuerpo(j);
            System.out.print((j%2==0)?puntaBarra[0]:puntaBarra[1]);
            barraEspacio(size-j);
            System.out.print(Barra[2]);
            division= division+(100/(size));
            int porcentaje = (int) division;
            System.out.print(porcentaje + "%");
            System.out.print("\r");
            try {
                    delay(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            
        }
    }

    public static void delay(int milisegundos) throws InterruptedException {
        Thread.sleep(milisegundos);
        
    }
    public static void barraCuerpo(int j){
        String cuerpoBarra = "=";

        for (int i=0; i < j; i++) {
                System.out.print(cuerpoBarra);
                
                
            }
    }
    public static void barraEspacio(int size){
        for (int k=1; k <size; k++) {
                System.out.print(" ");
            }
    }
}
