import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(99) +1;
        int intentos = 3;
        boolean adivinado= false;

        System.out.println("¡BIENVENIDO AL JUEGO!");
        System.out.println("Se ha generado un numero del 1 al 100. Adivinalo");

        while (!adivinado) {
            System.out.println("Ingresa tu numero: ");
            int numeroUsuario = sc.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio){
            adivinado = true;
            System.out.println("Ehnorabuena! Has adivinado el numero en " + intentos + " intentos.");
            } else if( numeroUsuario < numeroAleatorio){
                System.out.println("El numero es mayor. Continua");
            }else{
                System.out.println("El numero es menor. Continua");
            }
        }
        sc.close();
    }
}
