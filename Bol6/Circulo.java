package boletin6;

public class Circulo {
    // Atributos
    private double radio;
    private final double Pi = 3.14;

    // Constructores
    // Constructor por defecto
    public Circulo() {
        radio = 0.0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Métodos de acceso
    //Getter
    public double getRadio() {
        return radio;
    }
    //Setter
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos
    public double calcularArea() {
        return Pi * Math.pow(radio, 2);
    }

    public double calcularLonxitude() {
        return 2 * Pi * radio;
    }
}
