public class CodeCrewFigura5 {
    public static void mostrarFigura5 (int altura) {
        for(int i=altura; i>=1;i--){
            for(byte j=1; j<=altura -i; j++ ){
                System.out.print(" ");
        }
            for(byte j=1; j<=i; j++){
                System.out.print("* ");
            }
        System.out.println();
        }
        
    }
    
}