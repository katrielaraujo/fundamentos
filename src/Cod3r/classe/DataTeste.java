package Cod3r.classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();

        Data d2 = new Data(1996,7,18);

        System.out.println(d1.obterDataFormatada());
        d2.imprimirDataFormatada();
    }
}
