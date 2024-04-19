import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un número para saber si es par o impar");
        numero = teclado.nextInt();

        String mensaje = (numero % 2 == 0) ? "El número es par" : "El número es impar";

        System.out.println(mensaje);
    }
}
