package boletin5;

public class boletin5_1 {

    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    public Consumo() {}

    public Consumo(float km, float litros, float vMed, float pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public float getTempo() {
        return km / vMed;
    }

    public float getvMed() {
        return vMed;
    }

    // Setters
    public void setKms(float km) {
        this.km = km;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public void setVMed(float vMed) {
        this.vMed = vMed;
    }

    public void setPGas(float pGas) {
        this.pGas = pGas;
    }

    public float consumoMedio() {
        return (km / litros) * 100;
    }

    public float consumoEuros() {
        return (litros / pGas) / km * 100;
    }
}

