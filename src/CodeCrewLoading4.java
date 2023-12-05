/* Copyright (C) 2023, Sebastian_Ramos
 * (CodeCrew) sebastian.ramos01@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase me sirve para generar una animación de carga con o0o
 */
public class CodeCrewLoading4 {
    /**
     * Muestra la carga 
     */
    public void mostrarLoading4(){
        String carga[]= {"0oo","o0o","oo0","o0o"};
        for(int porcentaje=0; porcentaje <=100; porcentaje++){
            
            String c = carga[porcentaje%4];
            System.out.print("\r"+ c + " "+ porcentaje +"%");

            try{ Thread.sleep(100);}
            catch(InterruptedException ie){}
        }
        System.out.println();
    }

}
