package Lista03;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomePessoas[] = new String[5];
        double pesoPessoas[] = new double[5];
        double alturaPessoas[] = new double[5];
        double imcPessoas[] = new double[5];

        for(int i = 0; i < 5;i++){
            System.out.println("Digite seu nome:");
            nomePessoas[i] = input.next();
            System.out.println("Digite sua altura:");
            alturaPessoas[i] = input.nextDouble();
            System.out.println("Digite seu peso:");
            pesoPessoas[i] = input.nextDouble();

            imcPessoas[i] = pesoPessoas[i]/Math.pow(alturaPessoas[i],2);
        }

        for(int i = 0; i < 5;i++){
            if(imcPessoas[i] <= 18.5 || imcPessoas[i] >= 25) System.out.printf("%s está fora do peso ideal%n",nomePessoas[i]);
        }

        input.close();
    }
}
