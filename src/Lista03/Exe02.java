package Lista03;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra = input.nextLine();

        for(int i = palavra.length()-1; i > -1;i--) System.out.print(palavra.charAt(i));

        input.close();
    }
}
