package Cod3r.POO.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Go();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Celta c2 = new Celta();

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
}
