package Lista03;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String listaConvidados[] = new String[5];
        String maiorNome = "";


        for(int i = 0;i < 5;i++){
            listaConvidados[i] = input.nextLine();

            if(listaConvidados[i].length() > maiorNome.length()){
                maiorNome = listaConvidados[i];
            }
        }

        System.out.println("Maior nome é "+maiorNome);


        input.close();
    }
}
