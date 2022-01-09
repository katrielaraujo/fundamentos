package Cod3r.classe.restaurante;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(){
        nome = "João ninguém";
        peso = 64.8;
    }

    double comer(Comida food){
        this.peso += food.peso;
        return peso;
    }
}
