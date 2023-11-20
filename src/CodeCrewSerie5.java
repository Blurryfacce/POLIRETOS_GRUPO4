/**
 * @author Jhair Zambrano
 *	NUMEROS PRIMOS con ciclo For
 */
public class CodeCrewSerie5 {
	
	public void mostrarSerie5For(int numeroVeces) {
		for (int numPrimo = 1; numeroVeces > 0; numeroVeces--, numPrimo++){
			int numRealPrimo = 0;
			
			while(numPrimo <= numeroVeces) {
				if (esPrimo(numPrimo)) {
					 numRealPrimo = numPrimo;
					 System.out.print(numRealPrimo + "  ");
				}
				numPrimo++;
			}
			
		}
		System.out.println();
	}

	/**
	 * Numeros primos con ciclo Do-While
	 * @param numVeces
	 */
	
	public void mostrarSerie5DoWhile(int numeroVeces) {
		
		int numPrimo = 1, numRealPrimo =0;
		do {
			
			if(esPrimo(numPrimo)) {
				numRealPrimo = numPrimo;
				System.out.print(numRealPrimo + "  ");
			}
			
			numeroVeces--; numPrimo++;
		}while(numeroVeces >0);
		System.out.println();
		
	}
	
	/**
	 * Numeros primos con ciclo WWhile
	 * @param numVece
	 */
	public void mostrarSeries5While(int numeroVeces) {
		int numPrimo = 1, numRealPrimo = 0;
		
		while(numeroVeces >0) {
			numeroVeces --; numPrimo ++;
			
			if(esPrimo(numPrimo)) {
				numRealPrimo = numPrimo;
			}
			System.out.print(numRealPrimo + "  ");
			
		}
		System.out.println();
	}
	
	/**
	 * Esta funcion servirá para determinar si el numero es primo o no
	 * @param num
	 * @return
	 */
	public boolean esPrimo(int numeroVeces) {
		if (numeroVeces <= 1) {
			return false;
		}
		for(int i=2;i*i<=numeroVeces; i++) {
			if(numeroVeces %i ==0){
			return false;
			}
		}
		return true;
	}
	
}

