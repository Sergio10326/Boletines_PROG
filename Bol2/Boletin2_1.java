import javax.swing.*;
import java.util.Random;

public class Boletin2_1 {

    private float base = 3;
    private float altura = 4;

    public void setVariables(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void areaCalc() {
        float area = base * altura / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    public void cambioED() {
        double cambio = 0.651;
        float euro = Float.parseFloat(JOptionPane.showInputDialog("¿Cuántos euros quieres cambiar a dólares?"));
        double resultado = cambio * euro;
        System.out.println("El resultado es " + resultado);
    }

    public void cambioMMetros() {
        float cambio = 1852;
        float millas = Float.parseFloat(JOptionPane.showInputDialog("Dame el número de millas que quieres cambiar a metros"));
        double resultado = cambio * millas;
        System.out.println("El resultado de pasar " + millas + " millas a metros es " + resultado);
    }

    public void jueguito() {
        Random random = new Random();
        int numero = random.nextInt(50) + 1;

        int numAdv = obtenerNumero("Número que quieres que adivine el otro jugador (entre 1 y 50):", 1, 50);
        int numIntentos = obtenerNumero("Número de intentos:", 1);

        int numAdvado = 100;

        int x = 1;
        while (numAdv != numAdvado && numIntentos != 0) {
            System.out.println("Adivina el número, tienes un total de " + numIntentos + " intentos");
            numAdvado = obtenerNumero("Número que crees que es:");
            numIntentos--;

            if (numAdv == numAdvado)
                x = 0;
        }

        if (x != 1)
            System.out.println("¡Felicidades, lo has adivinado!");
        else
            System.out.println("Mala suerte, no has conseguido adivinar un número");
    }

    private int obtenerNumero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    private int obtenerNumero(String mensaje, int min, int max) {
        int numero = obtenerNumero(mensaje);
        while (numero < min || numero > max) {
            numero = obtenerNumero(mensaje);
        }
        return numero;
    }
}

