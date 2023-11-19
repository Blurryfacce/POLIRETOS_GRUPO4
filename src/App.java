import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String red = "\033[31m";
        String yellow = "\033[33m";
        String cyan = "\033[36m";
        String reset = "\u001B[0m";
        System.out.println(cyan + "Hello, Grupo 4: CodeCrew" + reset);
        System.out.println(red + "Integrantes: " + reset);
        System.out.println(yellow + "Parra.Jhordy---Pastaz.Angel---Pisco.Christian---Proaño.Isaac");
        System.out.println("Ramos.Sebastian---Rueda.Ruth---Sarasti.Sebastian---Zambrano.Jhair" + reset);

        esperarTecla();
        limpiarConsola();
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
        esperarTecla();
        limpiarConsola();
        // Ejercicio 9
        CodeCrewSerie9 oCodeCrewSerie9 = new CodeCrewSerie9();
        System.out.println("----Serie 9---For----");
        oCodeCrewSerie9.SerieFor(numeroVeces);
        System.out.println("----Serie 9---Do While----");
        oCodeCrewSerie9.SeriDoWhile(numeroVeces);
        System.out.println("----Serie 9---While----");
        oCodeCrewSerie9.SerieWhile(numeroVeces);
        esperarTecla();
        limpiarConsola();
        // Ejercicio 10
        CodeCrewSerie10 oCodeCrewSerie10 = new CodeCrewSerie10();
        System.out.println("----Serie 10---For----");
        oCodeCrewSerie10.mostrarSerie10For(numeroVeces);
        System.out.println("----Serie 10---Do While----");
        oCodeCrewSerie10.mostrarSerie10DoWhile(numeroVeces);
        System.out.println("----Serie 10---While----");
        oCodeCrewSerie10.mostrarSerie10While(numeroVeces);
        esperarTecla();
        limpiarConsola();

        // Ejercicio 11
        // Ejercicio 12

    }

    public static void esperarTecla() {
        System.out.println("Presiona Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Espera a que el usuario presione Enter
    }
    /**
    * Esta funcion sirve para limpiar la consola, a través de comandos de windows.
    */
    public static void limpiarConsola() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
    }
}
