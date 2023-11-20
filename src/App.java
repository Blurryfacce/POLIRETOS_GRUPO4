import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean bandera = true;
        int numeroVeces = 0;
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

        // Control de posibles errores
        while (bandera==true) {
            try {
                System.out.println("Ingresa el numero de elementos hasta el cual deseas hacer las secuencias ");
                numeroVeces = Integer.parseInt(sc.nextLine());
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }
        }

        // Ejercicio 1
        // Ejercicio 2
        // Ejercicio 3
        // Ejercicio 4 Christian Pisco
        CodeCrewSerie4 oCodeCrewSerie4 = new CodeCrewSerie4();
        System.out.println("----Serie 4---For----");
        oCodeCrewSerie4.mostrarSerie4For(numeroVeces);
        System.out.println("----Serie 4---Do While----");
        oCodeCrewSerie4.mostrarSerie4DoWhile(numeroVeces);
        System.out.println("----Serie 4---While----");
        oCodeCrewSerie4.mostrarSerie4While(numeroVeces);
        esperarTecla();
        limpiarConsola();
         // Ejercicio 5 Jhair Zambrano
         CodeCrewSerie5 oCodeCrewSerie5 = new CodeCrewSerie5();
         System.out.println("-------Serie 5------For-----");
         oCodeCrewSerie5.mostrarSerie5For(numeroVeces);
         // CICLO DO WHILE
         System.out.println("-------Serie 5------DoWhile-----");
         oCodeCrewSerie5.mostrarSerie5DoWhile(numeroVeces);
         // while
         System.out.println("-------Serie 5------While-----");
         oCodeCrewSerie5.mostrarSeries5While(numeroVeces);
         esperarTecla();
         limpiarConsola();
 
         // Ejercicio 6
         CodeCrewSerie6 oCodeCrewSerie6 = new CodeCrewSerie6();
         System.out.println("----Serie 6---For----");
         oCodeCrewSerie6.mostrarSerie6for(numeroVeces);
         System.out.println("----Serie 6---Dowhile----");
         oCodeCrewSerie6.mostrarSerie6DoWhile(numeroVeces);
         System.out.println("----Serie 6---While----");
         oCodeCrewSerie6.mostrarSeries6While(numeroVeces);
         esperarTecla();
         limpiarConsola();
 
         // Ejercicio 7 Isaac Proa�o
         CodeCrewSerie7 oCodeCrewSerie7 = new CodeCrewSerie7();
         System.out.println("----Serie 7---For----");
         oCodeCrewSerie7.mostrarSerie7for(numeroVeces);
         System.out.println("----Serie 7---DoWhile----");
         oCodeCrewSerie7.mostrarSerie7Dowhile(numeroVeces);
         System.out.println("----Serie 7---While----");
         oCodeCrewSerie7.mostrarSerie7While(numeroVeces);
         esperarTecla();
         limpiarConsola();
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
        // Ejercicio 9 Sebastián Ramos
        CodeCrewSerie9 oCodeCrewSerie9 = new CodeCrewSerie9();
        System.out.println("----Serie 9---For----");
        oCodeCrewSerie9.SerieFor(numeroVeces);
        System.out.println("----Serie 9---Do While----");
        oCodeCrewSerie9.SeriDoWhile(numeroVeces);
        System.out.println("----Serie 9---While----");
        oCodeCrewSerie9.SerieWhile(numeroVeces);
        esperarTecla();
        limpiarConsola();
        // Ejercicio 10 Sebastián Sarasti y Sebastián Ramos
        CodeCrewSerie10 oCodeCrewSerie10 = new CodeCrewSerie10();
        System.out.println("----Serie 10---For----");
        oCodeCrewSerie10.mostrarSerie10For(numeroVeces);
        System.out.println("----Serie 10---Do While----");
        oCodeCrewSerie10.mostrarSerie10DoWhile(numeroVeces);
        System.out.println("----Serie 10---While----");
        oCodeCrewSerie10.mostrarSerie10While(numeroVeces);
        esperarTecla();
        limpiarConsola();
        // Ejercicio 12

        sc.close(); // Cierre del Scanner
    }

    public static void esperarTecla() {
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine(); // Espera a que el usuario presione Enter
    }

    /**
    * Esta funcion sirve para limpiar la consola, a través de comandos de windows.
    */
    public static void limpiarConsola() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
    }
}
