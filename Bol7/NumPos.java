package boletin7;

import java.util.Scanner;

public class NumPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo.");
        } else {
            System.out.println("El número " + numero + " no es positivo.");
        }

        scanner.close();
    }
}


