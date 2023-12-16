package boletin5;

public class Boletin5_1 {
    public static void main(String[] args) {
        Consumo consume = new Consumo();

        consume.setLitros(50);
        consume.setPGas(1.57f);

        Consumo consumo = new Consumo(250000, 500, 120, 20);

        System.out.println("Consumo medio: " + consumo.consumoMedio() + " litros por cada 100 km");
        consumo.setLitros(200);
        System.out.println("Velocidad media: " + consumo.getvMed() + " km/h");
    }
}

