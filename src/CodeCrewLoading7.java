/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 */

public class CodeCrewLoading7 {

    /**
     * @author Jhair Zambrano
     */
    public void mostrarLoading7(){

        String [] punta = {"|", "/", "--", "\\", "|" };

        double division =  0f;
        int tam = 20;
        for (int i = 0; i <= tam; i++) {
            System.out.print("\r: ["+ getProgressBar(i,tam) + "]" + i * 100/tam + " %");
            try {Thread.sleep(150);} catch (InterruptedException e){}
        }
    }
    
    // METODOS
        /**
         * @param i es el iterador principal que va cambiando
         * @param tam este sera el size de nuestra barra
         * @return progreso de la barra
         */
        private static String getProgressBar(int i, int tam) {
            int longBarra = 6;
            int progreso = i * longBarra / tam;
    
            StringBuilder progressBar = new StringBuilder();
            
            for (int j = 0; j < longBarra; j++) {
                if (i < progreso) {
                    progressBar.append(" ");
                }else if (j == progreso) {
                    progressBar.append(getAnimatedSymbol(i));
                    if (i < longBarra -1) {
                        progressBar.append(" ");
                    }
                } else {
                    progressBar.append("=");
                }
            }
            return progressBar.toString();
        }
        
        /**
         * @param i iterador principal
         * @return simbolos de acorde al iterador
         */
        private static String getAnimatedSymbol(int i) {
            String [] signos = {"|", "/", "--", " ", "|" };
            return signos[i % signos.length];
        }
    
}
