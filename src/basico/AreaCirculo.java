package basico;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro salario: ");
        String s1 = input.nextLine();
        System.out.print("Informe o segundo salario: ");
        String s2 = input.nextLine();
        System.out.print("Informe o terceiro salario: ");
        String s3 = input.nextLine();

        double salario1 = Double.parseDouble(s1);
        double salario2 = Double.parseDouble(s2);
        double salario3 = Double.parseDouble(s3);

        double media = (salario1+salario2+salario3)/3;

        System.out.printf("\nSeu salário médio é %.2f",media);

        input.close();
    }
}
