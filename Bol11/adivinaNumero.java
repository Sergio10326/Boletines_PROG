package boletin11;

import javax.swing.JOptionPane;

public class adivinaNumero {

    public static void main(String[] args) {
        jugarAdivinanza();
    }

    public static void jugarAdivinanza() {
        // Generar un número aleatorio entre 1 y 50
        int numeroAAdivinar = (int) (Math.random() * 50) + 1;

        // Obtener el número máximo de intentos del primer jugador
        int intentosMaximos = obtenerNumeroIntentos();

        // Juego
        for (int intento = 1; intento <= intentosMaximos; intento++) {
            // Obtener el número introducido por el segundo jugador
            int numeroIntento = obtenerNumeroJugador();

            // Comparar con el número a adivinar
            if (numeroIntento == numeroAAdivinar) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado el número " + numeroAAdivinar +
                        " en el intento número " + intento + ".", "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
                break;  // Terminar el juego si el número es adivinado
            } else if (numeroIntento < numeroAAdivinar) {
                JOptionPane.showMessageDialog(null, "El número a adivinar es mayor. Intento " + intento + ".",
                        "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El número a adivinar es menor. Intento " + intento + ".",
                        "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
            }

            // Si se agotan los intentos, mostrar mensaje y terminar el juego
            if (intento == intentosMaximos) {
                JOptionPane.showMessageDialog(null, "¡Se agotaron los intentos! El número a adivinar era " + numeroAAdivinar + ".",
                        "Fin del Juego", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static int obtenerNumeroIntentos() {
        String input = JOptionPane.showInputDialog("Jugador 1: Introduce el número máximo de intentos:");
        return Integer.parseInt(input);
    }

    public static int obtenerNumeroJugador() {
        String input = JOptionPane.showInputDialog("Jugador 2: Adivina el número (entre 1 y 50):");
        return Integer.parseInt(input);
    }
}

