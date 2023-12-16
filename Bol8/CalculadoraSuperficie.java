package boletin8;

import java.util.Scanner;

public class CalculadoraSuperficie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            // Mostrar menú de opciones
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Calcular la superficie de un cuadrado");
            System.out.println("2. Calcular la superficie de un triángulo");
            System.out.println("3. Calcular la superficie de un círculo");
            System.out.println("0. Salir");

            // Obtener la opción del usuario
            System.out.println("Introduce la opción deseada: ");
            opcion = scanner.nextInt();

            // Realizar la operación correspondiente según la opción seleccionada
            switch (opcion) {
                case 1:
                    calcularSuperficieCuadrado();
                    break;
                case 2:
                    calcularSuperficieTriangulo();
                    break;
                case 3:
                    calcularSuperficieCirculo();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elige una opción válida.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void calcularSuperficieCuadrado() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        double superficie = lado * lado;
        System.out.println("La superficie del cuadrado es: " + superficie + " unidades cuadradas");
    }

    private static void calcularSuperficieTriangulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.println("Introduce la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double superficie = (base * altura) / 2;
        System.out.println("La superficie del triángulo es: " + superficie + " unidades cuadradas");
    }

    private static void calcularSuperficieCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();

        double superficie = Math.PI * Math.pow(radio, 2);
        System.out.println("La superficie del círculo es: " + superficie + " unidades cuadradas");
    }
}
