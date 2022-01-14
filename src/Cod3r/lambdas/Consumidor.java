package Cod3r.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static void main(String[] args) {
        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome+" !!!");

        Produto p1 = new Produto("Caneta",12.34,0.09);
        imprimir.accept(p1);

        Produto p2 = new Produto("Notebook",2987.99,0.25);
        Produto p3 = new Produto("Caderno",19.90,0.03);
        Produto p4 = new Produto("Borracha",7.80,0.18);
        Produto p5 = new Produto("Lapis",4.39,0.19);



        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        System.out.println(RED+"\u274e");
        System.out.println(GREEN+"\u2714"+YELLOW);
        System.out.println("\u26f5"+CYAN);
        System.out.println("\uf506");
        String testewordRed = RED+"\u274e";
        String testewordGreen = RED+"\u274e";
        System.out.println(testewordRed.equals(testewordGreen));
    }
}
