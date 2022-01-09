package Cod3r.POO.heranca.teste;

import Cod3r.POO.heranca.Direcao;
import Cod3r.POO.heranca.Heroi;
import Cod3r.POO.heranca.Monstro;
import jdk.swing.interop.SwingInterOpUtils;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10,11);

        System.out.println("Monstro tem => "+monstro.vida);
        System.out.println("Heroi tem => "+heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem => "+monstro.vida);
        System.out.println("Heroi tem => "+heroi.vida);
    }
}
