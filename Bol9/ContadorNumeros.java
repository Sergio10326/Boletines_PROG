package boletin9;

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce el número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                cantidadNegativos++;
            } else if (numero > 0) {
                cantidadPositivos++;
            } else {
                cantidadCeros++;
            }
        }

        System.out.println("Cantidad de números negativos: " + cantidadNegativos);
        System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);

        scanner.close();
    }
}
