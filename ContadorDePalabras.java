import java.util.Scanner;

public class ContadorDePalabras {
    public static int contarVecesPalabras(String texto){
        String[] palabras = texto.split(" "); //Divide las palabras mediante el espacio
        return palabras.length;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto=sc.nextLine();

        int numPalabras = contarVecesPalabras(texto);

        System.out.println("El texto proporcionado tiene " + numPalabras + " palabras");
        sc.close();
    }
}
