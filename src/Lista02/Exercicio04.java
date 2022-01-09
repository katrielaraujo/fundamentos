package Lista02;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double real,dolar;

        Scanner input = new Scanner(System.in);

        System.out.println("Converso para Dolar");
        System.out.println("Digite a cotação do dolar US: ");
        dolar = input.nextDouble();
        System.out.println("Digite seu valor em real R$:");
        real = input.nextDouble();

        System.out.printf("Em Dolar: %.2f US$",real/dolar);

        input.close();
    }
}
