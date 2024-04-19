import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numero1, numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número 1 a comparar");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese el número 2 a comparar");
        numero2 = teclado.nextInt();


        if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que " + numero1);

        } else if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que " + numero2);

        } else System.out.println("Los números son iguales");
    }
}
