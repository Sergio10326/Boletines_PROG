// Paquete "partes"
package partes;

public class Procesador {
    private String marca;
    private double velocidad;

    // Constructor
    public Procesador(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    // Métodos de acceso (getters)
    public String getMarca() {
        return marca;
    }

    public double getVelocidad() {
        return velocidad;
    }
}

