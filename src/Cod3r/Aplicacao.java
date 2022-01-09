package Cod3r;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Fulano",20,170,80.1,SexoEnum.MASCULINO);
        System.out.println(fulano.getNome());
        fulano.setNome("fulano Silva");
        System.out.println(fulano.getNome());


        Pessoa.quemSou();

        fulano.falar();


        System.out.println(fulano.toString());

    }
}
