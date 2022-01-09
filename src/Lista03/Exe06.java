package Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String palavra1 = input.next();
        String palavra2 = "";

        for(int i = 0;i < palavra1.length();i++){
            if(i % 2 != 0){
                palavra2 += palavra1.toUpperCase().charAt(i);
            }else{
                palavra2 += palavra1.charAt(i);
            }
        }

        System.out.println(palavra2);

        input.close();
    }
}
