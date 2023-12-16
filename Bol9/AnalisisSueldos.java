package boletin9;

import java.util.Scanner;

public class AnalisisSueldos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int trabajadoresEntre1000y1750 = 0;
        int totalTrabajadores = 0;
        int trabajadoresMenosDe1000 = 0;

        // Solicitar sueldo de cada trabajador hasta que se ingrese un sueldo de 0
        double sueldo;
        do {
            System.out.println("Introduce el sueldo del trabajador (0 para terminar): ");
            sueldo = scanner.nextDouble();

            if (sueldo > 0) {
                totalTrabajadores++;

                if (sueldo >= 1000 && sueldo <= 1750) {
                    trabajadoresEntre1000y1750++;
                } else if (sueldo < 1000) {
                    trabajadoresMenosDe1000++;
                }
            }

        } while (sueldo != 0);

        // Calcular el porcentaje de trabajadores que ganan menos de 1000 €
        double porcentajeMenosDe1000 = (double) trabajadoresMenosDe1000 / totalTrabajadores * 100;

        // Mostrar resultados
        System.out.println("Número de trabajadores que ganan entre 1000 y 1750 €: " + trabajadoresEntre1000y1750);
        System.out.println("Porcentaje de trabajadores que ganan menos de 1000 €: " + porcentajeMenosDe1000 + "%");

        scanner.close();
    }
}

