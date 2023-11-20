/* Copyright (C) 2023, Jhair Zambrano
 * (CodeCrew) jhairzp27@hotmail.com
 * version 2.0
 * Esta clase genera una secuencia de numeros primos utilizando bucles for, doWhile, While
 */

/**
  * Esta clase realiza una secuencia de números primos utilizando bucles.
  * @author Jhair Zambrano
  */
public class CodeCrewSerie5 {
	
	/**
	 * Este metodo crea la serie utilizando un ciclo for
	 * @param numVeces
	 * @author Jhair Zambrano
	 */
	public void mostrarSerie5For(int numVeces) {
		int[] numerosPrimos = new int[numVeces]; // Se crea el array del tamano numVeces
		int numerosPrimosImpresos = 0;
		for (int numPrimo = 2; numerosPrimosImpresos < numVeces; numPrimo++) {
			if (esPrimo(numPrimo)) {
				numerosPrimos[numerosPrimosImpresos] = numPrimo;
				numerosPrimosImpresos++;
			}
		}
		for (int i = 0; i < numerosPrimosImpresos; i++) {
			System.out.print(numerosPrimos[i] + " "); //Se almacena dentro de un array y este se va iterando en posiciones de acorde a los guardados
		}
		System.out.println(); //Salto de linea para la siguiente serie
	}

	/**
	 * Este metodo crea la serie utilizando un ciclo DoWhile
	 * @param numVeces
	 * @author Jhair Zambrano
	 */
	public void mostrarSerie5DoWhile(int numVeces) {
		int [] numPrimos = new int [numVeces];
		int numerosPrimosImpresos = 0;
		int numPrimo = 2;
		int i= 0;
		do {
			if (esPrimo(numPrimo)) {
				numPrimos[numerosPrimosImpresos] = numPrimo;
				numerosPrimosImpresos++;
			}
			numPrimo++;
		} while (numerosPrimosImpresos < numVeces ); // Condicion a repetir
		for(i =0; i < numerosPrimosImpresos; i++ ){
			System.out.print(numPrimos[i]+ " ");
		}
		System.out.println();
	}
	
	/**
	 * Este metodo crea la serie utilizando un ciclo While 
	 * @param numVeces
	 * @author Jhair Zambrano
	 */
	public void mostrarSeries5While(int numeroVeces) {
		int [] numPrimos = new int [numeroVeces];
		int numerosPrimosImpresos = 0;
		int numPrimo = 2;
		
		while (numerosPrimosImpresos < numeroVeces) {
			if(esPrimo(numPrimo)){
				numPrimos[numerosPrimosImpresos] = numPrimo;
				numerosPrimosImpresos++;
			}
			numPrimo++;
		}
		for(int i = 0; i < numerosPrimosImpresos; i++){
			System.out.print(numPrimos[i] + " ");
		}
		System.out.println();

	}
	
	/**
	 * Esta funcion servira para determinar si el numero es primo o no
	 * @param num entero
	 * @return boolean
	 */
	public boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for(int i = 2; i*i <= num; i++) {
			if(num % i == 0){
			return false;
			}
		}
		return true;
	}
	
}

