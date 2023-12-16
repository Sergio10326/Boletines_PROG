// Paquete "partes"
package partes;

public class Monitor {
    private String marca;
    private int pulgadas;

    // Constructor
    public Monitor(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    // Métodos de acceso (getters)
    public String getMarca() {
        return marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }
}
