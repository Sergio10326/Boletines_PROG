package boletin14;

// Paquete "boletin14"
package boletin14;

import partes.Monitor;
import partes.Teclado;
import partes.Procesador;

public class Ordenador {
    private Monitor mo;
    private Teclado te;
    private Procesador pro;
    private float precio;

    // Constructor
    public Ordenador(Monitor monitor, Teclado teclado, Procesador procesador, float precio) {
        this.mo = monitor;
        this.te = teclado;
        this.pro = procesador;
        this.precio = precio;
    }

    // Métodos de acceso (getters)
    public Monitor getMo() {
        return mo;
    }

    public Teclado getTe() {
        return te;
    }

    public Procesador getPro() {
        return pro;
    }

    public float getPrecio() {
        return precio;
    }

    // Método principal para mostrar todas las características del ordenador
    public void mostrarCaracteristicas() {
        System.out.println("Características del Ordenador:");
        System.out.println("Monitor: Marca - " + mo.getMarca() + ", Pulgadas - " + mo.getPulgadas());
        System.out.println("Teclado: Marca - " + te.getMarca() + ", Número de Teclas - " + te.getNumTeclas());
        System.out.println("Procesador: Marca - " + pro.getMarca() + ", Velocidad - " + pro.getVelocidad() + " GHz");
        System.out.println("Precio: $" + precio);
    }
}
