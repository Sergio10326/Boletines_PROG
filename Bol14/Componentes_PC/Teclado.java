// Paquete "partes"
package partes;

public class Teclado {
    private String marca;
    private int numTeclas;

    // Constructor
    public Teclado(String marca, int numTeclas) {
        this.marca = marca;
        this.numTeclas = numTeclas;
    }

    // Método de acceso (getter)
    public String getMarca() {
        return marca;
    }
}

