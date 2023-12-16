package boletin8;

import java.util.Scanner;

public class Almacen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el nombre del artículo
        System.out.println("Introduce el nombre del artículo: ");
        String nombreArticulo = scanner.nextLine();

        // Obtener las ventas anuales
        System.out.println("Introduce las ventas anuales del artículo: ");
        int ventasAnuales = scanner.nextInt();

        // Determinar el tipo de artículo según las ventas anuales
        String tipoArticulo;

        if (ventasAnuales <= 100) {
            tipoArticulo = "Baixo";
        } else if (ventasAnuales > 100 && ventasAnuales <= 500) {
            tipoArticulo = "Medio";
        } else if (ventasAnuales > 500 && ventasAnuales <= 1000) {
            tipoArticulo = "Alto";
        } else {
            tipoArticulo = "Primeira necesidade";
        }

        // Mostrar el resultado
        System.out.println("O artigo " + nombreArticulo + " é de tipo: " + tipoArticulo);

        scanner.close();
    }
}
