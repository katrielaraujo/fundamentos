package Lista02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;

        System.out.println("Informa o primeiro número: ");
        a = input.nextInt();
        System.out.println("Informe o segundo número: ");
        b = input.nextInt();

        System.out.printf("%d + %d = %d",a,b,a+b);
        System.out.printf("\n%d - %d = %d",a,b,a-b);
        System.out.printf("\n%d * %d = %d",a,b,a*b);
        System.out.printf("\n%d / %d = %.2f",a,b,(double) a/b);

        input.close();
    }
}
