package Cod3r.POO.encapsulamento.CasaB;

import Cod3r.POO.encapsulamento.CasaA.Ana;

public class Pedro extends Ana {
    Ana mae = new Ana();

    void testeAcessos(){
        System.out.println(formaDeFalar);
        System.out.println(mae.todosSabem);
    }
}
