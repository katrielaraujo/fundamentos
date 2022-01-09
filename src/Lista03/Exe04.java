package Lista03;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[5];
        int maior = 4,menor = 0;

        for(int i = 0; i < 5;i++) numeros[i] = input.nextInt();

        for(int i = 0; i < 5;i++){
            if(numeros[i] > numeros[maior]) maior = i;

            if(numeros[i] < numeros[menor]) menor = i;
        }

        System.out.println("Maior número: "+numeros[maior]);
        System.out.println("Menor número: "+numeros[menor]);

        input.close();
    }
}
