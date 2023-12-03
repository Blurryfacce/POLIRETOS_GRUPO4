import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean bandera = true;
        int numeroVeces = 0;
        String red = "\033[31m", yellow = "\033[33m", cyan = "\033[36m", reset = "\u001B[0m";
        System.out.println(cyan + "Hello, Grupo 4: CodeCrew" + reset);
        System.out.println(red + "Integrantes: " + reset);
        System.out.println(yellow + "Parra.Jhordy---Pastaz.Angel---Pisco.Christian---ProaÃ±o.Isaac");
        System.out.println("Ramos.Sebastian---Rueda.Ruth---Sarasti.Sebastian---Zambrano.Jhair" + reset);

        esperarTecla();
        limpiarConsola();

        // Control de posibles errores
        while (bandera == true) {
            try {
                System.out.println("Ingresa el numero de elementos hasta el cual deseas hacer las secuencias ");
                numeroVeces = Integer.parseInt(sc.nextLine());
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }
        }

        // Ejercicio 1 Ruth Rueda
        CodeCrewSerie1 oCodeCrewSerie1 = new CodeCrewSerie1();
        System.out.println("----Serie 1---For----");
        oCodeCrewSerie1.showSerie1For(numeroVeces);
        System.out.println("----Serie 1---Do While----");
        oCodeCrewSerie1.showSerie1DoWhile(numeroVeces);
        System.out.println("----Serie 1---While----");
        oCodeCrewSerie1.showSerie1While(numeroVeces);
        esperarTecla();
        limpiarConsola();

        // Ejercicio 2 Ángel Pastaz y Ruth Rueda
        CodeCrewSerie2 oCodeCrewSerie2 = new CodeCrewSerie2();
        System.out.println("----Serie 2---For----");
        oCodeCrewSerie2.showSerie2For(numeroVeces);
        System.out.println("----Serie 2---Do While----");
        oCodeCrewSerie2.showSerie2DoWhile(numeroVeces);
        System.out.println("----Serie 2---While----");
        oCodeCrewSerie2.showSerie2While(numeroVeces);
        esperarTecla();
        limpiarConsola();

        // Ejercicio 3
        CodeCrewSerie3 oCodeCrewSerie3 = new CodeCrewSerie3();
        System.out.println("----Serie 3---For----");
        oCodeCrewSerie3.mostrarSerie3For(numeroVeces);
        System.out.println("----Serie 3---Do While----");
        oCodeCrewSerie3.mostrarSerie3DoWhile(numeroVeces);
        System.out.println("----Serie 3---While----");
        oCodeCrewSerie3.mostrarSerie3While(numeroVeces);
        esperarTecla();
        limpiarConsola();
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

        // Ejercicio 6 Isaac proano y Jhair Zambrano
        CodeCrewSerie6 oCodeCrewSerie6 = new CodeCrewSerie6();
        System.out.println("----Serie 6---For----");
        oCodeCrewSerie6.mostrarSerie6for(numeroVeces);
        System.out.println("----Serie 6---Dowhile----");
        oCodeCrewSerie6.mostrarSerie6DoWhile(numeroVeces);
        System.out.println("----Serie 6---While----");
        oCodeCrewSerie6.mostrarSeries6While(numeroVeces);
        esperarTecla();
        limpiarConsola();

        // Ejercicio 7 Isaac Proao
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
        // Ejercicio 9 SebastiÃ¡n Ramos
        CodeCrewSerie9 oCodeCrewSerie9 = new CodeCrewSerie9();
        System.out.println("----Serie 9---For----");
        oCodeCrewSerie9.SerieFor(numeroVeces);
        System.out.println("----Serie 9---Do While----");
        oCodeCrewSerie9.SeriDoWhile(numeroVeces);
        System.out.println("----Serie 9---While----");
        oCodeCrewSerie9.SerieWhile(numeroVeces);
        esperarTecla();
        limpiarConsola();
        // Ejercicio 10 SebastiÃ¡n Sarasti y SebastiÃ¡n Ramos
        CodeCrewSerie10 oCodeCrewSerie10 = new CodeCrewSerie10();
        System.out.println("----Serie 10---For----");
        oCodeCrewSerie10.mostrarSerie10For(numeroVeces);
        System.out.println("----Serie 10---Do While----");
        oCodeCrewSerie10.mostrarSerie10DoWhile(numeroVeces);
        System.out.println("----Serie 10---While----");
        oCodeCrewSerie10.mostrarSerie10While(numeroVeces);
        esperarTecla();
        limpiarConsola();
        // Ejercicio 12 Jhordy Parra
        CodeCrewSerie12 oCodeCrewSerie12 = new CodeCrewSerie12();
        System.out.println("----Serie 12---For----");
        oCodeCrewSerie12.mostrarSerie12For(numeroVeces);
        System.out.println("----Serie 12---Do While----");
        oCodeCrewSerie12.mostrarSerie12DoWhile(numeroVeces);
        System.out.println("----Serie 12---While----");
        oCodeCrewSerie12.mostrarSerie12While(numeroVeces);
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 1 Sebastián Ramos
        CodeCrewCaracter1 oCodeCaracter1 = new CodeCrewCaracter1();
        System.out.println("----Caracter 1----");
        oCodeCaracter1.mostrarSerieCaracter1(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 2 Jhordy Parra
        CodeCrewCaracter2 oCodeCrewCaracter2 = new CodeCrewCaracter2();
        System.out.println("----Caracter 2----");
        oCodeCrewCaracter2.mostrarSerieCaracteres2(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 3 Jhordy Parra
        CodeCrewCaracter3 oCodeCrewCaracter3 = new CodeCrewCaracter3();
        System.out.println("----Caracter 3----");
        oCodeCrewCaracter3.mostrarSerieCaracteres3(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 4 Sebastián Ramos.
        CodeCrewCaracter4 oCodeCrewCaracter4 = new CodeCrewCaracter4();
        System.out.println("----Caracter 4----");
        oCodeCrewCaracter4.mostrarSerieCaracter4(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        //Caracteres: Ejercicio 5 Angel Pastaz
        CodeCrewCaracter5 oCodeCrewCaracter05 = new CodeCrewCaracter5();
        System.out.println("----Caracter 5----");
        oCodeCrewCaracter05.mostrarSerieCaracter05(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();
        
        //Caracteres: Ejercicio 6 Angel Pastaz
        CodeCrewCaracter6 oCodeCrewCaracter06 = new CodeCrewCaracter6();
        System.out.println("----Caracter 6----");
        oCodeCrewCaracter06.mostrarSerieCaracter06(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();
        
        //Caracteres: Ejercicio 7 Christian Pisco
        CodeCrewCaracter7 oCodeCrewCaracter7 = new CodeCrewCaracter7();
        System.out.println("----Caracter 7----");
        oCodeCrewCaracter7.mostrarSerieCaracter7(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        //Figuras: Ejercicio 1 Angel Pastaz
        System.out.println("----- Figura 1 -----");
        CodeCrewFigura1 oCodeCrewFigura01 = new CodeCrewFigura1();
        System.out.println("Ingrese el tamaño de la figura");
        int tamañoFigura = Integer.parseInt(sc.nextLine());
        oCodeCrewFigura01.mostrarFigura01(tamañoFigura);
        esperarTecla();
        limpiarConsola();
        
        //Figuras: Ejercicio 2 Angel Pastaz
        System.out.println("----- Figura 2 -----");
        CodeCrewFigura2 oCodeCrewFigura2 = new CodeCrewFigura2();
        oCodeCrewFigura2.mostrarFigura02(tamañoFigura);
        esperarTecla();
        limpiarConsola();
        
        // Figuras:Ejercicio 3 Sebastián Ramos
        System.out.println("----- Figura 3 -----");
        CodeCrewFigura3 oCodeCrewFigura3 = new CodeCrewFigura3();
        CodeCrewFigura3.mostrarFigura3(tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras:Ejercicio 4 Sebastian Sarasti
        System.out.println("----- Figura 4 -----");
        CodeCrewFigura4 oCodeCrewFigura4 = new CodeCrewFigura4();
        oCodeCrewFigura4.mostrarFigura4((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras:Ejercicio 5 Sebastián Ramos
        CodeCrewFigura5 oCodeCrewFigura5 = new CodeCrewFigura5();
        oCodeCrewFigura5.mostrarFigura5(tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 7 Jhordy Parra
        System.out.println("----- Figura 7 -----");
        CodeCrewFigura7 oCodeCrewFigura7 = new CodeCrewFigura7();
        oCodeCrewFigura7.mostrarFigura7((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 8 Jhordy Parra
        System.out.println("----- Figura 8 -----");
        CodeCrewFigura8 oCodeCrewFigura8 = new CodeCrewFigura8();
        oCodeCrewFigura8.mostrarFigura8((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras:Ejercicio 15 Sebastian Sarasti
        System.out.println("----- Figura 15 -----");
        CodeCrewFigura15 oCodeCrewFigura15 = new CodeCrewFigura15();
        oCodeCrewFigura15.mostrarFigura15((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 16 Jhordy Parra
        System.out.println("----- Figura 16 -----");
        CodeCrewFigura16 oCodeCrewFigura16 = new CodeCrewFigura16();
        oCodeCrewFigura16.mostrarFigura16((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 17 Jhordy Parra
        System.out.println("----- Figura 17 -----");
        CodeCrewFigura17 oCodeCrewFigura17 = new CodeCrewFigura17();
        oCodeCrewFigura17.mostrarFigura17((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        System.out.println("Ingrese la frase que desea trabajar");
        String frase = sc.nextLine();
        // Cadena de caracteres 1: Sebastian Sarasti
        System.out.println("----- Cadena 1 -----");
        CodeCrewCadena1 oCodeCrewCadena1 = new CodeCrewCadena1();
        oCodeCrewCadena1.mostrarCadena1(frase);
        esperarTecla();
        limpiarConsola();

        //Cadena de caracteres 3: Angel Pastaz
        System.out.println("----- Cadena 3 -----");
        CodeCrewCadena3 oCodeCrewCadena3 = new CodeCrewCadena3();
        oCodeCrewCadena3.ingresarDatos();
        esperarTecla();
        limpiarConsola();

        // Cadena de caracteres 8: Sebastian Sarasti
        System.out.println("----- Cadena 8 -----");
        CodeCrewCadena8 oCodeCrewCadena8 = new CodeCrewCadena8();
        oCodeCrewCadena8.mostrarPalabraAleatoria();
        String anagrama;
        int cont = 1;
        do {
            System.out.println("Ingrese el anagrama");
            anagrama = sc.nextLine();
        } while (oCodeCrewCadena8.mostrarCadena8(anagrama) == false && cont++ < 3);
        esperarTecla();
        limpiarConsola();
        sc.close();

        //Loading: Ejercicio 5 Angel Pastaz
        System.out.println("----- Loading 5 -----");
        CodeCrewLoading5 oCodeCrewLoading5 = new CodeCrewLoading5();
        oCodeCrewLoading5.mostrarLoading5();
        System.out.println();
        esperarTecla();
        limpiarConsola();
        
        //Loading: Ejercicio 6 Angel Pastaz
        System.out.println("----- Loading 6 -----");
        CodeCrewLoading6 oCodeCrewLoading6 = new CodeCrewLoading6();
        oCodeCrewLoading6.mostrarLoading6();
        System.out.println();
        esperarTecla();
        limpiarConsola();

    }
    

    public static void esperarTecla() {
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine(); // Espera a que el usuario presione Enter
    }

    /**
     * Esta funcion sirve para limpiar la consola, a travÃ©s de comandos de windows.
     */
    public static void limpiarConsola() throws Exception {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
