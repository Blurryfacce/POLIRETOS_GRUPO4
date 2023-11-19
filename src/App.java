import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Grupo 4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de elementos hasta el cual deseas hacer las secuencias ");
        int numeroVeces = Integer.parseInt(sc.nextLine());
        // Ejercicio 1
        // Ejercicio 2
        // Ejercicio 3
        // Ejercicio 4
        // Ejercicio 5
        // Ejercicio 6
        // Ejercicio 7
        // Ejercicio 8 Sebastian Sarasti
        CodeCrewSerie8 oCodeCrewSerie8 = new CodeCrewSerie8();
        System.out.println("----Serie 8---For----");
        oCodeCrewSerie8.mostrarSerie8For(numeroVeces);
        System.out.println("----Serie 8---Do While----");
        oCodeCrewSerie8.mostrarSerie8DoWhile(numeroVeces);
        System.out.println("----Serie 8---While----");
        oCodeCrewSerie8.mostrarSerie8While(numeroVeces);
        // Ejercicio 9
        // Ejercicio 10
        // Ejercicio 11
        // Ejercicio 12
    }
}
