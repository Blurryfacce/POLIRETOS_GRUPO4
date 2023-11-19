/**
 * @author Jhair Zambrano
 *	NUMEROS PRIMOS con ciclo For
 */
public class CodeCrewSerie5 {
	
	public void mostrarSerie5For(int numVeces) {
		for (int numPrimo = 1; numVeces > 0; numVeces--, numPrimo++){
			int numRealPrimo = 0;
			
			while(numPrimo <= numVeces) {
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
	
	public void mostrarSerie5DoWhile(int numVeces) {
		
		int numPrimo = 1, numRealPrimo =0;
		do {
			
			if(esPrimo(numPrimo)) {
				numRealPrimo = numPrimo;
				System.out.print(numRealPrimo + "  ");
			}
			
			numVeces--; numPrimo++;
		}while(numVeces >0);
		System.out.println();
		
	}
	
	/**
	 * Numeros primos con ciclo WWhile
	 * @param numVece
	 */
	public void mostrarSeries5While(int numVece) {
		int numPrimo = 1, numRealPrimo = 0;
		
		while(numVece >0) {
			numVece --; numPrimo ++;
			
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
	public boolean esPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for(int i=2;i*i<=num; i++) {
			if(num %i ==0){
			return false;
			}
		}
		return true;
	}
	
}

