package boletin9;

public class SumaProductoNumeros {
    public static void main(String[] args) {
        int suma = 0;
        long producto = 1;

        for (int i = 10; i <= 90; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("La suma de los números entre 10 y 90 es: " + suma);
        System.out.println("El producto de los números entre 10 y 90 es: " + producto);
    }
}

