/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase imprime la frase ingresada sin la vocal que tambien se ingresa
 */
import java.util.Scanner;
public class CodeCrewCadena3 {
    private Scanner data = new Scanner(System.in);
    public void ingresarDatos(){
        System.out.println("Ingrese una frase:");
        String frase = data.nextLine();
        System.out.println("Ingrese una vocal para quitar de la frase");
        String letra = validarLetra();
        System.out.println("Frase: "+ frase);
        System.out.println("Vocal: " + letra);
        quitarVocal(frase, letra);

    }

    public String validarLetra() {
        String red = "\033[31m";
        String reset = "\u001B[0m";
        char primerCaracter;
        do {
            String letra = data.nextLine();
            primerCaracter = letra.charAt(0);
            if (!(primerCaracter == 'a' || primerCaracter == 'e' ||
                  primerCaracter == 'i' || primerCaracter == 'o' ||
                  primerCaracter == 'u')) {
                System.out.println(red + "Este caracter no es una vocal intente otra ves: " + reset);
            }
        } while (!(primerCaracter == 'a' || primerCaracter == 'e' ||
                   primerCaracter == 'i' || primerCaracter == 'o' ||
                   primerCaracter == 'u'));
        return String.valueOf(primerCaracter);
    }
    public void quitarVocal(String frase, String letra){
        System.out.print("Salida: ");
        for(int i = 0; i< frase.length();i++){
            System.out.print((frase.charAt(i)!= letra.charAt(0))? frase.charAt(i) :" ");
        }
    }
}
