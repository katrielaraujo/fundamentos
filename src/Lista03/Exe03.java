package Lista03;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeros[] = new int[5];

        for(int i = 0; i < 5;i++) numeros[i] = input.nextInt();

        System.out.println("Impares:");
        for(int i = 0; i < 5;i+=2){
            if(numeros[i] % 2 != 0) System.out.println(numeros[i]);
        }

        System.out.println("Pares:");

        for(int i = 1; i < 5;i+=2){
            if(numeros[i] % 2 == 0) System.out.println(numeros[i]);
        }

        input.close();
    }
}
