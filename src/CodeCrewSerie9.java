public class CodeCrewSerie9 {
public byte numeroInicio= 2;
    public void SerieFor(int numeroVeces){
        byte numeroSiguiente= this.numeroInicio;
        for (int i =0; i<numeroVeces; i++){
            System.out.println(numeroSiguiente);
            numeroSiguiente*=2;
        }
    }
    

}
