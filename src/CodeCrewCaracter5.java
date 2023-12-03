/* Copyright (C) 2023, Angel_Pastaz
 * (CodeCrew) angel.pastaz@epn.edu.ec
 * version 1.0
 */
/**
 * Esta clase genera la serie de caracteres 5
 */
public class CodeCrewCaracter5 {
    public void mostrarSerieCaracter05(int numeroVeces) {

        int i = 1;
        for (int count = 1; count <= numeroVeces ; count++) {
            switch (i) {
                case 1:
                    System.out.print("\\ ");
                    i++;
                    break;
                case 2:
                    System.out.print("| ");
                    i++;
                    break;
                case 3:
                    System.out.print("/ ");
                    i++;
                    break;
                case 4:
                    System.out.print("- ");
                    i++;
                    break;
                case 5:
                    System.out.print("| ");
                    i = 1;
                    break;
            }
        }
    }
}
