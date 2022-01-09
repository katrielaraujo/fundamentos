package Lista02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double celsius,farenheit,m = (double) 9/5;
        Scanner input = new Scanner(System.in);

        System.out.println("Conversor de Celsius para Farenheit");
        System.out.println("Escreva uma temperatura em Celsius: ");
        celsius = input.nextDouble();

        farenheit = (celsius * m)+32;

        System.out.printf("Em Farenheit: %.2f",farenheit);

        input.close();
    }
}
