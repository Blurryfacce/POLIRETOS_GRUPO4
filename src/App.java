import java.util.Scanner;

public class App {

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
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa el numero de elementos hasta el cual deseas hacer las secuencias ");
                
                numeroVeces  = Integer.parseInt(sc.nextLine());
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }
        }
        
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


        // Cierre del Scanner
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