package Cod3r.POO.encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcesso(){
        //System.out.println(esposa.segredo);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
//        segredo
//        facoDentroDeCasa; //default ou pacote
//        formaDeFalar
//        todosSabem
    }
}
