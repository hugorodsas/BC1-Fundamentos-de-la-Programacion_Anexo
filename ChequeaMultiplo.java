import java.util.Scanner;

public class ChequeaMultiplo {

    public int multiplo;
    public ChequeaMultiplo(int multiplo) {
        this.multiplo = multiplo;
    }
    public boolean esMultiplo(int numero) {
        if (multiplo==0) {
            return false;
        }
        return numero%multiplo ==0;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese el nuemero que desea verificar: ");
        int mutliploIngresado= sc.nextInt();

        ChequeaMultiplo comprobador = new ChequeaMultiplo(mutliploIngresado);

        System.out.println("Ingrese el numero para verificar: ");
        int numeroverificar= sc.nextInt();

        if (comprobador.esMultiplo(numeroverificar)) {
            System.out.println(numeroverificar + " es multiplo de " + mutliploIngresado);
        }else{
            System.out.println(numeroverificar + " no es multiplo de " + mutliploIngresado);
        }

        sc.close();
    }
}
