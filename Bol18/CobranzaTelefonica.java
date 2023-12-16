package boletin18;

import java.util.Scanner;

public class CobranzaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean realizarOtraLlamada = true;

        while (realizarOtraLlamada) {
            // Entrada de datos
            System.out.println("Introduce la duración de la llamada en minutos: ");
            int duracionLlamada = scanner.nextInt();

            System.out.println("Introduce el día de la semana (1: Domingo, 2-7: Lunes-Sábado): ");
            int diaSemana = scanner.nextInt();

            System.out.println("Introduce la franja horaria (1: Mañana, 2: Tarde): ");
            int franjaHoraria = scanner.nextInt();

            // Cálculos
            double costoLlamada = calcularCostoLlamada(duracionLlamada);
            double impuesto = calcularImpuesto(diaSemana, franjaHoraria);
            double costoTotal = costoLlamada + (costoLlamada * impuesto);

            // Salida de resultados
            System.out.println("COSTO DE LA LLAMADA: " + costoLlamada + " euros");
            System.out.println("IMPUESTO: " + (impuesto * 100) + "%");
            System.out.println("COSTO TOTAL: " + costoTotal + " euros");

            // Preguntar si desea realizar otra llamada
            System.out.println("¿Deseas realizar otra llamada? (s/n): ");
            String respuesta = scanner.next().toLowerCase();
            realizarOtraLlamada = respuesta.equals("s");
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    private static double calcularCostoLlamada(int duracionLlamada) {
        if (duracionLlamada <= 5) {
            return 1.0;
        } else if (duracionLlamada <= 8) {
            return 1.0 + (duracionLlamada - 5) * 0.8;
        } else if (duracionLlamada <= 10) {
            return 1.0 + 3 * 0.8 + (duracionLlamada - 8) * 0.7;
        } else {
            return 1.0 + 3 * 0.8 + 2 * 0.7 + (duracionLlamada - 10) * 0.5;
        }
    }

    private static double calcularImpuesto(int diaSemana, int franjaHoraria) {
        if (diaSemana == 1) {
            return 0.03; // Domingo
        } else {
            return (franjaHoraria == 1) ? 0.15 : 0.1; // Lunes-Sábado, Mañana, Tarde
        }
    }
}

