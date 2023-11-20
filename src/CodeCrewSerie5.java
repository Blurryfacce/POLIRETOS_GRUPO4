/**
 * @author Jhair Zambrano
 *
 */
public class CodeCrewSerie5 {
	
	/**
	 * Numeros primos con ciclos FOR
	 * @param numVeces
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
	 * Numeros primos con Do While
	 * @param numVeces
	 */
	public void mostrarSerie5DoWhile(int numVeces) {
		int [] numPrimos = new int [numVeces];
		int numerosPrimosImpresos = 0, numPrimo = 2, i= 0;
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
	 * Numeros primos con ciclo WWhile
	 * @param numVece
	 */
	public void mostrarSeries5While(int numeroVeces) {
		int [] numPrimos = new int [numeroVeces];
		int numerosPrimosImpresos = 0,  numPrimo = 2;
		
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
	 * Esta funcion servirá para determinar si el numero es primo o no
	 * @param num
	 * @return
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

