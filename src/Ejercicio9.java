import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double precioTotal, PRECIO_SILLA = 40000;
        int sillas;
        String mensaje = "";

        System.out.println("Ingrese el número de sillas que desea comprar");
        sillas = teclado.nextInt();

        if (sillas > 39) {
            precioTotal = (sillas * PRECIO_SILLA) - (sillas * PRECIO_SILLA) * 0.3;
            mensaje = "30% de descuento ";
        } else if (sillas > 11) {
            precioTotal = (sillas * PRECIO_SILLA) - (sillas * PRECIO_SILLA) * 0.2;
            mensaje = "20% de descuento ";
        } else if (sillas > 4) {
            precioTotal = (sillas * PRECIO_SILLA) - (sillas * PRECIO_SILLA) * 0.1;
            mensaje = "10% de descuento ";

        } else {
            precioTotal = sillas * PRECIO_SILLA;
            System.out.println("Su pedido no tiene descuento, el valor es: " + precioTotal);
        }

        System.out.println("El total de su pedido con el " + mensaje + "es: " + precioTotal);

    }
}
