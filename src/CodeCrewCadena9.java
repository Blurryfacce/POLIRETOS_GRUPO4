/**
 * Copyright (C) 2023, Ruth Rueda
 * (CodeCrew) ruth.rueda@epn.edu.ec
 * Version 1.0
 */

public class CodeCrewCadena9 {
    /**
     * <b>showCadena9 </b> Recibe una frase y convierte una letra a mayúsculas y otra a minúsculas
     * @param frase : Texto ingresado por el usuario
     */

     public void showCadena9(String frase){
        StringBuilder resultado = new StringBuilder();
        int longitud = 0, control = 0;
        while(longitud < frase.length()){
            char letra = frase.charAt(longitud);
            if (letra != ' '){ 
                letra = (control % 2 == 0) ? Character.toUpperCase(letra) : Character.toLowerCase(letra);
                control++; 
            }
            else{
                letra = ' ';
                control = 0;
            }
            resultado.append(letra);
            longitud++;
        }
        System.out.println("\tSalida : " + resultado.toString());
    }
}
