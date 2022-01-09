package Lista02;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double polegada,cm = 2.54;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite as polegadas: ");
        polegada = input.nextDouble();
        System.out.printf("Em cintímetros: %.2f",polegada*cm);
        input.close();


    }
}
