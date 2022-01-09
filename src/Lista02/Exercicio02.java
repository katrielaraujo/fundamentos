package Lista02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Digite um número para ver a sua tabuada: ");
        n = input.nextInt();

        for(int i = 1; i <= 10;i++){
            System.out.printf("%d x %d = %d\n",i,n,i * n);
        }

        input.close();
    }
}
