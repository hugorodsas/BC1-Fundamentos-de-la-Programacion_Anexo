import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String palabra){
    int longitud= palabra.length();

    for(int i=0; i<longitud / 2; i++){
        if (palabra.charAt(i) != palabra.charAt(longitud-1-i)) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese texto o palabra: ");
        String texto=sc.nextLine();

        System.out.print("El texto/palabra en inverso es: ");
        for(int i=texto.length()-1;i>=0;i--){
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        if(esPalindromo(texto)){
            System.out.println("El texto/palabra es un palindromo");
        }else{
            System.out.println("El texto/palabra no es un palindromo");
        }
        sc.close();
    }
}
