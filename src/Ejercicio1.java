import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        numero = teclado.nextInt();

        if (numero == 1000){
            System.out.println("Felicidades, ganaste un premio");
        } else {
            System.out.println("Sigue participando");
        }

    }
}