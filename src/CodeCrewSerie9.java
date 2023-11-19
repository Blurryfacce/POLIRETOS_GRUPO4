public class CodeCrewSerie9 {
public byte numeroInicio= 2;
    byte numeroSiguiente=this.numeroInicio;
    public void SerieFor(int numeroVeces){
        byte numeroSiguiente= this.numeroInicio;
        for (int i =0; i<numeroVeces; i++){
            System.out.println(numeroSiguiente);
            numeroSiguiente*=2;
        }
    }
    public void SeriDoWhile(int numeroVeces){
        byte i=1; 
        do {
            System.out.println(numeroSiguiente);
            numeroSiguiente*=2;
        } while (i++<numeroVeces);
    }
    public void SerieWhile (int numeroVeces){
        byte i=0;
        numeroSiguiente= this.numeroInicio;
        while (i++<numeroVeces) {
            System.out.println(numeroSiguiente);
             numeroSiguiente*=2;
        }
    }

}
