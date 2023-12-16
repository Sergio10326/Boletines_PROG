package boletin7;

import java.util.Scanner;

public class Signo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo. Signo: +");
        } else if (numero < 0) {
            System.out.println("El número es negativo. Signo: -");
        } else {
            System.out.println("El número es cero. Signo: 0");
        }

        scanner.close();
    }
}

