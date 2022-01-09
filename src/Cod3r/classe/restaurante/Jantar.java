package Cod3r.classe.restaurante;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        Comida c1 = new Comida("Risoto",0.170);
        Comida c2 = new Comida("Lasanha",0.150);

        p.comer(c1);
        System.out.println(p.peso);
        p.comer(c2);
        System.out.println(p.peso);
    }
}
