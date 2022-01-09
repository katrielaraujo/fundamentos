package Cod3r.POO.heranca.desafio;

public class Celta extends Carro{

    public Celta(){
        this(315);
    }

    public Celta(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 350;
    }

//    @Override
//    public void acelerar() {
//        velocidadeAtual += 15;
//    }
}
