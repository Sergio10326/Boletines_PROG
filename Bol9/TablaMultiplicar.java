package boletin9;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            // Solicitar un número al usuario
            System.out.println("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            // Mostrar la tabla de multiplicar del número ingresado
            if (numero != 0) {
                mostrarTablaMultiplicar(numero);
            }

        } while (numero != 0);

        System.out.println("Programa finalizado.");

        scanner.close();
    }

    private static void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println(); // Línea en blanco para separar tablas
    }
}

