package boletin18;

import java.util.Scanner;

public class CobranzaTransporte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Introduce el peso del paquete en kilogramos: ");
        double pesoPaquete = scanner.nextDouble();

        System.out.println("Introduce la zona de destino (1-5): ");
        int zonaDestino = scanner.nextInt();

        // Cálculos
        double costoPorKilogramo = calcularCostoPorKilogramo(zonaDestino);

        if (pesoPaquete <= 5) {
            double costoTotal = pesoPaquete * costoPorKilogramo;
            System.out.println("COSTO DE LA ENTREGA: " + costoTotal + " euros");
        } else {
            System.out.println("El paquete no puede ser transportado debido a su peso excesivo.");
        }

        scanner.close();
    }

    private static double calcularCostoPorKilogramo(int zonaDestino) {
        switch (zonaDestino) {
            case 1:
                return 24.00;
            case 2:
                return 20.00;
            case 3:
                return 21.00;
            case 4:
                return 10.00;
            case 5:
                return 18.00;
            default:
                System.out.println("Zona de destino no válida.");
                return 0.00;
        }
    }
}
