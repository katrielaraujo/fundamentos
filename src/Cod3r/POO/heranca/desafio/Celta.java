package Cod3r.POO.heranca.desafio;

public class Celta extends Carro implements Esportivo,Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

    public Celta(){
        this(315);
    }

    public Celta(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        }else if(ligarTurbo && ligarAr){
            return 30;
        }else {
            return 15;
        }
    }

    //    @Override
//    public void acelerar() {
//        velocidadeAtual += 15;
//    }
}
