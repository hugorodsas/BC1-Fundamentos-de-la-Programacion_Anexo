import java.util.Arrays;

public class MatrizTranspuesta {
    public static void main(String[] args) {
    int[][] numeros={{2,4,6},{3,6,9}};
    int filaOriginal = numeros.length;
    int columnaOriginal = numeros[0].length;
    int[][] transpuesta = new int[columnaOriginal][filaOriginal];
     for(int i=0;i<filaOriginal;i++){
        for(int j=0;j<columnaOriginal;j++){
            transpuesta[j][i] =numeros[i][j];
        }
       } 
    System.out.println("Matriz Transpuesta");
       for(int i=0;i<columnaOriginal;i++){
        System.out.println(Arrays.toString(transpuesta[i]));
       }
     
    }
}
