import java.util.Scanner;

public class CalculadoraDeFactorial {
    public static long calcularfactorial (int nuemro){
        if (nuemro<0){
            return -1;
        }
        if (nuemro ==0||nuemro==1) {
            return 1;
        }
        long resultado = 1;
        for(int i=2; i<=nuemro;i++){
            resultado=resultado*i;
        }
        return resultado;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingresa un numero positivo: ");
        int numero = sc.nextInt();
        long factorial= calcularfactorial(numero);
        if (factorial==-1) {
            System.out.println("Vuelva a intentarlo con un numero positivo");
        }else{
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        sc.close();
    }
}
