package Cod3r.POO.heranca.teste;

import Cod3r.POO.heranca.desafio.Carro;
import Cod3r.POO.heranca.desafio.Celta;
import Cod3r.POO.heranca.desafio.Go;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Go();

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        Celta c2 = new Celta(400);
        //c2.ligarTurbo();
        c2.ligarAr();

        c2.acelerar();
        c2.frear();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
}
