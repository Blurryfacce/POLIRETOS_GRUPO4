import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    // Control de errores en Recursion
    private static int pedirNumero(String mensaje) {
        int numero = 0;
        boolean inputValido = false;

        while (!inputValido) {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                inputValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
            }
        }
        return numero;
    }

    public static void main(String[] args) throws Exception {

        boolean bandera = true;
        int numeroVeces = 0, numFac = 0;
        int tamañoFigura = 0;
        int tamañoMatriz = 0;
        char caracter = ' ';
        String nombreUser = " ";

        String red = "\033[31m", yellow = "\033[33m", cyan = "\033[36m", reset = "\u001B[0m";
        System.out.println(cyan + "Hello, Grupo 4: CodeCrew" + reset);
        System.out.println(red + "Integrantes: " + reset);
        System.out.println(yellow + "Parra.Jhordy---Pastaz.Angel---Pisco.Christian---ProaÃ±o.Isaac");
        System.out.println("Ramos.Sebastian---Rueda.Ruth---Sarasti.Sebastian---Zambrano.Jhair" + reset);

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

        // Caracteres: Ejercicio 5 Angel Pastaz
        CodeCrewCaracter5 oCodeCrewCaracter05 = new CodeCrewCaracter5();
        System.out.println("----Caracter 5----");
        oCodeCrewCaracter05.mostrarSerieCaracter05(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 6 Angel Pastaz
        CodeCrewCaracter6 oCodeCrewCaracter06 = new CodeCrewCaracter6();
        System.out.println("----Caracter 6----");
        oCodeCrewCaracter06.mostrarSerieCaracter06(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 7 Christian Pisco
        CodeCrewCaracter7 oCodeCrewCaracter7 = new CodeCrewCaracter7();
        System.out.println("----Caracter 7----");
        oCodeCrewCaracter7.mostrarSerieCaracter7(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 8 Ruth Rueda
        CodeCrewCaracter8 oCodeCrewCaracter8 = new CodeCrewCaracter8();
        System.out.println("----Caracter 8----");
        oCodeCrewCaracter8.showSerieCaracter8(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Caracteres: Ejercicio 9 Ruth Rueda
        CodeCrewCaracter9 oCodeCrewCaracter9 = new CodeCrewCaracter9();
        System.out.println("----Caracter 9----");
        oCodeCrewCaracter9.showSerieCaracter9(numeroVeces);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Control de posibles errores
        bandera = true;
        while (bandera == true) {
            try {
                System.out.println("Ingresa el tamaño de la figura");
                tamañoFigura = Integer.parseInt(sc.nextLine());
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }
        }

        // Figuras: Ejercicio 1 Angel Pastaz
        System.out.println("----- Figura 1 -----");
        CodeCrewFigura1 oCodeCrewFigura01 = new CodeCrewFigura1();
        oCodeCrewFigura01.mostrarFigura01(tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 2 Angel Pastaz
        System.out.println("----- Figura 2 -----");
        CodeCrewFigura2 oCodeCrewFigura2 = new CodeCrewFigura2();
        oCodeCrewFigura2.mostrarFigura02(tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras:Ejercicio 3 Sebastián Ramos
        System.out.println("----- Figura 3 -----");
        CodeCrewFigura3 oCodeCrewFigura3 = new CodeCrewFigura3();
        oCodeCrewFigura3.mostrarFigura3(tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras:Ejercicio 4 Sebastian Sarasti
        System.out.println("----- Figura 4 -----");
        CodeCrewFigura4 oCodeCrewFigura4 = new CodeCrewFigura4();
        oCodeCrewFigura4.mostrarFigura4((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras:Ejercicio 5 Sebastián Ramos
        System.out.println("----- Figura 5 -----");
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

        // Figuras: Ejercicio 9 Isaac Proaño
        System.out.println("----- Figura 9 -----");
        CodeCrewFigura9 oCodeCrewFigura9 = new CodeCrewFigura9();
        oCodeCrewFigura9.mostrarFigura9((int) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 10 Isaac Proaño
        System.out.println("----- Figura 10 -----");
        CodeCrewFigura10 oCodeCrewFigura10 = new CodeCrewFigura10();
        oCodeCrewFigura10.mostrarFigura10((int) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 11 Christian Pisco
        System.out.println("----- Figura 11 -----");
        CodeCrewFigura11 oCodeCrewFigura11 = new CodeCrewFigura11();
        oCodeCrewFigura11.mostrarFigura11((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 12 Ruth Rueda
        System.out.println("----- Figura 12 -----");
        CodeCrewFigura12 oCodeCrewFigura12 = new CodeCrewFigura12();
        oCodeCrewFigura12.showFigura12((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 13 Ruth Rueda
        System.out.println("----- Figura 13 -----");
        CodeCrewFigura13 oCodeCrewFigura13 = new CodeCrewFigura13();
        oCodeCrewFigura13.showFigura13((byte) tamañoFigura);
        esperarTecla();
        limpiarConsola();

        // Figuras: Ejercicio 14 Isaac Proaño
        System.out.println("----- Figura 14 -----");
        CodeCrewFigura14 oCodeCrewFigura14 = new CodeCrewFigura14();
        oCodeCrewFigura14.mostrarFigura14((int) tamañoFigura);
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

        // Figuras: Ejercicio 18 Isaac Proaño
        System.out.println("----- Figura 18 -----");
        CodeCrewFigura18 oCodeCrewFigura18 = new CodeCrewFigura18();
        oCodeCrewFigura18.mostrarFigura18((int) tamañoFigura);
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

        // Cadena de caracteres 2: Sebastián Ramos
        System.err.println("---- Cadena 2 ----");
        CodeCrewCadena2 oCodeCrewCadena2 = new CodeCrewCadena2();
        oCodeCrewCadena2.mostrarCadena2(frase);
        esperarTecla();
        limpiarConsola();

        // Cadena de caracteres 3: Angel Pastaz
        System.out.println("----- Cadena 3 -----");
        CodeCrewCadena3 oCodeCrewCadena3 = new CodeCrewCadena3();
        oCodeCrewCadena3.ingresarDatos();
        esperarTecla();
        limpiarConsola();

        // Cadena de caracteres 4: Christian Pisco
        System.out.println("----- Cadena 4 -----");
        CodeCrewCadena4 oCodeCrewCadena4 = new CodeCrewCadena4();
        oCodeCrewCadena4.mostrarCadena4(frase);
        esperarTecla();
        limpiarConsola();

        // Cadena de caracteres 7: Christian Pisco
        System.out.println("----- Cadena 7 -----");
        CodeCrewCadena7 oCodeCrewCadena7 = new CodeCrewCadena7();
        oCodeCrewCadena7.mostrarCadena7(frase);
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

        // Cadena de caracteres 9: Ruth Rueda
        System.out.println("----- Cadena 9 -----");
        System.out.println("Ingresa una frase y convierte una letra a mayúsculas y otra a minúsculas");
        System.out.println("\t Frase : " + frase);
        CodeCrewCadena9 oCodeCrewCadena9 = new CodeCrewCadena9();
        oCodeCrewCadena9.showCadena9(frase);
        esperarTecla();
        limpiarConsola();

        // Arrays 1: Angel Pastaz

        System.out.println("Mi nombre es: Angel Sebastian Pastaz Quishpe");
        CodeCrewArrays1 oCodeCrewArrays1 = new CodeCrewArrays1();
        oCodeCrewArrays1.mostrarArray1();
        esperarTecla();
        limpiarConsola();

        // Arrays 2: Sebastián Ramos Carrillo
        System.out.println("Mi nombre es: Sebastián Carrillo.Mis iniciales son: S C");
        System.out.println("Ingrese el tamaño");
        tamañoMatriz = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el caracter");
        caracter = sc.next().charAt(0);
        CodeCrewArrays2 oCodeCrewArrays2 = new CodeCrewArrays2();
        oCodeCrewArrays2.crearMatriz(tamañoMatriz, caracter);
        oCodeCrewArrays2.mostrarMatriz();
        esperarTecla();

        // Arrays 3: Sebastian Sarasti
        CodeCrewArrays3 oCodeCrewArrays3 = new CodeCrewArrays3();
        oCodeCrewArrays3.mostrarArray3();
        esperarTecla();
        limpiarConsola();

        // Arrays 4: Ruth Rueda
        CodeCrewArrays4 oCodeCrewArrays4 = new CodeCrewArrays4();
        esperarTecla();
        limpiarConsola();

        // Arrays 5: Christian Pisco
        CodeCrewArrays5 oCodeCrewArrays5 = new CodeCrewArrays5();
        oCodeCrewArrays5.mostrarArray5();
        esperarTecla();
        limpiarConsola();
        // Loading: Ejercicio 1 Sebastian Sarasti
        System.out.println("----- Loading 1 -----");
        CodeCrewLoading1 oCodeCrewLoading1 = new CodeCrewLoading1();
        oCodeCrewLoading1.mostrarLoading1();
        esperarTecla();
        limpiarConsola();
        // Loading: Ejercicio 2 Christian Pisco
        System.out.println("----- Loading 2 -----");
        CodeCrewLoading2 oCodeCrewLoading2 = new CodeCrewLoading2();
        oCodeCrewLoading2.mostrarLoading2();
        esperarTecla();
        limpiarConsola();

        // Loading: Ejercicio 3 Christian Pisco
        System.out.println("----- Loading 3 -----");
        CodeCrewLoading3 oCodeCrewLoading3 = new CodeCrewLoading3();
        oCodeCrewLoading3.mostrarLoading3();
        esperarTecla();
        limpiarConsola();

        // Loading: Ejercicio 4 Sebastián Ramos
        System.out.println("----- Loading 4 -----");
        CodeCrewLoading4 oCodeCrewLoading4 = new CodeCrewLoading4();
        oCodeCrewLoading4.mostrarLoading4();
        esperarTecla();
        limpiarConsola();

        // Loading: Ejercicio 5 Angel Pastaz
        System.out.println("----- Loading 5 -----");
        CodeCrewLoading5 oCodeCrewLoading5 = new CodeCrewLoading5();
        oCodeCrewLoading5.mostrarLoading5();
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Loading: Ejercicio 6 Angel Pastaz
        System.out.println("----- Loading 6 -----");
        CodeCrewLoading6 oCodeCrewLoading6 = new CodeCrewLoading6();
        oCodeCrewLoading6.mostrarLoading6();
        System.out.println();
        esperarTecla();
        limpiarConsola();

        //Loading: Ejercicio 7 Jhair Zambrano
        System.out.println("----- Loading 7 -----");
        CodeCrewLoading7 oCodeCrewLoading7 = new CodeCrewLoading7();
        oCodeCrewLoading7.mostrarLoading7();
        System.out.println();
        esperarTecla();
        limpiarConsola();
        
        //Loading: Ejercicio 8 Jhair Zambrano
        System.out.println("----- Loading 8 -----");
        System.out.println("Por favor ingrese su nombre");
        nombreUser = sc.nextLine();
        CodeCrewLoading8 oCodeCrewLoading8 = new CodeCrewLoading8();
        oCodeCrewLoading8.mostrarLoading8(nombreUser);
        System.out.println();
        esperarTecla();
        limpiarConsola();

        // Loading: Ejercicio 10 Ruth Rueda
        System.out.println("----- Loading 10 -----");
        CodeCrewLoading10 oCodeCrewLoading10 = new CodeCrewLoading10();
        esperarTecla();
        limpiarConsola();

        //Recursión: Ejercicio 1 Jhair Zambrano
        System.out.println("----- Recursion 1 -----");
        // Control de posibles errores
        while (bandera == true) {
            try {
                System.out.println("Ingresa el numero que desee saber su factorial ");
                numFac = Integer.parseInt(sc.nextLine());
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }
        }
        CodeCrewRecursion1 oCodeCrewRecursion1 = new CodeCrewRecursion1();
        oCodeCrewRecursion1.mostrarRecursion1(numFac);
        esperarTecla();
        limpiarConsola();

        //Recursion: Ejercicio 2 Jhordy Parra
        System.out.println("----- Recursion 2 -----");
        CodeCrewRecursion2 oCodeCrewRecursion2 = new CodeCrewRecursion2();
        int numero1 = pedirNumero("Ingresa el primer numero a sumar ");
        limpiarConsola();
        System.out.println("----- Recursion 2 -----");
        int numero2 = pedirNumero("Ingresa el segundo numero a sumar ");
        limpiarConsola();
        System.out.println("----- Recursion 2 -----");
        oCodeCrewRecursion2.sumaRecursion(numero1, numero2);
        esperarTecla();
        limpiarConsola();

        // Recursión: Ejercicio 3 Christian Pisco
        System.out.println("----- Recursion 3 -----");
        CodeCrewRecursion3 oCodeCrewRecursion3 = new CodeCrewRecursion3();
        oCodeCrewRecursion3.mostrarRecursion3();
        esperarTecla();
        limpiarConsola();
        // Recursion: Ejercicio 4 Sebastian Sarasti
        System.out.println("----- Recursion 4 -----");
        bandera = true;
        int base = 0, exponente = 0;
        while (bandera == true) {
            try {
                System.out.print("Ingresa el número base: ");
                base = (Integer.parseInt(sc.nextLine()));
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }

        }
        bandera = true;
        while (bandera == true) {
            try {
                System.out.print("Ingresa el exponente: ");
                exponente = (Integer.parseInt(sc.nextLine()));
                bandera = false;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero entero");
                bandera = true;
            }

        }

        CodeCrewRecursion4 oCodeCrewRecursion4 = new CodeCrewRecursion4();
        System.out.println(
                base + " elevado a la " + exponente + " es: " + oCodeCrewRecursion4.calcularPotencia(base, exponente));
        esperarTecla();
        limpiarConsola();
        // Recursion: Ejercicio 5 Isaac Proaño
        System.out.println("----- Recursion 5 -----");
        CodeCrewRecursion5 oCodeCrewRecursion5 = new CodeCrewRecursion5();
        int nume = pedirNumero("Ingrese un numero para el conteo regresivo ");
        limpiarConsola();
        System.out.println("----- Recursion 5 -----");
        oCodeCrewRecursion5.mostrarConteoRegresivo(nume);
        esperarTecla();
        limpiarConsola();
        // Recursion: Ejercicio 6 Jhordy Parra
        System.out.println("----- Recursion 6 -----");
        CodeCrewRecursion6 oCodeCrewRecursion6 = new CodeCrewRecursion6();
        int num = pedirNumero("Ingrese un numero para el conteo regresivo ");
        limpiarConsola();
        System.out.println("----- Recursion 6 -----");
        oCodeCrewRecursion6.mostrarConteoRegresivo(num);
        esperarTecla();
        limpiarConsola();

        // Cierre del Scanner (Dejar siempre al final de main)
        sc.close();
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
