import java.util.Scanner;

public class BuscarArrays {
    public static void main(String[] args) {
        int [] numeros = {10,20,30,40,50};

        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el nuemero que quiere buscar:");
        int numbuscar = sc.nextInt();
//Es la variable para buscar el numero en el array
        boolean encontrado = false;
        for(int i=0; i<numeros.length; i++){
            if (numeros[i] == numbuscar) {
                System.out.println("El numero " + numbuscar + " se encuentra en  " + i );
                encontrado=true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El numero " + numbuscar + " no existe");
        }
        sc.close();
    }
}
