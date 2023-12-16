package boletin6;

public class main {
    public static void main(String[] args) {
        /*COCHE*/

        //Objeto creado a partir de la clase Coche
        Coche miCoche = new Coche();

        System.out.println("Velocidad inicial: " + miCoche.getVelocidade());

        miCoche.acelerar(50);
        System.out.println("Velocidad actual: " + miCoche.getVelocidade());

        miCoche.frenar(20);
        System.out.println("Velocidad al frenar: " + miCoche.getVelocidade());

        /*SATELITE*/

        //Objeto creado a partir de la clase Satelite
        Satelite satelite1 = new Satelite();
        satelite1.verPosicion();

        //Objeto creado de manera parametrizada
        Satelite satelite2 = new Satelite(45.0, -30.0, 15000.0);
        satelite2.verPosicion();

        /*CIRCULO*/

        //Objeto creado a partir de la clase Circulo
        Circulo circulo1 = new Circulo();

        circulo1.setRadio(5.0);

        //Crear un círculo con valores específicos
        Circulo circulo2 = new Circulo(3.0);

        //testeo del codigo
        System.out.println("Círculo 1:");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Longitud de la circunferencia: " + circulo1.calcularLonxitude());

        System.out.println("Círculo 2:");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Área: " + circulo2.calcularArea());
        System.out.println("Longitud de la circunferencia: " + circulo2.calcularLonxitude());
    }
}
