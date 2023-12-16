package boletin7;

import java.util.Scanner;

public class CompPeso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Persona 1
        System.out.println("Introduce el nombre de la primera persona: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Introduce el peso de " + nombre1 + " (en kg): ");
        double peso1 = scanner.nextDouble();

        // Persona 2
        System.out.println("Introduce el nombre de la segunda persona: ");
        scanner.nextLine(); // Consumir el salto de línea pendiente
        String nombre2 = scanner.nextLine();
        System.out.println("Introduce el peso de " + nombre2 + " (en kg): ");
        double peso2 = scanner.nextDouble();

        // Comparación de pesos
        if (peso1 > peso2) {
            System.out.println(nombre1 + " pesa más que " + nombre2 + ". Diferencia de peso: " + (peso1 - peso2) + " kg");
        } else if (peso1 < peso2) {
            System.out.println(nombre2 + " pesa más que " + nombre1 + ". Diferencia de peso: " + (peso2 - peso1) + " kg");
        } else {
            System.out.println(nombre1 + " y " + nombre2 + " pesan lo mismo.");
        }

        scanner.close();
    }
}

