package Cod3r.classe;

public class Data {
    int ano;
    int mes;
    int dia;

    Data(){
//        ano = 1970;
//        mes = 1;
//        dia = 1;
          this(1970,1,1);
    }

    Data(int ano,int mes,int dia){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d",dia,mes,ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
