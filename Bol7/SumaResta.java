package boletin7;

import java.util.Scanner;

public class SumaResta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número (tipo short): ");
        short numero1 = scanner.nextShort();

        System.out.println("Introduce el segundo número (tipo short): ");
        short numero2 = scanner.nextShort();

        if (numero1 >= numero2) {
            short resta = (short) (numero1 - numero2);
            System.out.println("La resta de los dos números es: " + resta);
        } else {
            short suma = (short) (numero1 + numero2);
            System.out.println("La suma de los dos números es: " + suma);
        }

        scanner.close();
    }
}

