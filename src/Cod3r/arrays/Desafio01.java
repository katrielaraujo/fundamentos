package Cod3r.arrays;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de notas: ");
        int n = input.nextInt();
        double soma = 0.0;
        double notas[] = new double[n];

        for(int i = 0; i < n;i++){
            System.out.printf("Digita a %d° nota:\n",i+1);
            notas[i] = input.nextDouble();
        }

        for(double nota: notas){
            soma += nota;
        }

        System.out.printf("A média é %.2f",soma/n);

        input.close();
    }
}
