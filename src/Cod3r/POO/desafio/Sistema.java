package Cod3r.POO.desafio;

public class Sistema {
    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta",1,100);
        compra1.adicionarItem("Notebook",2000,2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caneta",10,10);
        compra2.adicionarItem("Impressora",1000,1);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
