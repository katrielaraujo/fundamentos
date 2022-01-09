package Lista03;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String carrinho[] = new String[5];

        for(int i = 0; i < 5;i++){
            carrinho[i] = input.next();
        }

        for(int i = 0; i < 5;i++){
            System.out.println(i+1+" "+carrinho[i]);
        }

        input.close();
    }
}
