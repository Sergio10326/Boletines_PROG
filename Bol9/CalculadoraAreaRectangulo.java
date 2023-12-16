package boletin9;

import java.util.Scanner;

public class CalculadoraAreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener la base del rectángulo
        double base;
        do {
            System.out.println("Introduce la base del rectángulo (debe ser positiva): ");
            base = scanner.nextDouble();
        } while (base <= 0);

        // Obtener la altura del rectángulo
        double altura;
        do {
            System.out.println("Introduce la altura del rectángulo (debe ser positiva): ");
            altura = scanner.nextDouble();
        } while (altura <= 0);

        // Calcular el área del rectángulo
        double area = base * altura;

        // Mostrar el resultado
        System.out.println("El área del rectángulo con base " + base + " y altura " + altura + " es: " + area);

        scanner.close();
    }
}

