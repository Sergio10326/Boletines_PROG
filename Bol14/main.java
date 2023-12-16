// Paquete "boletin14"
package boletin14;

import partes.Monitor;
import partes.Teclado;
import partes.Procesador;

public class Principal {
    public static void main(String[] args) {
        // Crear instancias de las partes del ordenador
        Monitor monitor = new Monitor("Samsung", 24);
        Teclado teclado = new Teclado("Logitech", 104);
        Procesador procesador = new Procesador("Intel", 3.5);

        // Crear instancia del ordenador
        Ordenador ordenador = new Ordenador(monitor, teclado, procesador, 1200.0f);

        // Mostrar todas las características del ordenador
        ordenador.mostrarCaracteristicas();

        // Mostrar solo el precio del ordenador
        System.out.println("Precio del Ordenador: $" + ordenador.getPrecio());

        // Mostrar solo la marca del teclado
        System.out.println("Marca del Teclado: " + ordenador.getTe().getMarca());

        // Mostrar la velocidad de la CPU
        System.out.println("Velocidad de la CPU: " + ordenador.getPro().getVelocidad() + " GHz");
    }
}

