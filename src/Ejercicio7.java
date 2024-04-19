import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, edad;

        System.out.println("Ingrese su edad");
        edad = teclado.nextInt();

        System.out.println("Usted ha cumplido todos estos años:");
        for (i = 1; i <= edad; i++) {
            System.out.println(i);
        }

    }
}
