package boletin7;

import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el primer número
        System.out.println("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        // Obtener el segundo número
        System.out.println("Introduce el segundo número (distinto del primero): ");
        double numero2 = scanner.nextDouble();

        // Validar que el segundo número sea distinto del primero
        while (numero2 == numero1) {
            System.out.println("El segundo número debe ser distinto del primero. Introduce otro número: ");
            numero2 = scanner.nextDouble();
        }

        // Obtener el tercer número
        System.out.println("Introduce el tercer número (distinto de los anteriores): ");
        double numero3 = scanner.nextDouble();

        // Validar que el tercer número sea distinto de los anteriores
        while (numero3 == numero1 || numero3 == numero2) {
            System.out.println("El tercer número debe ser distinto de los anteriores. Introduce otro número: ");
            numero3 = scanner.nextDouble();
        }

        // Determinar el mayor de los tres números
        double mayor = Math.max(numero1, Math.max(numero2, numero3));

        System.out.println("El mayor número es: " + mayor);

        scanner.close();
    }
}

