import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char calificacion;

        System.out.println("Ingrese la calificación de la 'A' a la 'F': ");
        calificacion = teclado.next().charAt(0);

        calificacion = Character.toUpperCase(calificacion);

        switch (calificacion) {

            case 'A':
                System.out.println("Felicitaciones, sacaste la máxima calificación");
                break;
            case 'B':
                System.out.println("Muy bien, sacaste sobresaliente");
                break;
            case 'C':
                System.out.println("Pasaste pero puedes mejorar");
                break;
            case 'D':
                System.out.println("Regular, esfuerzate un poco más");
                break;
            case 'E':
                System.out.println("Reprobado, estudia más");
                break;
            case 'F':
                System.out.println("Reprobado, rendimiento deficiente");
                break;

            default:
                System.out.println("Ingrese una nota valida");
                break;
        }


    }
}
