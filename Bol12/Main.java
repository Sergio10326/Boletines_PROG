package boletin12;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Garaxe garaxe = new Garaxe();

        while (true) {
            String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche (o 'salir' para salir): ");

            if (matricula.equals("salir")) {
                break;
            }

            String marca = JOptionPane.showInputDialog("Introduce a marca do coche: ");

            garaxe.aparcarCoche(matricula, marca);
        }
    }
}

