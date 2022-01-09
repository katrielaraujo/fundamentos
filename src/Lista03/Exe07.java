package Lista03;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomePessoas[] = new String[5];
        int idadePessoas[] = new int[5];
        int media = 0,maisNovo = 0,maisVelho = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Seu nome: ");
            nomePessoas[i] = input.next();
            System.out.println("Sua idade: ");
            idadePessoas[i] = input.nextInt();

            media += idadePessoas[i];

            if(idadePessoas[i] > idadePessoas[maisVelho]) maisVelho = i;

            if(idadePessoas[i] < idadePessoas[maisNovo]) maisNovo = i;
        }

        System.out.println("Idade media é "+media/5);
        System.out.println("Pessoa mais velha é "+nomePessoas[maisVelho]);
        System.out.println("Pessoa mais nova é "+nomePessoas[maisNovo]);

        input.close();
    }
}
