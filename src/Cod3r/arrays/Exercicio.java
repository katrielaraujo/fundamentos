package Cod3r.arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double notasAlunos[] = new double[4];

        notasAlunos[0] = 7.9;
        notasAlunos[1] = 8;
        notasAlunos[2] = 6.7;
        notasAlunos[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunos));

        double total = 0;
        for(int i = 0; i < notasAlunos.length;i++){
            total += notasAlunos[i];
        }

        System.out.println(total/notasAlunos.length);
    }
}
