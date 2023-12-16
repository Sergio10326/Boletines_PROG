package boletin6;

public class Coche {
    private int velocidade ;
    public Coche() {
        velocidade = 0;
    }

    // Métodos
    public int getVelocidade() {
        return velocidade;
    }
    public void acelerar(int valor) {
        // Compruebo que la aceleracion (ha de ser positiva)
        if (valor > 0) {
            velocidade += valor;
        } else {
            System.out.println("El valor de aceleración tiene que ser mayor a cero");
        }
    }
    public void frenar(int menos) {
        // Verifica que el valor de frenado no haga que la velocidad sea negativa
        if (menos > 0 && velocidade - menos >= 0) {
            velocidade -= menos;
        } else {
            System.out.println("El valor de frenado debe ser positivo y no puede hacer que la velocidad sea negativa ya que entonces no habría un frenado, solo un cambio de sentido.");
        }
    }
}
