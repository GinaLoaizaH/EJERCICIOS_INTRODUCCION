public class Ejercicio5 {
    public static void main(String[] args) {


        int suma = 0, numero = 100;

        while (numero > 99 && numero < 201) {
            suma = suma + numero;
            numero++;
        }

        System.out.println("La suma de los números del 100 hasta el 200 es; " + suma);
    }
}
