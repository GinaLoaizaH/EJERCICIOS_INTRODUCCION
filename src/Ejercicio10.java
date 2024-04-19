import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edad;
        double ingresos;


        System.out.println("Ingrese la edad del usuario");
        edad = teclado.nextInt();

        System.out.println("Ingrese el salario del usuario");
        ingresos = teclado.nextDouble();

        String mensaje = (edad > 16 && ingresos >= 5000000) ? "El usuario tiene que tributar" : "El usuario no tiene que tributar";

        System.out.println(mensaje);
    }
}
