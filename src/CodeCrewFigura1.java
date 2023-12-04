public class CodeCrewFigura1 {
    public void mostrarFigura01(int altura){

        for(int i = 1;i<=altura;i++){
            for(int j = 1; j<=altura; j++){
                System.out.print((i==1||j==1||i==altura||j==altura) ? "* ":"  " );

            }
            System.out.println();
        }
}
}
