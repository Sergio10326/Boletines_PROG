package boletin11;

import javax.swing.JOptionPane;

public class adivinaNumPC {

    public static void main(String[] args) {
        jugarAdivinanzaOrdenador();
    }

    public static void jugarAdivinanzaOrdenador() {
        // Generar un número aleatorio entre 1 y 50
        int numeroAAdivinar = (int) (Math.random() * 50) + 1;

        // Juego
        while (true) {
            // Obtener el número introducido por el jugador
            int numeroIntento = obtenerNumeroJugador();

            // Calcular la distancia entre los números
            int distancia = Math.abs(numeroAAdivinar - numeroIntento);

            // Dar pistas sobre la distancia
            if (distancia > 20) {
                JOptionPane.showMessageDialog(null, "Muy lejos.", "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
            } else if (distancia >= 10 && distancia <= 20) {
                JOptionPane.showMessageDialog(null, "Lejos.", "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
            } else if (distancia > 5 && distancia < 10) {
                JOptionPane.showMessageDialog(null, "Cerca.", "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
            } else if (distancia <= 5) {
                JOptionPane.showMessageDialog(null, "Muy cerca.", "Adivinanza", JOptionPane.INFORMATION_MESSAGE);
                break;  // Terminar el juego si está muy cerca
            }

            // Mostrar el número a adivinar para facilitar la comprobación
            JOptionPane.showMessageDialog(null, "Número a adivinar: " + numeroAAdivinar, "Número a Adivinar",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static int obtenerNumeroJugador() {
        String input = JOptionPane.showInputDialog("Jugador: Adivina el número (entre 1 y 50):");
        return Integer.parseInt(input);
    }
}
