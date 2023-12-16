package boletin12;

import javax.swing.JOptionPane;

public class Garaxe {
    private static final int CAPACIDAD_GARAJE = 5;
    private static final double PRECIO_PRIMERAS_HORAS = 1.5;
    private static final double PRECIO_HORAS_ADICIONALES = 0.20;

    private int numeroCoches;
    private String[] matriculas;
    private String[] marcas;

    public Garaxe() {
        numeroCoches = 0;
        matriculas = new String[CAPACIDAD_GARAJE];
        marcas = new String[CAPACIDAD_GARAJE];
    }

    public void aparcarCoche(String matricula, String marca) {
        if (numeroCoches < CAPACIDAD_GARAJE) {
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES", "Aparcamiento", JOptionPane.INFORMATION_MESSAGE);

            matriculas[numeroCoches] = matricula;
            marcas[numeroCoches] = marca;
            numeroCoches++;

            mostrarFactura(matricula);
        } else {
            JOptionPane.showMessageDialog(null, "COMPLETO", "Aparcamiento", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void mostrarFactura(String matricula) {
        int horas = obtenerHorasEstacionado();
        double precio = calcularPrecio(horas);

        String factura = "FACTURA\n" +
                "MATRICULA COCHE: " + matricula + "\n" +
                "TIEMPO: " + horas + " horas\n" +
                "PRECIO: " + precio + " €\n" +
                "CARTOS RECIBIDOS: ";
        
        double cartosRecibidos = Double.parseDouble(JOptionPane.showInputDialog(factura));
        
        if (cartosRecibidos >= precio) {
            double cartosDevoltos = cartosRecibidos - precio;
            JOptionPane.showMessageDialog(null, "CARTOS DEVOLTOS: " + cartosDevoltos + " €\n\nGRACIAS POR USAR O NOSO APARCADOIRO",
                    "Cambio", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Non abondan cartos. Operación cancelada.",
                    "Cambio", JOptionPane.WARNING_MESSAGE);
        }
    }

    private int obtenerHorasEstacionado() {
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el tiempo estacionado (en horas):"));
    }

    private double calcularPrecio(int horas) {
        if (horas <= 3) {
            return PRECIO_PRIMERAS_HORAS;
        } else {
            return PRECIO_PRIMERAS_HORAS + (PRECIO_HORAS_ADICIONALES * (horas - 3));
        }
    }

    public static void main(String[] args) {
        Garaxe garaje = new Garaxe();

        // Ejemplo de uso: aparcar un coche
        garaje.aparcarCoche("123ABC", "Toyota");
    }
}
