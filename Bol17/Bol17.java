package boletin17;

import java.util.Scanner;

public class CalculoNotaFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calcularOtraNota = true;

        while (calcularOtraNota) {
            // Entrada de datos
            System.out.println("Introduce la nota de las pruebas teóricas (proba1 proba2): ");
            double notaProbasTeoricas1 = scanner.nextDouble();
            double notaProbasTeoricas2 = scanner.nextDouble();

            System.out.println("Introduce la nota de la prueba práctica: ");
            double notaProbaPractica = scanner.nextDouble();

            System.out.println("Introduce el porcentaje de boletines completados: ");
            double porcentajeBoletins = scanner.nextDouble();

            // Cálculos
            double mediaProbasTeoricas = (notaProbasTeoricas1 + notaProbasTeoricas2) / 2;
            double cualificacionProbasTeoricas = mediaProbasTeoricas * 0.4;
            double cualificacionProbaPractica = notaProbaPractica * 0.4;

            double cualificacionBoletins;
            if (porcentajeBoletins > 90) {
                cualificacionBoletins = 2;
            } else if (porcentajeBoletins >= 70) {
                cualificacionBoletins = 1;
            } else {
                cualificacionBoletins = 0;
            }
            cualificacionBoletins *= 0.2;

            // Nota total
            double notaTotal = cualificacionProbasTeoricas + cualificacionProbaPractica + cualificacionBoletins;

            // Salida de resultados
            System.out.println("PROBAS TEÓRICAS: " + mediaProbasTeoricas);
            System.out.println("PROBAS PRÁCTICA: " + notaProbaPractica);
            System.out.println("BOLETÍNS: " + porcentajeBoletins + "%");
            System.out.println("NOTA TOTAL: " + notaTotal);

            // Preguntar si desea calcular otra nota
            System.out.println("¿Deseas calcular otra nota? (s/n): ");
            String respuesta = scanner.next().toLowerCase();
            calcularOtraNota = respuesta.equals("s");
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
